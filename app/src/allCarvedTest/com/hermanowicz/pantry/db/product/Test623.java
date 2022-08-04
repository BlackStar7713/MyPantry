package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test623 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetVolumeFilterShouldShowProductsWithThisVolume/Trace-1659559148638.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setIsBio(boolean)>_501_997
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setIsBio_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product17 = null;
        product17 = new com.hermanowicz.pantry.db.product.Product();
        product17.setId(1);
        product17.setName("Raspberry juice");
        product17.setHashCode("173692613");
        product17.setTypeOfProduct("Fruits");
        product17.setProductFeatures("Syrup");
        product17.setStorageLocation("");
        product17.setExpirationDate("2020-01-01");
        product17.setProductionDate("2019-12-31");
        product17.setComposition("Raspberries");
        product17.setHealingProperties("");
        product17.setDosage("Much");
        product17.setVolume(500);
        product17.setWeight(1000);
        product17.setHasSugar(true);
        product17.setHasSalt(false);
        product17.setIsVege(false);
        product17.setIsBio(false);
    }
}
