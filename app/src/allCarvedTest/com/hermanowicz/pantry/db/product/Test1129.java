package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test1129 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnItemInRecyclerViewNavigateToProductDetailsActivity/Trace-1659559083578.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setProductFeatures(java.lang.String)>_459_913
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setProductFeatures_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product5 = null;
        product5 = new com.hermanowicz.pantry.db.product.Product();
        product5.setId(1);
        product5.setName("Raspberry juice");
        product5.setHashCode("147263543");
        product5.setTypeOfProduct("Fruits");
        product5.setProductFeatures("Syrup");
    }
}
