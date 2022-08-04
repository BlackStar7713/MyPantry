package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test824 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#notSpecifyingTheProductNameShouldDisplayAnError/Trace-1659559175914.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setHasSalt(boolean)>_524_1044
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setHasSalt_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product43 = null;
        product43 = new com.hermanowicz.pantry.db.product.Product();
        product43.setName("");
        product43.setTypeOfProduct("Vegetables");
        product43.setProductFeatures("null");
        product43.setStorageLocation("null");
        product43.setComposition("Raspberries");
        product43.setHealingProperties("");
        product43.setDosage("Much");
        product43.setVolume(500);
        product43.setWeight(1000);
        product43.setHasSugar(false);
        product43.setHasSalt(false);
    }
}
