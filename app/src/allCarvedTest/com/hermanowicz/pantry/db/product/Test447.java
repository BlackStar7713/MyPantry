package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test447 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetWeightFilterShouldShowProductsWithThisName/Trace-1659559058464.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setDosage(java.lang.String)>_483_961
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setDosage_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product11 = null;
        product11 = new com.hermanowicz.pantry.db.product.Product();
        product11.setId(1);
        product11.setName("Raspberry juice");
        product11.setHashCode("183454814");
        product11.setTypeOfProduct("Fruits");
        product11.setProductFeatures("Syrup");
        product11.setStorageLocation("");
        product11.setExpirationDate("2020-01-01");
        product11.setProductionDate("2019-12-31");
        product11.setComposition("Raspberries");
        product11.setHealingProperties("");
        product11.setDosage("Much");
    }
}
