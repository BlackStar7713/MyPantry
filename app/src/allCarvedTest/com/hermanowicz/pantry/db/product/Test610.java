package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test610 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetVolumeFilterShouldShowProductsWithThisVolume/Trace-1659559148638.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setTypeOfProduct(java.lang.String)>_455_905
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setTypeOfProduct_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product4 = null;
        product4 = new com.hermanowicz.pantry.db.product.Product();
        product4.setId(1);
        product4.setName("Raspberry juice");
        product4.setHashCode("173692613");
        product4.setTypeOfProduct("Fruits");
    }
}
