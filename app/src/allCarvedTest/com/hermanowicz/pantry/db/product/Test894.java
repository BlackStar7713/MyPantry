package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test894 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setExpirationDate(java.lang.String)>_553_1100
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setExpirationDate_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product676 = null;
        product676 = new com.hermanowicz.pantry.db.product.Product();
        product676.setName("Raspberry juice");
        product676.setTypeOfProduct("Vegetables");
        product676.setProductFeatures("null");
        product676.setStorageLocation("null");
        product676.setComposition("Raspberries");
        product676.setHealingProperties("");
        product676.setDosage("Much");
        product676.setVolume(500);
        product676.setWeight(1000);
        product676.setHasSugar(false);
        product676.setHasSalt(false);
        product676.setIsBio(false);
        product676.setIsVege(false);
        product676.getName();
        product676.getTypeOfProduct();
        product676.setTaste("Sweet");
        product676.setExpirationDate("-");
    }
}
