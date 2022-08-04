package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test826 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#notSpecifyingTheProductNameShouldDisplayAnError/Trace-1659559175914.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setIsVege(boolean)>_530_1056
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setIsVege_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product45 = null;
        product45 = new com.hermanowicz.pantry.db.product.Product();
        product45.setName("");
        product45.setTypeOfProduct("Vegetables");
        product45.setProductFeatures("null");
        product45.setStorageLocation("null");
        product45.setComposition("Raspberries");
        product45.setHealingProperties("");
        product45.setDosage("Much");
        product45.setVolume(500);
        product45.setWeight(1000);
        product45.setHasSugar(false);
        product45.setHasSalt(false);
        product45.setIsBio(false);
        product45.setIsVege(false);
    }
}
