package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test1152 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnItemInRecyclerViewNavigateToProductDetailsActivity/Trace-1659559083578.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: java.lang.String getProductFeatures()>_1208_2409
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getProductFeatures_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product29 = null;
        product29 = new com.hermanowicz.pantry.db.product.Product();
        product29.setId(1);
        product29.setName("Raspberry juice");
        product29.setHashCode("147263543");
        product29.setTypeOfProduct("Fruits");
        product29.setProductFeatures("Syrup");
        product29.setStorageLocation("");
        product29.setExpirationDate("2020-01-01");
        product29.setProductionDate("2019-12-31");
        product29.setComposition("Raspberries");
        product29.setHealingProperties("");
        product29.setDosage("Much");
        product29.setVolume(500);
        product29.setWeight(1000);
        product29.setHasSugar(true);
        product29.setHasSalt(false);
        product29.setIsVege(false);
        product29.setIsBio(false);
        product29.setTaste("Sweet");
        product29.setPhotoName("");
        product29.setPhotoDescription("");
        product29.setBarcode("");
        product29.getPhotoName();
        product29.getPhotoDescription();
        product29.getName();
        product29.getExpirationDate();
        product29.getProductFeatures();
    }
}
