package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test883 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setIsVege(boolean)>_531_1058
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setIsVege_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product669 = null;
        product669 = new com.hermanowicz.pantry.db.product.Product();
        product669.setName("Raspberry juice");
        product669.setTypeOfProduct("Vegetables");
        product669.setProductFeatures("null");
        product669.setStorageLocation("null");
        product669.setComposition("Raspberries");
        product669.setHealingProperties("");
        product669.setDosage("Much");
        product669.setVolume(500);
        product669.setWeight(1000);
        product669.setHasSugar(false);
        product669.setHasSalt(false);
        product669.setIsBio(false);
        product669.setIsVege(false);
    }
}
