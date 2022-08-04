package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test875 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setComposition(java.lang.String)>_497_990
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setComposition_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product661 = null;
        product661 = new com.hermanowicz.pantry.db.product.Product();
        product661.setName("Raspberry juice");
        product661.setTypeOfProduct("Vegetables");
        product661.setProductFeatures("null");
        product661.setStorageLocation("null");
        product661.setComposition("Raspberries");
    }
}
