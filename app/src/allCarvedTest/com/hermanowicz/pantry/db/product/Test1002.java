package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test1002 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#whenProductsInDbShowsProductsInRecyclerView/Trace-1659559090952.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setHashCode(java.lang.String)>_451_897
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setHashCode_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product3 = null;
        product3 = new com.hermanowicz.pantry.db.product.Product();
        product3.setId(1);
        product3.setName("Raspberry juice");
        product3.setHashCode("241291055");
    }
}
