package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test820 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#notSpecifyingTheProductNameShouldDisplayAnError/Trace-1659559175914.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setDosage(java.lang.String)>_504_1004
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setDosage_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product39 = null;
        product39 = new com.hermanowicz.pantry.db.product.Product();
        product39.setName("");
        product39.setTypeOfProduct("Vegetables");
        product39.setProductFeatures("null");
        product39.setStorageLocation("null");
        product39.setComposition("Raspberries");
        product39.setHealingProperties("");
        product39.setDosage("Much");
    }
}
