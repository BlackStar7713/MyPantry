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
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.hermanowicz.pantry.R;
import com.hermanowicz.pantry.databinding.MyPantryDrawerLayoutBinding;
import com.hermanowicz.pantry.db.category.Category;
import com.hermanowicz.pantry.db.product.Product;
import com.hermanowicz.pantry.dialog.ExpirationDateFilterDialog;
import com.hermanowicz.pantry.dialog.NameFilterDialog;
import com.hermanowicz.pantry.dialog.ProductFeaturesFilterDialog;
import com.hermanowicz.pantry.dialog.ProductionDateFilterDialog;
import com.hermanowicz.pantry.dialog.TasteFilterDialog;
import com.hermanowicz.pantry.dialog.TypeOfProductFilterDialog;
import com.hermanowicz.pantry.dialog.VolumeFilterDialog;
import com.hermanowicz.pantry.dialog.WeightFilterDialog;
import com.hermanowicz.pantry.filter.Filter;
import com.hermanowicz.pantry.interfaces.DeleteProductsDialogListener;
import com.hermanowicz.pantry.interfaces.FilterDialogListener;
import com.hermanowicz.pantry.interfaces.MyPantryView;
import com.hermanowicz.pantry.model.GroupProducts;
import com.hermanowicz.pantry.presenter.MyPantryPresenter;
import com.hermanowicz.pantry.util.Notification;
import com.hermanowicz.pantry.util.Orientation;
import com.hermanowicz.pantry.util.PremiumAccess;
import com.hermanowicz.pantry.util.ProductsAdapter;
import com.hermanowicz.pantry.util.RecyclerClickListener;
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
 * <h1>MyPantryActivity</h1>
 * Activity for My Pantry. In this activity is available the list view with products from database.
 * The user can filter search results using product attributes. After a long click on the product, the multiselect mode is activated.
 *
 * @author Mateusz Hermanowicz
 */

