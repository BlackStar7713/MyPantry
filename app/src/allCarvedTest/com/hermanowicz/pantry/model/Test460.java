package com.hermanowicz.pantry.model;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test460 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetWeightFilterShouldShowProductsWithThisName/Trace-1659559058464.txt
     * Method invocation under test: <com.hermanowicz.pantry.model.GroupProducts: void <init>(com.hermanowicz.pantry.db.product.Product,int)>_1188_2370
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_model_GroupProducts_constructor_001() throws Exception {
        com.hermanowicz.pantry.model.GroupProducts groupproducts0 = null;
        com.hermanowicz.pantry.db.product.Product product24 = null;
        product24 = new com.hermanowicz.pantry.db.product.Product();
        product24.setId(1);
        product24.setName("Raspberry juice");
        product24.setHashCode("183454814");
        product24.setTypeOfProduct("Fruits");
        product24.setProductFeatures("Syrup");
        product24.setStorageLocation("");
        product24.setExpirationDate("2020-01-01");
        product24.setProductionDate("2019-12-31");
        product24.setComposition("Raspberries");
        product24.setHealingProperties("");
        product24.setDosage("Much");
        product24.setVolume(500);
        product24.setWeight(1000);
        product24.setHasSugar(true);
        product24.setHasSalt(false);
        product24.setIsVege(false);
        product24.setIsBio(false);
        product24.setTaste("Sweet");
        product24.setPhotoName("");
        product24.setPhotoDescription("");
        product24.setBarcode("");
        product24.getPhotoName();
        product24.getPhotoDescription();
        groupproducts0 = new com.hermanowicz.pantry.model.GroupProducts(product24, 1);
    }
}
