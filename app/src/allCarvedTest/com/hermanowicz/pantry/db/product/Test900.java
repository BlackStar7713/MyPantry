package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test900 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: java.lang.String getStorageLocation()>_566_1126
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getStorageLocation_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product682 = null;
        product682 = new com.hermanowicz.pantry.db.product.Product();
        product682.setName("Raspberry juice");
        product682.setTypeOfProduct("Vegetables");
        product682.setProductFeatures("null");
        product682.setStorageLocation("null");
        product682.setComposition("Raspberries");
        product682.setHealingProperties("");
        product682.setDosage("Much");
        product682.setVolume(500);
        product682.setWeight(1000);
        product682.setHasSugar(false);
        product682.setHasSalt(false);
        product682.setIsBio(false);
        product682.setIsVege(false);
        product682.getName();
        product682.getTypeOfProduct();
        product682.setTaste("Sweet");
        product682.setExpirationDate("-");
        product682.setProductionDate("-");
        product682.setPhotoName("");
        product682.setPhotoDescription("");
        product682.setBarcode("");
        product682.hashCode();
        product682.setHashCode("168177850");
        product682.getStorageLocation();
    }
}
