package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test766 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetHasSugarFilterShouldShowProductsWithThisName/Trace-1659559104737.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: boolean getHasSalt()>_1224_2441
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getHasSalt_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product36 = null;
        product36 = new com.hermanowicz.pantry.db.product.Product();
        product36.setId(1);
        product36.setName("Raspberry juice");
        product36.setHashCode("169851196");
        product36.setTypeOfProduct("Fruits");
        product36.setProductFeatures("Syrup");
        product36.setStorageLocation("");
        product36.setExpirationDate("2020-01-01");
        product36.setProductionDate("2019-12-31");
        product36.setComposition("Raspberries");
        product36.setHealingProperties("");
        product36.setDosage("Much");
        product36.setVolume(500);
        product36.setWeight(1000);
        product36.setHasSugar(true);
        product36.setHasSalt(false);
        product36.setIsVege(false);
        product36.setIsBio(false);
        product36.setTaste("Sweet");
        product36.setPhotoName("");
        product36.setPhotoDescription("");
        product36.setBarcode("");
        product36.getPhotoName();
        product36.getPhotoDescription();
        product36.getName();
        product36.getExpirationDate();
        product36.getProductFeatures();
        product36.getComposition();
        product36.getHealingProperties();
        product36.getDosage();
        product36.getVolume();
        product36.getWeight();
        product36.getTypeOfProduct();
        product36.getProductFeatures();
        product36.getHasSalt();
    }
}
