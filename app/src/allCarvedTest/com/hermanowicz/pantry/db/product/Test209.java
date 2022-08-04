package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test209 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetNameFilterShouldShowProductsWithThisName/Trace-1659559133917.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setExpirationDate(java.lang.String)>_467_929
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setExpirationDate_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product7 = null;
        product7 = new com.hermanowicz.pantry.db.product.Product();
        product7.setId(1);
        product7.setName("Raspberry juice");
        product7.setHashCode("169851196");
        product7.setTypeOfProduct("Fruits");
        product7.setProductFeatures("Syrup");
        product7.setStorageLocation("");
        product7.setExpirationDate("2020-01-01");
    }
}