public class MyPantryActivity extends AppCompatActivity implements MyPantryView, FilterDialogListener,
        DeleteProductsDialogListener {

    private final String CATEGORY_TAG = "CategoriesRxJava";
    private final String PRODUCTS_TAG = "ProductsRxJava";

    private MyPantryPresenter presenter;
    private Context context;
    private ActionMode actionMode;
    private ProductsAdapter adapterProductRecyclerView;
    private final CompositeDisposable productsDisposables = new CompositeDisposable();
    private final CompositeDisposable categoriesDisposables = new CompositeDisposable();

    private RecyclerView productRecyclerView;
    private NavigationView navView;
    private TextView statement;
    private ContentLoadingProgressBar loadingBar;
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(ThemeMode.getThemeMode(this));
        if (Orientation.isTablet(this))
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
        super.onCreate(savedInstanceState);
        initView();
        setListeners();
        setObservers();
    }

    private void initView() {
        com.hermanowicz.pantry.databinding.MyPantryDrawerLayoutBinding binding = MyPantryDrawerLayoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        context = getApplicationContext();
        presenter = new MyPantryPresenter(this, context);
        presenter.setPremiumAccess(new PremiumAccess(context));


        loadingBar = binding.include.loadingBar;
        productRecyclerView = binding.include.recyclerviewProducts;
        navView = binding.navView;
        statement = binding.include.textStatement;
        drawerLayout = binding.drawerLayout;
        toolbar = binding.include.toolbar;

        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);
        }
        if (presenter.isOfflineDb()) {
            presenter.setAllProductsOfflineList();
            presenter.setProductsLiveData();
            presenter.getProductLiveData().observe(this, productList -> presenter.setProductList(productList));
        }

        adapterProductRecyclerView = new ProductsAdapter(PreferenceManager.getDefaultSharedPreferences(context));
        adapterProductRecyclerView.setData(presenter.getGroupProductsList());
        productRecyclerView.setAdapter(adapterProductRecyclerView);
        adapterProductRecyclerView.notifyDataSetChanged();
        productRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        productRecyclerView.setHasFixedSize(true);
        productRecyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    private void setListeners() {
        productRecyclerView.addOnItemTouchListener(new RecyclerClickListener(this, productRecyclerView, new RecyclerClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if (presenter.getIsMultiSelect())
                    multiSelect(position);
                else {
                    List<GroupProducts> groupProductsList = presenter.getGroupProductsList();
                    List<Product> productList = presenter.getProductList();
                    List<Product> allProductList = presenter.getAllProductList();
                    Intent productDetailsActivityIntent = new Intent(context, ProductDetailsActivity.class)
                            .putExtra("all_product_list", (Serializable) allProductList)
                            .putExtra("product_list", (Serializable) productList)
                            .putExtra("product_id", groupProductsList.get(position).getProduct().getId())
                            .putExtra("hash_code", groupProductsList.get(position).getProduct().getHashCode());
                    startActivity(productDetailsActivityIntent);
                    CustomIntent.customType(view.getContext(), "fadein-to-fadeout");
                }
            }

            @Override
            public void onItemLongClick(View view, int position) {
                if (!presenter.getIsMultiSelect()) {
                    presenter.clearMultiSelectList();
                    presenter.setIsMultiSelect(true);
                    if (actionMode == null) {
                        actionMode = startActionMode(actionModeCallback);
                    }
                }
                multiSelect(position);
            }
        }));

        navView.setNavigationItemSelectedListener(
                menuItem -> {
                    int typeOfDialog = menuItem.getItemId();
                    if (typeOfDialog == R.id.filter_clear) {
                        presenter.clearFilters();
                    } else {
                        presenter.openDialog(typeOfDialog);
                    }
                    drawerLayout.closeDrawers();
                    return true;
                });
    }

    private void setObservers() {
        if (!presenter.isOfflineDb()) {
            categoriesDisposables.add(categoryList()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeWith(new DisposableObserver<List<Category>>() {
                        @Override
                        public void onComplete() {
                            Log.d(CATEGORY_TAG, "onComplete()");
                        }

                        @Override
                        public void onError(@NonNull Throwable e) {
                            Log.e(CATEGORY_TAG, "onError()", e);
                        }

                        @Override
                        public void onNext(@NonNull List<Category> categoryList) {
                            Log.i(CATEGORY_TAG, "onNext()");
                        }
                    }));

            productsDisposables.add(productList()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeWith(new DisposableObserver<List<Product>>() {
                        @Override
                        public void onComplete() {
                            Log.d(PRODUCTS_TAG, "onComplete()");
                        }

                        @Override
                        public void onError(@NonNull Throwable e) {
                            Log.e(PRODUCTS_TAG, "onError()", e);
                        }

                        @Override
                        public void onNext(@NonNull List<Product> productList) {
                            Log.i(PRODUCTS_TAG, "onNext()");
                        }
                    }));
        }
    }

    private Observable<List<Category>> categoryList() {
        return Observable.create(emitter -> {
            String user = FirebaseAuth.getInstance().getUid();
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            assert user != null;
            Query query = database.getReference().child("categories").child(user);
            query.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    List<Category> list = new ArrayList<>();
                    Iterable<DataSnapshot> snapshotIterable = snapshot.getChildren();

                    for (DataSnapshot dataSnapshot : snapshotIterable) {
                        Category category = dataSnapshot.getValue(Category.class);
                        list.add(category);
                    }
                    emitter.onNext(list);
                    onCategoryResponse(list);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    emitter.onError(new FirebaseException(error.getMessage()));
                }
            });
        });
    }

    private Observable<List<Product>> productList() {
        return Observable.create(emitter -> {
            String user = FirebaseAuth.getInstance().getUid();
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            assert user != null;
            Query query = database.getReference().child("products").child(user);
            query.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    List<Product> list = new ArrayList<>();
                    Iterable<DataSnapshot> snapshotIterable = snapshot.getChildren();

                    for (DataSnapshot dataSnapshot : snapshotIterable) {
                        Product product = dataSnapshot.getValue(Product.class);
                        list.add(product);
                    }
                    emitter.onNext(list);
                    onProductResponse(list);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    emitter.onError(new FirebaseException(error.getMessage()));
                }
            });
        });
    }

    private void multiSelect(int position) {
        if (!presenter.getIsMultiSelect())
            toolbar.startActionMode(actionModeCallback);
        if (actionMode != null) {
            presenter.addMultiSelectProduct(position);
            if (presenter.getGroupsProductsSelectList().size() == 0)
                actionMode.finish();
            else
                actionMode.setTitle(String.valueOf(presenter.getGroupsProductsSelectList().size()));
        }
        updateSelectsRecyclerViewAdapter();
    }

    private AppCompatDialogFragment createDialog(int typeOfDialog) {
        AppCompatDialogFragment dialog = null;
        if (typeOfDialog == R.id.filter_name) {
            dialog = new NameFilterDialog(presenter.getFilterProduct());
        } else if (typeOfDialog == R.id.filter_expiration_date) {
            dialog = new ExpirationDateFilterDialog(presenter.getFilterProduct());
        } else if (typeOfDialog == R.id.filter_production_date) {
            dialog = new ProductionDateFilterDialog(presenter.getFilterProduct());
        } else if (typeOfDialog == R.id.filter_product_type) {
            dialog = new TypeOfProductFilterDialog(presenter.getFilterProduct(), presenter.getAllCategoryNameList());
        } else if (typeOfDialog == R.id.filter_volume) {
            dialog = new VolumeFilterDialog(presenter.getFilterProduct());
        } else if (typeOfDialog == R.id.filter_weight) {
            dialog = new WeightFilterDialog(presenter.getFilterProduct());
        } else if (typeOfDialog == R.id.filter_taste) {
            dialog = new TasteFilterDialog(presenter.getFilterProduct());
        } else if (typeOfDialog == R.id.filter_product_features) {
            dialog = new ProductFeaturesFilterDialog(presenter.getFilterProduct());
        }
        return dialog;
    }

    public void showDialogDeleteProducts() {
        new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AppThemeDialog))
                .setMessage(R.string.MyPantryActivity_do_you_want_to_delete_products)
                .setPositiveButton(android.R.string.yes, (dialog, which) -> presenter.deleteSelectedProducts())
                .setNegativeButton(android.R.string.no, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    @Override
    public void openFilterDialog(int typeOfDialog) {
        createDialog(typeOfDialog).show(getSupportFragmentManager(), "");
    }

    @Override
    public void setFilterIcon(int position) {
        navView.getMenu().getItem(position).setIcon(R.drawable.ic_check_box_true);
    }

    @Override
    public void clearFilterIcon(int position) {
        navView.getMenu().getItem(position).setIcon(R.drawable.ic_check_box_false);
    }

    @Override
    public void showProductsNotFound(boolean noProducts) {
        if (noProducts)
            statement.setText(getString(R.string.MyPantryActivity_products_not_found));
        else
            statement.setText("");
    }

    @Override
    public void clearFilterIcons() {
        int sizeOfMenu = navView.getMenu().size();
        for (int i = 1; i < sizeOfMenu - 1; i++) {
            navView.getMenu().getItem(i).setIcon(R.drawable.ic_check_box_false);
        }
    }

    @Override
    public void navigateToMainActivity() {
        Intent mainActivityIntent = new Intent(context, MainActivity.class);
        startActivity(mainActivityIntent);
        CustomIntent.customType(this, "fadein-to-fadeout");
    }

    @Override
    public void updateSelectsRecyclerViewAdapter() {
        adapterProductRecyclerView.setMultiSelectList(presenter.getGroupsProductsSelectList());
        adapterProductRecyclerView.notifyDataSetChanged();
    }

    @Override
    public void updateProductsViewAdapter() {
        presenter.getProductLiveData().observe(this, productList -> presenter.setProductList(productList));
        adapterProductRecyclerView.setData(presenter.getGroupProductsList());
        adapterProductRecyclerView.notifyDataSetChanged();
        productRecyclerView.setAdapter(adapterProductRecyclerView);
    }

    @Override
    public void onPrintProducts(@NonNull List<Product> productList,
                                @NonNull List<Product> allProductList) {
        Intent printQRCodesActivityIntent = new Intent(context, PrintQRCodesActivity.class)
                .putExtra("product_list", (Serializable) productList)
                .putExtra("all_product_list", (Serializable) allProductList);
        startActivity(printQRCodesActivityIntent);
        CustomIntent.customType(this, "fadein-to-fadeout");
    }

    @Override
    public void onDeleteProducts(@NonNull List<Product> productList) {
        for (Product product : productList) {
            Notification.cancelNotification(context, product);
        }
        updateProductsViewAdapter();
    }

    @Override
    public void setFilterName(String filterName) {
        presenter.setFilterName(filterName);
    }

    @Override
    public void setFilterExpirationDate(String filterExpirationDateSince, String filterExpirationDateFor) {
        presenter.setFilterExpirationDate(filterExpirationDateSince, filterExpirationDateFor);
    }

    @Override
    public void setFilterProductionDate(String filterProductionDateSince, String filterProductionDateFor) {
        presenter.setFilterProductionDate(filterProductionDateSince, filterProductionDateFor);
    }

    @Override
    public void setFilterTypeOfProduct(String filterTypeOfProduct, String filterProductFeatures) {
        presenter.setFilterTypeOfProduct(filterTypeOfProduct, filterProductFeatures);
    }

    @Override
    public void setFilterVolume(int filterVolumeSince, int filterVolumeFor) {
        presenter.setFilterVolume(filterVolumeSince, filterVolumeFor);
    }

    @Override
    public void setFilterWeight(int filterWeightSince, int filterWeightFor) {
        presenter.setFilterWeight(filterWeightSince, filterWeightFor);
    }

    @Override
    public void setFilterTaste(String filterTaste) {
        presenter.setFilterTaste(filterTaste);
    }

    @Override
    public void setFilterProductFeatures(Filter.Set filterHasSugar, Filter.Set filterHasSalt, Filter.Set filterIsBio, Filter.Set filterIsVege) {
        presenter.setFilterProductFeatures(filterHasSugar, filterHasSalt, filterIsBio, filterIsVege);
    }

    @Override
    public void onDeleteProducts() {
        presenter.deleteSelectedProducts();
        actionMode.finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.new_item_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            drawerLayout.openDrawer(GravityCompat.START);
            return true;
        } else if (id == R.id.action_new_item) {
            Intent intent = new Intent(this, NewProductActivity.class);
            startActivity(intent);
            CustomIntent.customType(this, "fadein-to-fadeout");
            return true;
        } else if (id == R.id.action_print) {
            return true;
        } else if (id == R.id.action_delete) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private final ActionMode.Callback actionModeCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            MenuInflater inflater = mode.getMenuInflater();
            inflater.inflate(R.menu.multi_select_products_menu, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            int itemId = item.getItemId();
            if (itemId == R.id.action_delete) {
                showDialogDeleteProducts();
                return true;
            } else if (itemId == R.id.action_print) {
                presenter.printSelectedProducts();
                return false;
            }
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            actionMode = null;
            presenter.setIsMultiSelect(false);
            presenter.clearMultiSelectList();
            updateSelectsRecyclerViewAdapter();
        }
    };

    public void onProductResponse(List<Product> productList) {
        loadingBar.setVisibility(View.GONE);
        presenter.setAllProductList(productList);
        presenter.setProductList(productList);
        updateProductsViewAdapter();
    }

    @Override
    public boolean onKeyDown(int keyCode, @NonNull KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            presenter.navigateToMainActivity();
        }
        return super.onKeyDown(keyCode, event);
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

    @Override
    public void finish() {
        super.finish();
        CustomIntent.customType(this, "fadein-to-fadeout");
    }

    public void onCategoryResponse(List<Category> categoryList) {
        presenter.setAllCategoryList(categoryList);
    }
}