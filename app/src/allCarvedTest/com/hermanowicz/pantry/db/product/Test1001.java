package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test1001 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#whenProductsInDbShowsProductsInRecyclerView/Trace-1659559090952.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setName(java.lang.String)>_447_889
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setName_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product2 = null;
        product2 = new com.hermanowicz.pantry.db.product.Product();
        product2.setId(1);
        product2.setName("Raspberry juice");
    }
}
