package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test881 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setHasSalt(boolean)>_525_1046
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setHasSalt_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product667 = null;
        product667 = new com.hermanowicz.pantry.db.product.Product();
        product667.setName("Raspberry juice");
        product667.setTypeOfProduct("Vegetables");
        product667.setProductFeatures("null");
        product667.setStorageLocation("null");
        product667.setComposition("Raspberries");
        product667.setHealingProperties("");
        product667.setDosage("Much");
        product667.setVolume(500);
        product667.setWeight(1000);
        product667.setHasSugar(false);
        product667.setHasSalt(false);
    }
}
