package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test086 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnEditProductInProductDetailsShouldNavigateToEditProductActivity/Trace-1659559113343.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: java.lang.String getHealingProperties()>_1212_2417
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getHealingProperties_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product31 = null;
        product31 = new com.hermanowicz.pantry.db.product.Product();
        product31.setId(1);
        product31.setName("Raspberry juice");
        product31.setHashCode("147263543");
        product31.setTypeOfProduct("Fruits");
        product31.setProductFeatures("Syrup");
        product31.setStorageLocation("");
        product31.setExpirationDate("2020-01-01");
        product31.setProductionDate("2019-12-31");
        product31.setComposition("Raspberries");
        product31.setHealingProperties("");
        product31.setDosage("Much");
        product31.setVolume(500);
        product31.setWeight(1000);
        product31.setHasSugar(true);
        product31.setHasSalt(false);
        product31.setIsVege(false);
        product31.setIsBio(false);
        product31.setTaste("Sweet");
        product31.setPhotoName("");
        product31.setPhotoDescription("");
        product31.setBarcode("");
        product31.getPhotoName();
        product31.getPhotoDescription();
        product31.getName();
        product31.getExpirationDate();
        product31.getProductFeatures();
        product31.getComposition();
        product31.getHealingProperties();
    }
}
