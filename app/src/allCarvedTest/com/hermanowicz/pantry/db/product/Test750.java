package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test750 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetHasSugarFilterShouldShowProductsWithThisName/Trace-1659559104737.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setPhotoName(java.lang.String)>_509_1013
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setPhotoName_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product19 = null;
        product19 = new com.hermanowicz.pantry.db.product.Product();
        product19.setId(1);
        product19.setName("Raspberry juice");
        product19.setHashCode("169851196");
        product19.setTypeOfProduct("Fruits");
        product19.setProductFeatures("Syrup");
        product19.setStorageLocation("");
        product19.setExpirationDate("2020-01-01");
        product19.setProductionDate("2019-12-31");
        product19.setComposition("Raspberries");
        product19.setHealingProperties("");
        product19.setDosage("Much");
        product19.setVolume(500);
        product19.setWeight(1000);
        product19.setHasSugar(true);
        product19.setHasSalt(false);
        product19.setIsVege(false);
        product19.setIsBio(false);
        product19.setTaste("Sweet");
        product19.setPhotoName("");
    }
}
