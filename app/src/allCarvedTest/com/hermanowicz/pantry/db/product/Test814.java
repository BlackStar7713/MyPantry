package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test814 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#notSpecifyingTheProductNameShouldDisplayAnError/Trace-1659559175914.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setName(java.lang.String)>_483_962
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setName_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product33 = null;
        product33 = new com.hermanowicz.pantry.db.product.Product();
        product33.setName("");
    }
}
