package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test821 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#notSpecifyingTheProductNameShouldDisplayAnError/Trace-1659559175914.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setVolume(int)>_511_1018
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setVolume_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product40 = null;
        product40 = new com.hermanowicz.pantry.db.product.Product();
        product40.setName("");
        product40.setTypeOfProduct("Vegetables");
        product40.setProductFeatures("null");
        product40.setStorageLocation("null");
        product40.setComposition("Raspberries");
        product40.setHealingProperties("");
        product40.setDosage("Much");
        product40.setVolume(500);
    }
}
