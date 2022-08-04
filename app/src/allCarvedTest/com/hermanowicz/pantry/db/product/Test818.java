package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test818 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#notSpecifyingTheProductNameShouldDisplayAnError/Trace-1659559175914.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setComposition(java.lang.String)>_496_988
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setComposition_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product37 = null;
        product37 = new com.hermanowicz.pantry.db.product.Product();
        product37.setName("");
        product37.setTypeOfProduct("Vegetables");
        product37.setProductFeatures("null");
        product37.setStorageLocation("null");
        product37.setComposition("Raspberries");
    }
}
