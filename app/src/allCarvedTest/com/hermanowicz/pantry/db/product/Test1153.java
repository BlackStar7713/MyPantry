package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test1153 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnItemInRecyclerViewNavigateToProductDetailsActivity/Trace-1659559083578.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: java.lang.String getComposition()>_1210_2413
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getComposition_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product30 = null;
        product30 = new com.hermanowicz.pantry.db.product.Product();
        product30.setId(1);
        product30.setName("Raspberry juice");
        product30.setHashCode("147263543");
        product30.setTypeOfProduct("Fruits");
        product30.setProductFeatures("Syrup");
        product30.setStorageLocation("");
        product30.setExpirationDate("2020-01-01");
        product30.setProductionDate("2019-12-31");
        product30.setComposition("Raspberries");
        product30.setHealingProperties("");
        product30.setDosage("Much");
        product30.setVolume(500);
        product30.setWeight(1000);
        product30.setHasSugar(true);
        product30.setHasSalt(false);
        product30.setIsVege(false);
        product30.setIsBio(false);
        product30.setTaste("Sweet");
        product30.setPhotoName("");
        product30.setPhotoDescription("");
        product30.setBarcode("");
        product30.getPhotoName();
        product30.getPhotoDescription();
        product30.getName();
        product30.getExpirationDate();
        product30.getProductFeatures();
        product30.getComposition();
    }
}
