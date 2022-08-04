package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test817 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#notSpecifyingTheProductNameShouldDisplayAnError/Trace-1659559175914.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setStorageLocation(java.lang.String)>_492_980
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setStorageLocation_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product36 = null;
        product36 = new com.hermanowicz.pantry.db.product.Product();
        product36.setName("");
        product36.setTypeOfProduct("Vegetables");
        product36.setProductFeatures("null");
        product36.setStorageLocation("null");
    }
}
