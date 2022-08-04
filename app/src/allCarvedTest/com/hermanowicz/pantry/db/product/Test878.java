package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test878 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setVolume(int)>_512_1020
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setVolume_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product664 = null;
        product664 = new com.hermanowicz.pantry.db.product.Product();
        product664.setName("Raspberry juice");
        product664.setTypeOfProduct("Vegetables");
        product664.setProductFeatures("null");
        product664.setStorageLocation("null");
        product664.setComposition("Raspberries");
        product664.setHealingProperties("");
        product664.setDosage("Much");
        product664.setVolume(500);
    }
}
