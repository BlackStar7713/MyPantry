package com.hermanowicz.pantry.model;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test098 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnEditProductInProductDetailsShouldNavigateToEditProductActivity/Trace-1659559113343.txt
     * Method invocation under test: <com.hermanowicz.pantry.model.GroupProducts: void setQuantity(int)>_1242_2478
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_model_GroupProducts_setQuantity_001() throws Exception {
        com.hermanowicz.pantry.model.GroupProducts groupproducts3 = null;
        com.hermanowicz.pantry.db.product.Product product44 = null;
        product44 = new com.hermanowicz.pantry.db.product.Product();
        product44.setId(1);
        product44.setName("Raspberry juice");
        product44.setHashCode("147263543");
        product44.setTypeOfProduct("Fruits");
        product44.setProductFeatures("Syrup");
        product44.setStorageLocation("");
        product44.setExpirationDate("2020-01-01");
        product44.setProductionDate("2019-12-31");
        product44.setComposition("Raspberries");
        product44.setHealingProperties("");
        product44.setDosage("Much");
        product44.setVolume(500);
        product44.setWeight(1000);
        product44.setHasSugar(true);
        product44.setHasSalt(false);
        product44.setIsVege(false);
        product44.setIsBio(false);
        product44.setTaste("Sweet");
        product44.setPhotoName("");
        product44.setPhotoDescription("");
        product44.setBarcode("");
        product44.getPhotoName();
        product44.getPhotoDescription();
        groupproducts3 = new com.hermanowicz.pantry.model.GroupProducts(product44, 1);
        com.hermanowicz.pantry.db.product.Product product45 = groupproducts3.getProduct();
        product45.getName();
        product45.getExpirationDate();
        product45.getProductFeatures();
        product45.getComposition();
        product45.getHealingProperties();
        product45.getDosage();
        product45.getVolume();
        product45.getWeight();
        product45.getTypeOfProduct();
        product45.getProductFeatures();
        product45.getHasSalt();
        product45.getHasSugar();
        product45.getIsBio();
        product45.getIsVege();
        product45.getBarcode();
        product45.getPhotoName();
        product45.getPhotoDescription();
        product45.getTaste();
        groupproducts3.getQuantity();
        groupproducts3.setQuantity(2);
    }
}
