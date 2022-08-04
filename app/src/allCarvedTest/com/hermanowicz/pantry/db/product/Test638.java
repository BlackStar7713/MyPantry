package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test638 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetVolumeFilterShouldShowProductsWithThisVolume/Trace-1659559148638.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: int getVolume()>_1216_2425
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getVolume_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product33 = null;
        product33 = new com.hermanowicz.pantry.db.product.Product();
        product33.setId(1);
        product33.setName("Raspberry juice");
        product33.setHashCode("173692613");
        product33.setTypeOfProduct("Fruits");
        product33.setProductFeatures("Syrup");
        product33.setStorageLocation("");
        product33.setExpirationDate("2020-01-01");
        product33.setProductionDate("2019-12-31");
        product33.setComposition("Raspberries");
        product33.setHealingProperties("");
        product33.setDosage("Much");
        product33.setVolume(500);
        product33.setWeight(1000);
        product33.setHasSugar(true);
        product33.setHasSalt(false);
        product33.setIsVege(false);
        product33.setIsBio(false);
        product33.setTaste("Sweet");
        product33.setPhotoName("");
        product33.setPhotoDescription("");
        product33.setBarcode("");
        product33.getPhotoName();
        product33.getPhotoDescription();
        product33.getName();
        product33.getExpirationDate();
        product33.getProductFeatures();
        product33.getComposition();
        product33.getHealingProperties();
        product33.getDosage();
        product33.getVolume();
    }
}
