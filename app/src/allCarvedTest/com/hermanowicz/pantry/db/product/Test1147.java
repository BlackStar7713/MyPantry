package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test1147 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnItemInRecyclerViewNavigateToProductDetailsActivity/Trace-1659559083578.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: java.lang.String getPhotoDescription()>_1184_2362
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getPhotoDescription_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product23 = null;
        product23 = new com.hermanowicz.pantry.db.product.Product();
        product23.setId(1);
        product23.setName("Raspberry juice");
        product23.setHashCode("147263543");
        product23.setTypeOfProduct("Fruits");
        product23.setProductFeatures("Syrup");
        product23.setStorageLocation("");
        product23.setExpirationDate("2020-01-01");
        product23.setProductionDate("2019-12-31");
        product23.setComposition("Raspberries");
        product23.setHealingProperties("");
        product23.setDosage("Much");
        product23.setVolume(500);
        product23.setWeight(1000);
        product23.setHasSugar(true);
        product23.setHasSalt(false);
        product23.setIsVege(false);
        product23.setIsBio(false);
        product23.setTaste("Sweet");
        product23.setPhotoName("");
        product23.setPhotoDescription("");
        product23.setBarcode("");
        product23.getPhotoName();
        product23.getPhotoDescription();
    }
}
