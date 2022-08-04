package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test1138 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnItemInRecyclerViewNavigateToProductDetailsActivity/Trace-1659559083578.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setHasSugar(boolean)>_492_979
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setHasSugar_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product14 = null;
        product14 = new com.hermanowicz.pantry.db.product.Product();
        product14.setId(1);
        product14.setName("Raspberry juice");
        product14.setHashCode("147263543");
        product14.setTypeOfProduct("Fruits");
        product14.setProductFeatures("Syrup");
        product14.setStorageLocation("");
        product14.setExpirationDate("2020-01-01");
        product14.setProductionDate("2019-12-31");
        product14.setComposition("Raspberries");
        product14.setHealingProperties("");
        product14.setDosage("Much");
        product14.setVolume(500);
        product14.setWeight(1000);
        product14.setHasSugar(true);
    }
}
