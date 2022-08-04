package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test463 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetWeightFilterShouldShowProductsWithThisName/Trace-1659559058464.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: java.lang.String getExpirationDate()>_1206_2405
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getExpirationDate_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product28 = null;
        product28 = new com.hermanowicz.pantry.db.product.Product();
        product28.setId(1);
        product28.setName("Raspberry juice");
        product28.setHashCode("183454814");
        product28.setTypeOfProduct("Fruits");
        product28.setProductFeatures("Syrup");
        product28.setStorageLocation("");
        product28.setExpirationDate("2020-01-01");
        product28.setProductionDate("2019-12-31");
        product28.setComposition("Raspberries");
        product28.setHealingProperties("");
        product28.setDosage("Much");
        product28.setVolume(500);
        product28.setWeight(1000);
        product28.setHasSugar(true);
        product28.setHasSalt(false);
        product28.setIsVege(false);
        product28.setIsBio(false);
        product28.setTaste("Sweet");
        product28.setPhotoName("");
        product28.setPhotoDescription("");
        product28.setBarcode("");
        product28.getPhotoName();
        product28.getPhotoDescription();
        product28.getName();
        product28.getExpirationDate();
    }
}
