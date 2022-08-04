package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test897 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setPhotoDescription(java.lang.String)>_559_1112
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setPhotoDescription_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product679 = null;
        product679 = new com.hermanowicz.pantry.db.product.Product();
        product679.setName("Raspberry juice");
        product679.setTypeOfProduct("Vegetables");
        product679.setProductFeatures("null");
        product679.setStorageLocation("null");
        product679.setComposition("Raspberries");
        product679.setHealingProperties("");
        product679.setDosage("Much");
        product679.setVolume(500);
        product679.setWeight(1000);
        product679.setHasSugar(false);
        product679.setHasSalt(false);
        product679.setIsBio(false);
        product679.setIsVege(false);
        product679.getName();
        product679.getTypeOfProduct();
        product679.setTaste("Sweet");
        product679.setExpirationDate("-");
        product679.setProductionDate("-");
        product679.setPhotoName("");
        product679.setPhotoDescription("");
    }
}
