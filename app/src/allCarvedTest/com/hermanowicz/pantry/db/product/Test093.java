package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test093 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnEditProductInProductDetailsShouldNavigateToEditProductActivity/Trace-1659559113343.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: boolean getIsBio()>_1228_2449
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getIsBio_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product38 = null;
        product38 = new com.hermanowicz.pantry.db.product.Product();
        product38.setId(1);
        product38.setName("Raspberry juice");
        product38.setHashCode("147263543");
        product38.setTypeOfProduct("Fruits");
        product38.setProductFeatures("Syrup");
        product38.setStorageLocation("");
        product38.setExpirationDate("2020-01-01");
        product38.setProductionDate("2019-12-31");
        product38.setComposition("Raspberries");
        product38.setHealingProperties("");
        product38.setDosage("Much");
        product38.setVolume(500);
        product38.setWeight(1000);
        product38.setHasSugar(true);
        product38.setHasSalt(false);
        product38.setIsVege(false);
        product38.setIsBio(false);
        product38.setTaste("Sweet");
        product38.setPhotoName("");
        product38.setPhotoDescription("");
        product38.setBarcode("");
        product38.getPhotoName();
        product38.getPhotoDescription();
        product38.getName();
        product38.getExpirationDate();
        product38.getProductFeatures();
        product38.getComposition();
        product38.getHealingProperties();
        product38.getDosage();
        product38.getVolume();
        product38.getWeight();
        product38.getTypeOfProduct();
        product38.getProductFeatures();
        product38.getHasSalt();
        product38.getHasSugar();
        product38.getIsBio();
    }
}
