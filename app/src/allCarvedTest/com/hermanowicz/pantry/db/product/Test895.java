package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test895 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setProductionDate(java.lang.String)>_555_1104
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setProductionDate_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product677 = null;
        product677 = new com.hermanowicz.pantry.db.product.Product();
        product677.setName("Raspberry juice");
        product677.setTypeOfProduct("Vegetables");
        product677.setProductFeatures("null");
        product677.setStorageLocation("null");
        product677.setComposition("Raspberries");
        product677.setHealingProperties("");
        product677.setDosage("Much");
        product677.setVolume(500);
        product677.setWeight(1000);
        product677.setHasSugar(false);
        product677.setHasSalt(false);
        product677.setIsBio(false);
        product677.setIsVege(false);
        product677.getName();
        product677.getTypeOfProduct();
        product677.setTaste("Sweet");
        product677.setExpirationDate("-");
        product677.setProductionDate("-");
    }
}
