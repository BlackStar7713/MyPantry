package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test1146 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnItemInRecyclerViewNavigateToProductDetailsActivity/Trace-1659559083578.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: java.lang.String getPhotoName()>_1183_2360
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getPhotoName_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product22 = null;
        product22 = new com.hermanowicz.pantry.db.product.Product();
        product22.setId(1);
        product22.setName("Raspberry juice");
        product22.setHashCode("147263543");
        product22.setTypeOfProduct("Fruits");
        product22.setProductFeatures("Syrup");
        product22.setStorageLocation("");
        product22.setExpirationDate("2020-01-01");
        product22.setProductionDate("2019-12-31");
        product22.setComposition("Raspberries");
        product22.setHealingProperties("");
        product22.setDosage("Much");
        product22.setVolume(500);
        product22.setWeight(1000);
        product22.setHasSugar(true);
        product22.setHasSalt(false);
        product22.setIsVege(false);
        product22.setIsBio(false);
        product22.setTaste("Sweet");
        product22.setPhotoName("");
        product22.setPhotoDescription("");
        product22.setBarcode("");
        product22.getPhotoName();
    }
}
