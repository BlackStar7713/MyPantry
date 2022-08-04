package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test764 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetHasSugarFilterShouldShowProductsWithThisName/Trace-1659559104737.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: int getWeight()>_1218_2429
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getWeight_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product34 = null;
        product34 = new com.hermanowicz.pantry.db.product.Product();
        product34.setId(1);
        product34.setName("Raspberry juice");
        product34.setHashCode("169851196");
        product34.setTypeOfProduct("Fruits");
        product34.setProductFeatures("Syrup");
        product34.setStorageLocation("");
        product34.setExpirationDate("2020-01-01");
        product34.setProductionDate("2019-12-31");
        product34.setComposition("Raspberries");
        product34.setHealingProperties("");
        product34.setDosage("Much");
        product34.setVolume(500);
        product34.setWeight(1000);
        product34.setHasSugar(true);
        product34.setHasSalt(false);
        product34.setIsVege(false);
        product34.setIsBio(false);
        product34.setTaste("Sweet");
        product34.setPhotoName("");
        product34.setPhotoDescription("");
        product34.setBarcode("");
        product34.getPhotoName();
        product34.getPhotoDescription();
        product34.getName();
        product34.getExpirationDate();
        product34.getProductFeatures();
        product34.getComposition();
        product34.getHealingProperties();
        product34.getDosage();
        product34.getVolume();
        product34.getWeight();
    }
}
