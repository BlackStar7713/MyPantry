package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test882 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setIsBio(boolean)>_528_1052
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setIsBio_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product668 = null;
        product668 = new com.hermanowicz.pantry.db.product.Product();
        product668.setName("Raspberry juice");
        product668.setTypeOfProduct("Vegetables");
        product668.setProductFeatures("null");
        product668.setStorageLocation("null");
        product668.setComposition("Raspberries");
        product668.setHealingProperties("");
        product668.setDosage("Much");
        product668.setVolume(500);
        product668.setWeight(1000);
        product668.setHasSugar(false);
        product668.setHasSalt(false);
        product668.setIsBio(false);
    }
}
