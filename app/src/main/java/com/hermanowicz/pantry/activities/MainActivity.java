/*
 * Copyright (c) 2019
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

package com.hermanowicz.pantry.activities;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.hermanowicz.pantry.R;
import com.hermanowicz.pantry.interfaces.MainView;
import com.hermanowicz.pantry.presenters.MainPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * <h1>MainActivity</h1>
 * Main activity - main window of the application. First window after launching this application.
 *
 * @author  Mateusz Hermanowicz
 * @version 1.0
 * @since   1.0
 */
public class MainActivity extends AppCompatActivity implements MainView{

    @BindView(R.id.adBanner)
    AdView adView;

    private MainPresenter presenter;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        MobileAds.initialize(getApplicationContext(), getResources().getString(R.string.admob_ad_id));

        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        presenter = new MainPresenter(this, PreferenceManager.getDefaultSharedPreferences(getApplicationContext()));

        //presenter.checkUserIsLogged();
    }

    @OnClick(R.id.button_myPantry)
    void onClickMyPantryButton() {
        presenter.navigateToMyPantryActivity();
    }

    @OnClick(R.id.button_scanProduct)
    void onClickScanProductButton() {
        presenter.navigateToScanProductActivity();
    }

    @OnClick(R.id.button_newProduct)
    void onClickNewProductButton() {
        presenter.navigateToNewProductActivity();
    }

    @OnClick(R.id.button_appSettings)
    void onClickAppSettingsButton() {
        presenter.navigateToAppSettingsActivity();
    }

    @Override
    public void onNavigationToWelcomeScreen() {
        Intent welcomeScreenActivityIntent = new Intent(MainActivity.this, WelcomeScreenActivity.class);
        startActivity(welcomeScreenActivityIntent);
    }

    @Override
    public void onNavigationToMyPantryActivity() {
        Intent myPantryActivityIntent = new Intent(MainActivity.this, MyPantryActivity.class);
        startActivity(myPantryActivityIntent);
    }

    @Override
    public void onNavigationToScanProductActivity() {
        Intent scanProductActivityIntent = new Intent(MainActivity.this, ScanProductActivity.class);
        startActivity(scanProductActivityIntent);
    }

    @Override
    public void onNavigationToNewProductActivity() {
        Intent newProductActivityIntent = new Intent(MainActivity.this, NewProductActivity.class);
        startActivity(newProductActivityIntent);
    }

    @Override
    public void onNavigationToAppSettingsActivity() {
        Intent appSettingsActivityIntent = new Intent(MainActivity.this, AppSettingsActivity.class);
        startActivity(appSettingsActivityIntent);
    }

    @Override
    public void onResume() {
        super.onResume();
        adView.resume();
    }

    @Override
    public void onPause() {
        adView.pause();
        super.onPause();
    }

    @Override
    public void onDestroy() {
        adView.destroy();
        super.onDestroy();
    }
}