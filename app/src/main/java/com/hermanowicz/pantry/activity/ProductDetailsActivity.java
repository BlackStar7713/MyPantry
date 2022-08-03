/*
 * Copyright (c) 2019-2022
 * Mateusz Hermanowicz - All rights reserved.
 * My Pantry
 * https://www.mypantry.eu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hermanowicz.pantry.activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.annotations.NotNull;
import com.hermanowicz.pantry.R;
import com.hermanowicz.pantry.databinding.ActivityProductDetailsBinding;
import com.hermanowicz.pantry.db.photo.Photo;
import com.hermanowicz.pantry.db.product.Product;
import com.hermanowicz.pantry.interfaces.ProductDetailsView;
import com.hermanowicz.pantry.model.GroupProducts;
import com.hermanowicz.pantry.presenter.ProductDetailsPresenter;
import com.hermanowicz.pantry.util.DateHelper;
import com.hermanowicz.pantry.util.Orientation;
import com.hermanowicz.pantry.util.PremiumAccess;
import com.hermanowicz.pantry.util.ThemeMode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.observers.DisposableObserver;
import io.reactivex.rxjava3.schedulers.Schedulers;
import maes.tech.intentanim.CustomIntent;

/**
 * <h1>ProductDetailsActivity</h1>
 * Activity with details of product. Is opened after choose a product in MyPantryActivity or after
 * scanning the QR code of product.
 *
 * @author Mateusz Hermanowicz
 */

public class ProductDetailsActivity extends AppCompatActivity implements ProductDetailsView {

    private final String TAG = "PhotosRxJava";

    private ProductDetailsPresenter presenter;
    private Context context;
    private final CompositeDisposable disposables = new CompositeDisposable();

