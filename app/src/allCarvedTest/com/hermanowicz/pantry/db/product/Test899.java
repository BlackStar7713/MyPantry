package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test899 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setHashCode(java.lang.String)>_564_1122
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setHashCode_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product681 = null;
        product681 = new com.hermanowicz.pantry.db.product.Product();
        product681.setName("Raspberry juice");
        product681.setTypeOfProduct("Vegetables");
        product681.setProductFeatures("null");
        product681.setStorageLocation("null");
        product681.setComposition("Raspberries");
        product681.setHealingProperties("");
        product681.setDosage("Much");
        product681.setVolume(500);
        product681.setWeight(1000);
        product681.setHasSugar(false);
        product681.setHasSalt(false);
        product681.setIsBio(false);
        product681.setIsVege(false);
        product681.getName();
        product681.getTypeOfProduct();
        product681.setTaste("Sweet");
        product681.setExpirationDate("-");
        product681.setProductionDate("-");
        product681.setPhotoName("");
        product681.setPhotoDescription("");
        product681.setBarcode("");
        product681.hashCode();
        product681.setHashCode("168177850");
    }
}
