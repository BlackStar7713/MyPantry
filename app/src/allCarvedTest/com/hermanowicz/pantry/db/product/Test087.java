package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test087 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnEditProductInProductDetailsShouldNavigateToEditProductActivity/Trace-1659559113343.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: java.lang.String getDosage()>_1214_2421
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getDosage_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product32 = null;
        product32 = new com.hermanowicz.pantry.db.product.Product();
        product32.setId(1);
        product32.setName("Raspberry juice");
        product32.setHashCode("147263543");
        product32.setTypeOfProduct("Fruits");
        product32.setProductFeatures("Syrup");
        product32.setStorageLocation("");
        product32.setExpirationDate("2020-01-01");
        product32.setProductionDate("2019-12-31");
        product32.setComposition("Raspberries");
        product32.setHealingProperties("");
        product32.setDosage("Much");
        product32.setVolume(500);
        product32.setWeight(1000);
        product32.setHasSugar(true);
        product32.setHasSalt(false);
        product32.setIsVege(false);
        product32.setIsBio(false);
        product32.setTaste("Sweet");
        product32.setPhotoName("");
        product32.setPhotoDescription("");
        product32.setBarcode("");
        product32.getPhotoName();
        product32.getPhotoDescription();
        product32.getName();
        product32.getExpirationDate();
        product32.getProductFeatures();
        product32.getComposition();
        product32.getHealingProperties();
        product32.getDosage();
    }
}