    private ImageView photoIv;
    private TextView productName;
    private TextView productType;
    private TextView productCategory;
    private TextView productStorageLocation;
    private TextView productExpirationDate;
    private TextView productProductionDate;
    private TextView productComposition;
    private TextView productHealingProperties;
    private TextView productDosage;
    private TextView productVolume;
    private TextView productWeight;
    private TextView productQuantity;
    private TextView productHasSugar;
    private TextView productHasSalt;
    private TextView productIsVege;
    private TextView productIsBio;
    private TextView productTaste;
    private Button deleteProduct;
    private Button printQrCode;
    private Button addBarcode;
    private Button addPhoto;
    private Button editProduct;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(ThemeMode.getThemeMode(this));
        if (Orientation.isTablet(this))
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
        super.onCreate(savedInstanceState);
        initView();
        setListeners();
        setPhotoListObserver();
    }

    private void initView() {
        ActivityProductDetailsBinding binding = ActivityProductDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        context = getApplicationContext();

        Toolbar toolbar = binding.toolbar;
        photoIv = binding.imageviewPhoto;
        productName = binding.textProductName;
        productType = binding.textProductTypeValue;
        productCategory = binding.textProductCategoryValue;
        productStorageLocation = binding.textProductStorageLocationValue;
        productExpirationDate = binding.textProductExpirationDateValue;
        productProductionDate = binding.textProductProductionDateValue;
        productComposition = binding.textProductCompositionValue;
        productHealingProperties = binding.textProductHealingPropertiesValue;
        productDosage = binding.textProductDosageValue;
        productVolume = binding.textProductVolumeValue;
        productWeight = binding.textProductWeightValue;
        productQuantity = binding.textQuantityValue;
        productHasSugar = binding.textProductHasSugarValue;
        productHasSalt = binding.textProductHasSaltValue;
        productIsBio = binding.textProductIsBioValue;
        productIsVege = binding.textProductIsVegeValue;
        productTaste = binding.textProductTasteValue;
        deleteProduct = binding.buttonDeleteProduct;
        printQrCode = binding.buttonPrintQRCode;
        editProduct = binding.buttonEditProduct;
        addBarcode = binding.buttonAddBarcode;
        addPhoto = binding.buttonAddPhoto;

        setSupportActionBar(toolbar);
        toolbar.setTitle("");

        presenter = new ProductDetailsPresenter(this, this);
        presenter.setPremiumAccess(new PremiumAccess(context));


        Intent intent = getIntent();
        ArrayList<Product> productList = intent.getParcelableArrayListExtra("product_list");
        ArrayList<Product> allProductList = intent.getParcelableArrayListExtra("all_product_list");

        presenter.setAllProductList(allProductList);
        presenter.setProductList(productList);
        int productId = intent.getIntExtra("product_id", 1);
        String hashCode = intent.getStringExtra("hash_code");
        presenter.setProductId(productId);
        presenter.setHashCode(hashCode);

        if (presenter.isOfflineDb())
            presenter.showProductDetails();
    }

    private void setListeners() {
        addBarcode.setOnClickListener(view -> presenter.onClickAddBarcode());
        deleteProduct.setOnClickListener(view -> presenter.onClickDeleteProduct());
        printQrCode.setOnClickListener(view -> presenter.onClickPrintQRCodes());
        editProduct.setOnClickListener(view -> presenter.onClickEditProduct());
        addPhoto.setOnClickListener(view -> presenter.onClickTakePhoto());
    }

    private void setPhotoListObserver() {
        if (!presenter.isOfflineDb()) {
            disposables.add(photoList()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeWith(new DisposableObserver<List<Photo>>() {
                        @Override
                        public void onComplete() {
                            Log.d(TAG, "onComplete()");
                        }

                        @Override
                        public void onError(@NonNull Throwable e) {
                            Log.e(TAG, "onError()", e);
                        }

                        @Override
                        public void onNext(@NonNull List<Photo> photoList) {
                            Log.i(TAG, "onNext()");
                        }
                    }));
        }
    }

    private Observable<List<Photo>> photoList() {
        return Observable.create(emitter -> {
            String user = FirebaseAuth.getInstance().getUid();
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            assert user != null;
            Query query = database.getReference().child("photos").child(user);
            query.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    ArrayList<Photo> list = new ArrayList<>();
                    Iterable<DataSnapshot> snapshotIterable = snapshot.getChildren();

                    for (DataSnapshot dataSnapshot : snapshotIterable) {
                        Photo photo = dataSnapshot.getValue(Photo.class);
                        list.add(photo);
                    }
                    emitter.onNext(list);
                    onPhotoResponse(list);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    emitter.onError(new FirebaseException(error.getMessage()));
                }
            });
        });
    }

    @Override
    public void showProductDetails(@NotNull GroupProducts groupProducts) {
        DateHelper dateHelper = new DateHelper(groupProducts.getProduct().getExpirationDate());
        Product product = groupProducts.getProduct();
        int quantity = groupProducts.getQuantity();

        productName.setText(product.getName());
        productType.setText(product.getTypeOfProduct());
        if (product.getStorageLocation().equals("null"))
            productStorageLocation.setText(R.string.ProductDetailsActivity_not_set);
        else
            productStorageLocation.setText(product.getStorageLocation());
        productQuantity.setText(String.valueOf(quantity));
        if (!product.getProductFeatures().equals("null"))
            productCategory.setText(product.getProductFeatures());
        productExpirationDate.setText(dateHelper.getDateInLocalFormat());
        dateHelper = new DateHelper(product.getProductionDate());
        productProductionDate.setText(dateHelper.getDateInLocalFormat());
        productComposition.setText(product.getComposition());
        productHealingProperties.setText(product.getHealingProperties());
        productDosage.setText(product.getDosage());
        productVolume.setText(String.format("%s%s", product.getVolume(), getString(R.string.Product_volume_unit)));
        productWeight.setText(String.format("%s%s", product.getWeight(), getString(R.string.Product_weight_unit)));
        productTaste.setText(product.getTaste());
        if (product.getHasSugar())
            productHasSugar.setText(getString(R.string.ProductDetailsActivity_yes));
        if (product.getHasSalt())
            productHasSalt.setText(getString(R.string.ProductDetailsActivity_yes));
        if (product.getIsBio())
            productIsBio.setText(getString(R.string.ProductDetailsActivity_yes));
        if (product.getIsVege())
            productIsVege.setText(getString(R.string.ProductDetailsActivity_yes));
    }

    @Override
    public void showPhoto(Bitmap photo) {
        photoIv.setImageBitmap(photo);
    }

    @Override
    public void showErrorWrongData() {
        Toast.makeText(context, getString(R.string.Error_wrong_data), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDeletedProduct() {
        Toast.makeText(context, getString(R.string.ProductDetailsActivity_product_has_been_removed), Toast.LENGTH_LONG).show();
    }

    @Override
    public void showDialogOnDeleteProduct() {
        new AlertDialog.Builder(new ContextThemeWrapper(ProductDetailsActivity.this, R.style.AppThemeDialog))
                .setMessage(R.string.ProductDetailsActivity_delete_one_or_all)
                .setPositiveButton(getString(R.string.ProductDetailsActivity_delete_similar_products), (dialog, which) ->
                        presenter.onConfirmDeleteSimilarProducts())
                .setNegativeButton(getString(R.string.ProductDetailsActivity_delete_single_product), (dialog, which) ->
                        presenter.onConfirmDeleteSingleProduct())
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    @Override
    public void navigateToPrintQRCodeActivity(@NonNull ArrayList<Product> productList, ArrayList<Product> allProductList) {
        Intent intent = new Intent(context, PrintQRCodesActivity.class)
                .putExtra("product_list", (Serializable) productList)
                .putExtra("all_product_list", (Serializable) allProductList);
        startActivity(intent);
        CustomIntent.customType(this, "fadein-to-fadeout");
    }

    @Override
    public void navigateToEditProductActivity(int productId, List<Product> productList, List<Product> allProductList) {
        Intent intent = new Intent(context, EditProductActivity.class)
                .putExtra("product_id", productId)
                .putExtra("product_list", (Serializable) productList)
                .putExtra("all_product_list", (Serializable) allProductList);
        startActivity(intent);
        CustomIntent.customType(this, "fadein-to-fadeout");
    }

    @Override
    public void navigateToMyPantryActivity() {
        Intent intent = new Intent(context, MyPantryActivity.class);
        startActivity(intent);
        CustomIntent.customType(this, "fadein-to-fadeout");
    }

    @Override
    public void navigateToAddPhotoActivity(ArrayList<Product> productList) {
        Intent intent = new Intent(context, AddPhotoActivity.class)
                .putParcelableArrayListExtra("product_list", productList);
        startActivity(intent);
        CustomIntent.customType(this, "fadein-to-fadeout");
    }

    @Override
    public void navigateToScanProductActivity(ArrayList<Product> productList) {
        Intent intent = new Intent(context, ScanProductActivity.class)
                .putParcelableArrayListExtra("product_list_to_add_barcode", productList);
        startActivity(intent);
        CustomIntent.customType(this, "fadein-to-fadeout");
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.product_details_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_take_photo) {
            presenter.onClickTakePhoto();
            return true;
        } else if (id == R.id.action_print_codes) {
            presenter.onClickPrintQRCodes();
            return true;
        } else if (id == R.id.action_edit_product) {
            presenter.onClickEditProduct();
            return true;
        } else if (id == R.id.action_add_barcode) {
            presenter.onClickAddBarcode();
            return true;
        } else if (id == R.id.action_delete_product) {
            presenter.onClickDeleteProduct();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public void onPhotoResponse(ArrayList<Photo> photoList) {
        presenter.setPhotoList(photoList);
        presenter.showProductDetails();
    }

    @Override
    public boolean onKeyDown(int keyCode, @NonNull KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            presenter.navigateToMyPantryActivity();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void finish() {
        super.finish();
        CustomIntent.customType(this, "fadein-to-fadeout");
    }
}