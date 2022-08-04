package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test822 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#notSpecifyingTheProductNameShouldDisplayAnError/Trace-1659559175914.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setWeight(int)>_518_1032
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setWeight_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product41 = null;
        product41 = new com.hermanowicz.pantry.db.product.Product();
        product41.setName("");
        product41.setTypeOfProduct("Vegetables");
        product41.setProductFeatures("null");
        product41.setStorageLocation("null");
        product41.setComposition("Raspberries");
        product41.setHealingProperties("");
        product41.setDosage("Much");
        product41.setVolume(500);
        product41.setWeight(1000);
    }
}
