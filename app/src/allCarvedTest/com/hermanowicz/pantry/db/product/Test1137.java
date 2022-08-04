package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test1137 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnItemInRecyclerViewNavigateToProductDetailsActivity/Trace-1659559083578.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setWeight(int)>_489_973
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setWeight_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product13 = null;
        product13 = new com.hermanowicz.pantry.db.product.Product();
        product13.setId(1);
        product13.setName("Raspberry juice");
        product13.setHashCode("147263543");
        product13.setTypeOfProduct("Fruits");
        product13.setProductFeatures("Syrup");
        product13.setStorageLocation("");
        product13.setExpirationDate("2020-01-01");
        product13.setProductionDate("2019-12-31");
        product13.setComposition("Raspberries");
        product13.setHealingProperties("");
        product13.setDosage("Much");
        product13.setVolume(500);
        product13.setWeight(1000);
    }
}
