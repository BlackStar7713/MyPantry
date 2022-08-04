package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test1158 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onClickOnItemInRecyclerViewNavigateToProductDetailsActivity/Trace-1659559083578.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: java.lang.String getTypeOfProduct()>_1220_2433
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getTypeOfProduct_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product35 = null;
        product35 = new com.hermanowicz.pantry.db.product.Product();
        product35.setId(1);
        product35.setName("Raspberry juice");
        product35.setHashCode("147263543");
        product35.setTypeOfProduct("Fruits");
        product35.setProductFeatures("Syrup");
        product35.setStorageLocation("");
        product35.setExpirationDate("2020-01-01");
        product35.setProductionDate("2019-12-31");
        product35.setComposition("Raspberries");
        product35.setHealingProperties("");
        product35.setDosage("Much");
        product35.setVolume(500);
        product35.setWeight(1000);
        product35.setHasSugar(true);
        product35.setHasSalt(false);
        product35.setIsVege(false);
        product35.setIsBio(false);
        product35.setTaste("Sweet");
        product35.setPhotoName("");
        product35.setPhotoDescription("");
        product35.setBarcode("");
        product35.getPhotoName();
        product35.getPhotoDescription();
        product35.getName();
        product35.getExpirationDate();
        product35.getProductFeatures();
        product35.getComposition();
        product35.getHealingProperties();
        product35.getDosage();
        product35.getVolume();
        product35.getWeight();
        product35.getTypeOfProduct();
    }
}
