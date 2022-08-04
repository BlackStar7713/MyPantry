package com.hermanowicz.pantry.model;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test772 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetHasSugarFilterShouldShowProductsWithThisName/Trace-1659559104737.txt
     * Method invocation under test: <com.hermanowicz.pantry.model.GroupProducts: int getQuantity()>_1241_2476
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_model_GroupProducts_getQuantity_001() throws Exception {
        com.hermanowicz.pantry.model.GroupProducts groupproducts2 = null;
        com.hermanowicz.pantry.db.product.Product product42 = null;
        product42 = new com.hermanowicz.pantry.db.product.Product();
        product42.setId(1);
        product42.setName("Raspberry juice");
        product42.setHashCode("169851196");
        product42.setTypeOfProduct("Fruits");
        product42.setProductFeatures("Syrup");
        product42.setStorageLocation("");
        product42.setExpirationDate("2020-01-01");
        product42.setProductionDate("2019-12-31");
        product42.setComposition("Raspberries");
        product42.setHealingProperties("");
        product42.setDosage("Much");
        product42.setVolume(500);
        product42.setWeight(1000);
        product42.setHasSugar(true);
        product42.setHasSalt(false);
        product42.setIsVege(false);
        product42.setIsBio(false);
        product42.setTaste("Sweet");
        product42.setPhotoName("");
        product42.setPhotoDescription("");
        product42.setBarcode("");
        product42.getPhotoName();
        product42.getPhotoDescription();
        groupproducts2 = new com.hermanowicz.pantry.model.GroupProducts(product42, 1);
        com.hermanowicz.pantry.db.product.Product product43 = groupproducts2.getProduct();
        product43.getName();
        product43.getExpirationDate();
        product43.getProductFeatures();
        product43.getComposition();
        product43.getHealingProperties();
        product43.getDosage();
        product43.getVolume();
        product43.getWeight();
        product43.getTypeOfProduct();
        product43.getProductFeatures();
        product43.getHasSalt();
        product43.getHasSugar();
        product43.getIsBio();
        product43.getIsVege();
        product43.getBarcode();
        product43.getPhotoName();
        product43.getPhotoDescription();
        product43.getTaste();
        groupproducts2.getQuantity();
    }
}
