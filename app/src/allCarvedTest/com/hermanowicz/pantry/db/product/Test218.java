package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test218 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetNameFilterShouldShowProductsWithThisName/Trace-1659559133917.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setIsVege(boolean)>_498_991
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setIsVege_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product16 = null;
        product16 = new com.hermanowicz.pantry.db.product.Product();
        product16.setId(1);
        product16.setName("Raspberry juice");
        product16.setHashCode("169851196");
        product16.setTypeOfProduct("Fruits");
        product16.setProductFeatures("Syrup");
        product16.setStorageLocation("");
        product16.setExpirationDate("2020-01-01");
        product16.setProductionDate("2019-12-31");
        product16.setComposition("Raspberries");
        product16.setHealingProperties("");
        product16.setDosage("Much");
        product16.setVolume(500);
        product16.setWeight(1000);
        product16.setHasSugar(true);
        product16.setHasSalt(false);
        product16.setIsVege(false);
    }
}
