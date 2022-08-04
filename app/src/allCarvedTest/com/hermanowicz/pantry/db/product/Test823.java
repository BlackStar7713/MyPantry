package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test823 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#notSpecifyingTheProductNameShouldDisplayAnError/Trace-1659559175914.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setHasSugar(boolean)>_521_1038
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setHasSugar_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product42 = null;
        product42 = new com.hermanowicz.pantry.db.product.Product();
        product42.setName("");
        product42.setTypeOfProduct("Vegetables");
        product42.setProductFeatures("null");
        product42.setStorageLocation("null");
        product42.setComposition("Raspberries");
        product42.setHealingProperties("");
        product42.setDosage("Much");
        product42.setVolume(500);
        product42.setWeight(1000);
        product42.setHasSugar(false);
    }
}
