package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test082 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnEditProductInProductDetailsShouldNavigateToEditProductActivity/Trace-1659559113343.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: java.lang.String getName()>_1204_2401
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getName_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product27 = null;
        product27 = new com.hermanowicz.pantry.db.product.Product();
        product27.setId(1);
        product27.setName("Raspberry juice");
        product27.setHashCode("147263543");
        product27.setTypeOfProduct("Fruits");
        product27.setProductFeatures("Syrup");
        product27.setStorageLocation("");
        product27.setExpirationDate("2020-01-01");
        product27.setProductionDate("2019-12-31");
        product27.setComposition("Raspberries");
        product27.setHealingProperties("");
        product27.setDosage("Much");
        product27.setVolume(500);
        product27.setWeight(1000);
        product27.setHasSugar(true);
        product27.setHasSalt(false);
        product27.setIsVege(false);
        product27.setIsBio(false);
        product27.setTaste("Sweet");
        product27.setPhotoName("");
        product27.setPhotoDescription("");
        product27.setBarcode("");
        product27.getPhotoName();
        product27.getPhotoDescription();
        product27.getName();
    }
}
