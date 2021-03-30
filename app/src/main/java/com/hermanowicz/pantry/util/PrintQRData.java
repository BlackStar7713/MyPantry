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

package com.hermanowicz.pantry.util;

import android.graphics.Bitmap;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.hermanowicz.pantry.db.product.Product;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>PrintQRData</h1>
 * A class used to prepare data from a list of products
 * that needed to print stickers with QR codes.
 *
 * @author  Mateusz Hermanowicz
 * @version 1.0
 * @since   1.0
 */

public class PrintQRData {

    private static final int QR_CODE_WIDTH = 100;
    private static final int QR_CODE_HEIGHT = 100;

    public static ArrayList<String> getTextToQRCodeList(@NonNull List<Product> productList, int idOfLastProductInDb) {
        ArrayList<String> textToQRCodeList = new ArrayList<>();
        JSONObject jsonObject = new JSONObject();
        int counter = 0;
        for (Product product : productList) {
            try{
                if (product.getId() > 0)
                    jsonObject.put("product_id", product.getId());
                else
                    jsonObject.put("product_id", idOfLastProductInDb - counter);
                jsonObject.put("hash_code", product.getHashCode());
                textToQRCodeList.add(jsonObject.toString());
            } catch (JSONException e) {
                Log.e("json", e.toString());
            }
            counter++;
        }
        return textToQRCodeList;
    }

    public static ArrayList<String> getNamesOfProductsList(@NonNull List<Product> productsList) {
        ArrayList<String> namesOfProductsList = new ArrayList<>();

        for (Product product : productsList) {
            String productName = product.getName();
            if (productName.length() > 15) {
                namesOfProductsList.add(productName.substring(0, 14) + ".");
            } else {
                namesOfProductsList.add(productName);
            }
        }
        return namesOfProductsList;
    }

    public static ArrayList<String> getExpirationDatesList(@NonNull List<Product> productsList) {
        ArrayList<String> expirationDatesList = new ArrayList<>();

        for (Product product : productsList) {
            expirationDatesList.add(product.getExpirationDate());
        }
        return expirationDatesList;
    }

    public static ArrayList<Bitmap> getQrCodeBitmapArray(ArrayList<String> textToQRCodeArray) {
        ArrayList<Bitmap> qrCodeBitmapArray = new ArrayList<>();
        for (int i = 0; i < textToQRCodeArray.size(); i++) {
            qrCodeBitmapArray.add(getBitmapQRCode(textToQRCodeArray.get(i)));
        }
        return qrCodeBitmapArray;
    }

    public static Bitmap getBitmapQRCode(@NonNull String textToQrCode) {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = null;
        try {
            bitMatrix = qrCodeWriter.encode(textToQrCode, BarcodeFormat.QR_CODE, QR_CODE_WIDTH, QR_CODE_HEIGHT);
        } catch (WriterException e) {
            Log.e("QRCodeWriter", e.toString());
        }
        BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
        return barcodeEncoder.createBitmap(bitMatrix);
    }
}