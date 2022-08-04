package com.hermanowicz.pantry.filter;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test495 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetWeightFilterShouldShowProductsWithThisName/Trace-1659559058464.txt
     * Method invocation under test: <com.hermanowicz.pantry.filter.FilterModel: java.lang.String getExpirationDateFor()>_2542_5074
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_filter_FilterModel_getExpirationDateFor_001() throws Exception {
        com.hermanowicz.pantry.filter.FilterModel filtermodel10 = null;
        filtermodel10 = new com.hermanowicz.pantry.filter.FilterModel();
        filtermodel10.getWeightSince();
        filtermodel10.getWeightFor();
        filtermodel10.setWeightSince(1200);
        filtermodel10.setWeightFor(-1);
        filtermodel10.getName();
        filtermodel10.getTypeOfProduct();
        filtermodel10.getProductCategory();
        filtermodel10.getExpirationDateSince();
        filtermodel10.getExpirationDateFor();
    }
}
