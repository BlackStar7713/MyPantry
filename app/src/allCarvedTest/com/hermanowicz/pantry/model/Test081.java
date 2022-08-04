package com.hermanowicz.pantry.model;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test081 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnEditProductInProductDetailsShouldNavigateToEditProductActivity/Trace-1659559113343.txt
     * Method invocation under test: <com.hermanowicz.pantry.model.GroupProducts: com.hermanowicz.pantry.db.product.Product getProduct()>_1203_2399
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_model_GroupProducts_getProduct_001() throws Exception {
        com.hermanowicz.pantry.model.GroupProducts groupproducts1 = null;
        com.hermanowicz.pantry.db.product.Product product25 = null;
        product25 = new com.hermanowicz.pantry.db.product.Product();
        product25.setId(1);
        product25.setName("Raspberry juice");
        product25.setHashCode("147263543");
        product25.setTypeOfProduct("Fruits");
        product25.setProductFeatures("Syrup");
        product25.setStorageLocation("");
        product25.setExpirationDate("2020-01-01");
        product25.setProductionDate("2019-12-31");
        product25.setComposition("Raspberries");
        product25.setHealingProperties("");
        product25.setDosage("Much");
        product25.setVolume(500);
        product25.setWeight(1000);
        product25.setHasSugar(true);
        product25.setHasSalt(false);
        product25.setIsVege(false);
        product25.setIsBio(false);
        product25.setTaste("Sweet");
        product25.setPhotoName("");
        product25.setPhotoDescription("");
        product25.setBarcode("");
        product25.getPhotoName();
        product25.getPhotoDescription();
        groupproducts1 = new com.hermanowicz.pantry.model.GroupProducts(product25, 1);
        groupproducts1.getProduct();
    }
}
