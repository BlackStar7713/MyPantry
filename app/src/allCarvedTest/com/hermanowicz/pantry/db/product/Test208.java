package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test208 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetNameFilterShouldShowProductsWithThisName/Trace-1659559133917.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setStorageLocation(java.lang.String)>_463_921
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setStorageLocation_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product6 = null;
        product6 = new com.hermanowicz.pantry.db.product.Product();
        product6.setId(1);
        product6.setName("Raspberry juice");
        product6.setHashCode("169851196");
        product6.setTypeOfProduct("Fruits");
        product6.setProductFeatures("Syrup");
        product6.setStorageLocation("");
    }
}
