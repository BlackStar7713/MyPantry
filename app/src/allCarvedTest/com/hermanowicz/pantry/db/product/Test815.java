package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test815 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#notSpecifyingTheProductNameShouldDisplayAnError/Trace-1659559175914.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setTypeOfProduct(java.lang.String)>_486_968
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setTypeOfProduct_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product34 = null;
        product34 = new com.hermanowicz.pantry.db.product.Product();
        product34.setName("");
        product34.setTypeOfProduct("Vegetables");
    }
}
