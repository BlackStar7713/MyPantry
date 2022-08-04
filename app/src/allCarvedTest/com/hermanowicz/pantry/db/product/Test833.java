package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test833 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#notSpecifyingTheProductNameShouldDisplayAnError/Trace-1659559175914.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: java.lang.String getName()>_544_1082
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getName_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product48 = null;
        product48 = new com.hermanowicz.pantry.db.product.Product();
        product48.setName("");
        product48.setTypeOfProduct("Vegetables");
        product48.setProductFeatures("null");
        product48.setStorageLocation("null");
        product48.setComposition("Raspberries");
        product48.setHealingProperties("");
        product48.setDosage("Much");
        product48.setVolume(500);
        product48.setWeight(1000);
        product48.setHasSugar(false);
        product48.setHasSalt(false);
        product48.setIsBio(false);
        product48.setIsVege(false);
        product48.getName();
    }
}
