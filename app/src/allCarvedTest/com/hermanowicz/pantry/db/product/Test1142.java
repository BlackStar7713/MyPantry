package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test1142 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnItemInRecyclerViewNavigateToProductDetailsActivity/Trace-1659559083578.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setTaste(java.lang.String)>_505_1005
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setTaste_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product18 = null;
        product18 = new com.hermanowicz.pantry.db.product.Product();
        product18.setId(1);
        product18.setName("Raspberry juice");
        product18.setHashCode("147263543");
        product18.setTypeOfProduct("Fruits");
        product18.setProductFeatures("Syrup");
        product18.setStorageLocation("");
        product18.setExpirationDate("2020-01-01");
        product18.setProductionDate("2019-12-31");
        product18.setComposition("Raspberries");
        product18.setHealingProperties("");
        product18.setDosage("Much");
        product18.setVolume(500);
        product18.setWeight(1000);
        product18.setHasSugar(true);
        product18.setHasSalt(false);
        product18.setIsVege(false);
        product18.setIsBio(false);
        product18.setTaste("Sweet");
    }
}
