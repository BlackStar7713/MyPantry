package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test1132 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnItemInRecyclerViewNavigateToProductDetailsActivity/Trace-1659559083578.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setProductionDate(java.lang.String)>_471_937
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setProductionDate_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product8 = null;
        product8 = new com.hermanowicz.pantry.db.product.Product();
        product8.setId(1);
        product8.setName("Raspberry juice");
        product8.setHashCode("147263543");
        product8.setTypeOfProduct("Fruits");
        product8.setProductFeatures("Syrup");
        product8.setStorageLocation("");
        product8.setExpirationDate("2020-01-01");
        product8.setProductionDate("2019-12-31");
    }
}
