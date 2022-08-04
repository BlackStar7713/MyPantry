package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test092 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnEditProductInProductDetailsShouldNavigateToEditProductActivity/Trace-1659559113343.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: boolean getHasSugar()>_1226_2445
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getHasSugar_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product37 = null;
        product37 = new com.hermanowicz.pantry.db.product.Product();
        product37.setId(1);
        product37.setName("Raspberry juice");
        product37.setHashCode("147263543");
        product37.setTypeOfProduct("Fruits");
        product37.setProductFeatures("Syrup");
        product37.setStorageLocation("");
        product37.setExpirationDate("2020-01-01");
        product37.setProductionDate("2019-12-31");
        product37.setComposition("Raspberries");
        product37.setHealingProperties("");
        product37.setDosage("Much");
        product37.setVolume(500);
        product37.setWeight(1000);
        product37.setHasSugar(true);
        product37.setHasSalt(false);
        product37.setIsVege(false);
        product37.setIsBio(false);
        product37.setTaste("Sweet");
        product37.setPhotoName("");
        product37.setPhotoDescription("");
        product37.setBarcode("");
        product37.getPhotoName();
        product37.getPhotoDescription();
        product37.getName();
        product37.getExpirationDate();
        product37.getProductFeatures();
        product37.getComposition();
        product37.getHealingProperties();
        product37.getDosage();
        product37.getVolume();
        product37.getWeight();
        product37.getTypeOfProduct();
        product37.getProductFeatures();
        product37.getHasSalt();
        product37.getHasSugar();
    }
}
