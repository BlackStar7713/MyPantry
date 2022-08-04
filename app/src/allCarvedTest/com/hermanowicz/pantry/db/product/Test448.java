package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test448 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetWeightFilterShouldShowProductsWithThisName/Trace-1659559058464.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setVolume(int)>_486_967
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setVolume_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product12 = null;
        product12 = new com.hermanowicz.pantry.db.product.Product();
        product12.setId(1);
        product12.setName("Raspberry juice");
        product12.setHashCode("183454814");
        product12.setTypeOfProduct("Fruits");
        product12.setProductFeatures("Syrup");
        product12.setStorageLocation("");
        product12.setExpirationDate("2020-01-01");
        product12.setProductionDate("2019-12-31");
        product12.setComposition("Raspberries");
        product12.setHealingProperties("");
        product12.setDosage("Much");
        product12.setVolume(500);
    }
}
