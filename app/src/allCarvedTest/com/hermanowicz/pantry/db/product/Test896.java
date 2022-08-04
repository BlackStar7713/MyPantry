package com.hermanowicz.pantry.db.product;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test896 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.NewProductActivityTest#addingTheProductShouldNavigateToPrintQRDetailsActivity/Trace-1659559163567.txt
     * Method invocation under test: <com.hermanowicz.pantry.db.product.Product: void setPhotoName(java.lang.String)>_557_1108
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_db_product_Product_setPhotoName_001() throws Exception {
        com.hermanowicz.pantry.db.product.Product product678 = null;
        product678 = new com.hermanowicz.pantry.db.product.Product();
        product678.setName("Raspberry juice");
        product678.setTypeOfProduct("Vegetables");
        product678.setProductFeatures("null");
        product678.setStorageLocation("null");
        product678.setComposition("Raspberries");
        product678.setHealingProperties("");
        product678.setDosage("Much");
        product678.setVolume(500);
        product678.setWeight(1000);
        product678.setHasSugar(false);
        product678.setHasSalt(false);
        product678.setIsBio(false);
        product678.setIsVege(false);
        product678.getName();
        product678.getTypeOfProduct();
        product678.setTaste("Sweet");
        product678.setExpirationDate("-");
        product678.setProductionDate("-");
        product678.setPhotoName("");
    }
}
