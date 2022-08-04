package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test077 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnEditProductInProductDetailsShouldNavigateToEditProductActivity/Trace-1659559113343.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setBarcode(java.lang.String)>_517_1029
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setBarcode_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product21 = null;
        product21 = new com.hermanowicz.pantry.db.product.Product();
        product21.setId(1);
        product21.setName("Raspberry juice");
        product21.setHashCode("147263543");
        product21.setTypeOfProduct("Fruits");
        product21.setProductFeatures("Syrup");
        product21.setStorageLocation("");
        product21.setExpirationDate("2020-01-01");
        product21.setProductionDate("2019-12-31");
        product21.setComposition("Raspberries");
        product21.setHealingProperties("");
        product21.setDosage("Much");
        product21.setVolume(500);
        product21.setWeight(1000);
        product21.setHasSugar(true);
        product21.setHasSalt(false);
        product21.setIsVege(false);
        product21.setIsBio(false);
        product21.setTaste("Sweet");
        product21.setPhotoName("");
        product21.setPhotoDescription("");
        product21.setBarcode("");
    }
}
