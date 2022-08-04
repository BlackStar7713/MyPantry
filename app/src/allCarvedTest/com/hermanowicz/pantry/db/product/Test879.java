package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test879 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setWeight(int)>_519_1034
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setWeight_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product665 = null;
        product665 = new com.hermanowicz.pantry.db.product.Product();
        product665.setName("Raspberry juice");
        product665.setTypeOfProduct("Vegetables");
        product665.setProductFeatures("null");
        product665.setStorageLocation("null");
        product665.setComposition("Raspberries");
        product665.setHealingProperties("");
        product665.setDosage("Much");
        product665.setVolume(500);
        product665.setWeight(1000);
    }
}
