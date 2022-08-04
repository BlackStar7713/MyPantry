package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test071 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnEditProductInProductDetailsShouldNavigateToEditProductActivity/Trace-1659559113343.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setHasSalt(boolean)>_495_985
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setHasSalt_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product15 = null;
        product15 = new com.hermanowicz.pantry.db.product.Product();
        product15.setId(1);
        product15.setName("Raspberry juice");
        product15.setHashCode("147263543");
        product15.setTypeOfProduct("Fruits");
        product15.setProductFeatures("Syrup");
        product15.setStorageLocation("");
        product15.setExpirationDate("2020-01-01");
        product15.setProductionDate("2019-12-31");
        product15.setComposition("Raspberries");
        product15.setHealingProperties("");
        product15.setDosage("Much");
        product15.setVolume(500);
        product15.setWeight(1000);
        product15.setHasSugar(true);
        product15.setHasSalt(false);
    }
}
