package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test211 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetNameFilterShouldShowProductsWithThisName/Trace-1659559133917.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setComposition(java.lang.String)>_475_945
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setComposition_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product9 = null;
        product9 = new com.hermanowicz.pantry.db.product.Product();
        product9.setId(1);
        product9.setName("Raspberry juice");
        product9.setHashCode("169851196");
        product9.setTypeOfProduct("Fruits");
        product9.setProductFeatures("Syrup");
        product9.setStorageLocation("");
        product9.setExpirationDate("2020-01-01");
        product9.setProductionDate("2019-12-31");
        product9.setComposition("Raspberries");
    }
}
