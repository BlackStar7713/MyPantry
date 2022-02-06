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

package com.hermanowicz.pantry.presenter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import com.hermanowicz.pantry.db.photo.Photo;
import com.hermanowicz.pantry.db.product.Product;
import com.hermanowicz.pantry.interfaces.ProductDetailsView;
import com.hermanowicz.pantry.model.AppSettingsModel;
import com.hermanowicz.pantry.model.DatabaseMode;
import com.hermanowicz.pantry.model.GroupProducts;
import com.hermanowicz.pantry.model.PhotoModel;
import com.hermanowicz.pantry.model.ProductDataModel;
import com.hermanowicz.pantry.util.PremiumAccess;

import java.util.List;

/**
 * <h1>ProductDetailsPresenter</h1>
 * Presenter for ProductDetailsActivity
 *
 * @author  Mateusz Hermanowicz
 */

public class ProductDetailsPresenter {

    private final ProductDetailsView view;
    private final ProductDataModel model;
    private final DatabaseMode dbMode = new DatabaseMode();
    private final PhotoModel photoModel;
    private PremiumAccess premiumAccess;
    private final AppSettingsModel appSettingsModel;

    public ProductDetailsPresenter(@NonNull ProductDetailsView view, @NonNull AppCompatActivity activity) {
        this.view = view;
        this.model = new ProductDataModel(activity.getApplicationContext());
        this.photoModel = new PhotoModel(activity);
        this.appSettingsModel = new AppSettingsModel(PreferenceManager.
                getDefaultSharedPreferences(activity.getApplicationContext()));
        dbMode.setDatabaseMode(appSettingsModel.getDatabaseMode());
    }

    public void setPremiumAccess(@NonNull PremiumAccess premiumAccess) {
        this.premiumAccess = premiumAccess;
    }

    public void setProductId(int productId) {
        model.setProduct(productId);
    }

    public void showProductDetails() {
        String hashCode = model.getHashCode();
        if (model.isProductListEmpty()) {
            view.showErrorWrongData();
            view.navigateToMyPantryActivity();
        } else if (model.isCorrectHashCode(hashCode)) {
            GroupProducts groupProducts = model.getGroupProducts();
            view.showProductDetails(groupProducts);
            String photo = "";
            if (groupProducts.getProduct().getPhotoName() != null)
                photo = groupProducts.getProduct().getPhotoName();
            if (!photo.equals("")) {
                photoModel.setPhotoFile(String.valueOf(groupProducts.getProduct().getPhotoName()));
                view.showPhoto(photoModel.getPhotoBitmap());
            }
        }
        else {
            view.showErrorWrongData();
            view.navigateToMyPantryActivity();
        }
    }

    public void onClickDeleteProduct() {
        view.showDialogOnDeleteProduct();
    }

    public void onClickPrintQRCodes() {
        List<Product> productList = model.getProductList();
        view.navigateToPrintQRCodeActivity(productList);
    }

    public void onClickEditProduct() {
        List<Product> productList = model.getProductList();
        List<Product> allProductList = model.getAllProductList();
        int productId = model.getProductId();
        view.navigateToEditProductActivity(productId, productList, allProductList);
    }

    public void onClickTakePhoto() {
        List<Product> productList = model.getProductList();
        List<Photo> photoList = photoModel.getPhotoList();
        view.navigateToAddPhotoActivity(productList, photoList);
    }

    public void navigateToMyPantryActivity() {
        view.navigateToMyPantryActivity();
    }

    public boolean isPremium() {
        return premiumAccess.isPremium();
    }

    public void setProductList(List<Product> productList) {
        model.setProductList(productList);
    }

    public void setAllProductList(List<Product> allProductList) {
        model.setAllProductList(allProductList);
    }

    public void setPhotoList(List<Photo> photoList) {
        photoModel.setPhotoList(photoList);
    }

    public boolean isOfflineDb() {
        return dbMode.getDatabaseMode() == DatabaseMode.Mode.LOCAL;
    }

    public void onConfirmDeleteSimilarProducts() {
        if (isOfflineDb())
            model.deleteSimilarOfflineProducts();
        else
            model.deleteSimilarOnlineProducts();
        view.onDeletedProduct();
        view.navigateToMyPantryActivity();
    }

    public void onConfirmDeleteSingleProduct() {
        if (isOfflineDb())
            model.deleteSingleOfflineProduct();
        else
            model.deleteSingleOnlineProduct();
        view.onDeletedProduct();
        view.navigateToMyPantryActivity();
    }

    public void onClickAddBarcode() {
        List<Product> productList = model.getProductList();
        view.navigateToScanProductActivity(productList);
    }

    public void setHashCode(String hashCode) {
        model.setHashCode(hashCode);
    }
}