package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test880 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setHasSugar(boolean)>_522_1040
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setHasSugar_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product666 = null;
        product666 = new com.hermanowicz.pantry.db.product.Product();
        product666.setName("Raspberry juice");
        product666.setTypeOfProduct("Vegetables");
        product666.setProductFeatures("null");
        product666.setStorageLocation("null");
        product666.setComposition("Raspberries");
        product666.setHealingProperties("");
        product666.setDosage("Much");
        product666.setVolume(500);
        product666.setWeight(1000);
        product666.setHasSugar(false);
    }
}
