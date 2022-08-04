package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test825 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#notSpecifyingTheProductNameShouldDisplayAnError/Trace-1659559175914.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setIsBio(boolean)>_527_1050
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setIsBio_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product44 = null;
        product44 = new com.hermanowicz.pantry.db.product.Product();
        product44.setName("");
        product44.setTypeOfProduct("Vegetables");
        product44.setProductFeatures("null");
        product44.setStorageLocation("null");
        product44.setComposition("Raspberries");
        product44.setHealingProperties("");
        product44.setDosage("Much");
        product44.setVolume(500);
        product44.setWeight(1000);
        product44.setHasSugar(false);
        product44.setHasSalt(false);
        product44.setIsBio(false);
    }
}
