package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test626 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetVolumeFilterShouldShowProductsWithThisVolume/Trace-1659559148638.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setPhotoDescription(java.lang.String)>_513_1021
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setPhotoDescription_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product20 = null;
        product20 = new com.hermanowicz.pantry.db.product.Product();
        product20.setId(1);
        product20.setName("Raspberry juice");
        product20.setHashCode("173692613");
        product20.setTypeOfProduct("Fruits");
        product20.setProductFeatures("Syrup");
        product20.setStorageLocation("");
        product20.setExpirationDate("2020-01-01");
        product20.setProductionDate("2019-12-31");
        product20.setComposition("Raspberries");
        product20.setHealingProperties("");
        product20.setDosage("Much");
        product20.setVolume(500);
        product20.setWeight(1000);
        product20.setHasSugar(true);
        product20.setHasSalt(false);
        product20.setIsVege(false);
        product20.setIsBio(false);
        product20.setTaste("Sweet");
        product20.setPhotoName("");
        product20.setPhotoDescription("");
    }
}
