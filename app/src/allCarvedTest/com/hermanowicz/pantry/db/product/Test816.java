package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test816 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#notSpecifyingTheProductNameShouldDisplayAnError/Trace-1659559175914.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setProductFeatures(java.lang.String)>_489_974
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setProductFeatures_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product35 = null;
        product35 = new com.hermanowicz.pantry.db.product.Product();
        product35.setName("");
        product35.setTypeOfProduct("Vegetables");
        product35.setProductFeatures("null");
    }
}
