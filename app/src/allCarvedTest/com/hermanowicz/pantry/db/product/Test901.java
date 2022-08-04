package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test901 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: java.lang.String getProductFeatures()>_569_1132
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getProductFeatures_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product683 = null;
        product683 = new com.hermanowicz.pantry.db.product.Product();
        product683.setName("Raspberry juice");
        product683.setTypeOfProduct("Vegetables");
        product683.setProductFeatures("null");
        product683.setStorageLocation("null");
        product683.setComposition("Raspberries");
        product683.setHealingProperties("");
        product683.setDosage("Much");
        product683.setVolume(500);
        product683.setWeight(1000);
        product683.setHasSugar(false);
        product683.setHasSalt(false);
        product683.setIsBio(false);
        product683.setIsVege(false);
        product683.getName();
        product683.getTypeOfProduct();
        product683.setTaste("Sweet");
        product683.setExpirationDate("-");
        product683.setProductionDate("-");
        product683.setPhotoName("");
        product683.setPhotoDescription("");
        product683.setBarcode("");
        product683.hashCode();
        product683.setHashCode("168177850");
        product683.getStorageLocation();
        product683.setStorageLocation("");
        product683.getProductFeatures();
    }
}
