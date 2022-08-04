package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test819 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#notSpecifyingTheProductNameShouldDisplayAnError/Trace-1659559175914.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setHealingProperties(java.lang.String)>_500_996
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setHealingProperties_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product38 = null;
        product38 = new com.hermanowicz.pantry.db.product.Product();
        product38.setName("");
        product38.setTypeOfProduct("Vegetables");
        product38.setProductFeatures("null");
        product38.setStorageLocation("null");
        product38.setComposition("Raspberries");
        product38.setHealingProperties("");
    }
}
