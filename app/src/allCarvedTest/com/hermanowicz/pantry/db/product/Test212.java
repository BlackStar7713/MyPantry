package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test212 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetNameFilterShouldShowProductsWithThisName/Trace-1659559133917.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setHealingProperties(java.lang.String)>_479_953
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setHealingProperties_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product10 = null;
        product10 = new com.hermanowicz.pantry.db.product.Product();
        product10.setId(1);
        product10.setName("Raspberry juice");
        product10.setHashCode("169851196");
        product10.setTypeOfProduct("Fruits");
        product10.setProductFeatures("Syrup");
        product10.setStorageLocation("");
        product10.setExpirationDate("2020-01-01");
        product10.setProductionDate("2019-12-31");
        product10.setComposition("Raspberries");
        product10.setHealingProperties("");
    }
}
