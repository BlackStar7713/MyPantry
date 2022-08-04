package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test893 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setTaste(java.lang.String)>_551_1096
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setTaste_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product675 = null;
        product675 = new com.hermanowicz.pantry.db.product.Product();
        product675.setName("Raspberry juice");
        product675.setTypeOfProduct("Vegetables");
        product675.setProductFeatures("null");
        product675.setStorageLocation("null");
        product675.setComposition("Raspberries");
        product675.setHealingProperties("");
        product675.setDosage("Much");
        product675.setVolume(500);
        product675.setWeight(1000);
        product675.setHasSugar(false);
        product675.setHasSalt(false);
        product675.setIsBio(false);
        product675.setIsVege(false);
        product675.getName();
        product675.getTypeOfProduct();
        product675.setTaste("Sweet");
    }
}
