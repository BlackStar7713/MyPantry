package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test891 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: java.lang.String getTypeOfProduct()>_548_1090
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_getTypeOfProduct_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product673 = null;
        product673 = new com.hermanowicz.pantry.db.product.Product();
        product673.setName("Raspberry juice");
        product673.setTypeOfProduct("Vegetables");
        product673.setProductFeatures("null");
        product673.setStorageLocation("null");
        product673.setComposition("Raspberries");
        product673.setHealingProperties("");
        product673.setDosage("Much");
        product673.setVolume(500);
        product673.setWeight(1000);
        product673.setHasSugar(false);
        product673.setHasSalt(false);
        product673.setIsBio(false);
        product673.setIsVege(false);
        product673.getName();
        product673.getTypeOfProduct();
    }
}
