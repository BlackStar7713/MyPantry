package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test898 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setBarcode(java.lang.String)>_561_1116
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setBarcode_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product680 = null;
        product680 = new com.hermanowicz.pantry.db.product.Product();
        product680.setName("Raspberry juice");
        product680.setTypeOfProduct("Vegetables");
        product680.setProductFeatures("null");
        product680.setStorageLocation("null");
        product680.setComposition("Raspberries");
        product680.setHealingProperties("");
        product680.setDosage("Much");
        product680.setVolume(500);
        product680.setWeight(1000);
        product680.setHasSugar(false);
        product680.setHasSalt(false);
        product680.setIsBio(false);
        product680.setIsVege(false);
        product680.getName();
        product680.getTypeOfProduct();
        product680.setTaste("Sweet");
        product680.setExpirationDate("-");
        product680.setProductionDate("-");
        product680.setPhotoName("");
        product680.setPhotoDescription("");
        product680.setBarcode("");
    }
}
