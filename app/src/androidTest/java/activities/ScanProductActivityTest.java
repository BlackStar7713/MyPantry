/*
 * Copyright (c) 2019-2021
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

package activities;

import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;

import android.Manifest;
import android.content.res.Resources;
import android.preference.PreferenceManager;

import androidx.cardview.widget.CardView;
import androidx.room.Room;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.GrantPermissionRule;

import com.hermanowicz.pantry.R;
import com.hermanowicz.pantry.activity.MainActivity;
import com.hermanowicz.pantry.activity.ProductDetailsActivity;
import com.hermanowicz.pantry.activity.ScanProductActivity;
import com.hermanowicz.pantry.db.product.Product;
import com.hermanowicz.pantry.db.product.ProductDb;
import com.hermanowicz.pantry.presenter.ScanProductPresenter;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.List;

import models.ProductTestModel;

@RunWith(AndroidJUnit4.class)
public class ScanProductActivityTest {

    private ScanProductActivity activity;
    private ScanProductPresenter presenter;

    private CardView scanBarcode;
    private CardView scanQrCode;
    private CardView enterBarcodeManually;

    @Rule
    public GrantPermissionRule readPermissionRule =
            GrantPermissionRule.grant(Manifest.permission.CAMERA);

    @Rule
    public IntentsTestRule<ScanProductActivity> activityTestRule =
            new IntentsTestRule<>(ScanProductActivity.class);

    @Before
    public void setUp(){
        activity = activityTestRule.getActivity();
        presenter = new ScanProductPresenter(activity,
                PreferenceManager.getDefaultSharedPreferences(activity),
                ProductDb.getInstance(activity.getApplicationContext()));
        scanQrCode = activity.findViewById(R.id.cardview_scanQrCode);
        scanBarcode = activity.findViewById(R.id.cardview_scanBarCode);
        enterBarcodeManually = activity.findViewById(R.id.cardview_enterBarcodeManually);
    }

    @Ignore
    @Test
    public void onCorrectScanResultShouldNavigateToProductDetailsActivity() {
        ProductDb productDb = Room.inMemoryDatabaseBuilder(activity.getApplicationContext(),
                ProductDb.class).allowMainThreadQueries().build();
        List<Product> productList = new ArrayList<>();
        Resources resources = activity.getResources();

        productList.add(ProductTestModel.getTestProduct1(resources));
        productDb.productsDao().addProducts(productList);
        productList = productDb.productsDao().getAllProductsList();

        String happyScenario = "{\"product_id\":" + productList.get(0).getId() + ",\"hash_code\":"
                + productList.get(0).getHashCode() + "}";
        activity.runOnUiThread(() -> presenter.onScanResult(happyScenario));
        intended(hasComponent(ProductDetailsActivity.class.getName()));
    }

    @Test
    public void navigateToMainActivityIfProductNotFound() {
        String badScenario = "sgfsdfsdfsdf";

        activity.runOnUiThread(() -> presenter.onScanResult(badScenario));
        intended(hasComponent(MainActivity.class.getName()));
    }

    @Test
    public void navigateToMainActivity() {
        presenter.navigateToMainActivity();
        intended(hasComponent(MainActivity.class.getName()));
    }
}
