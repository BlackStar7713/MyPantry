package com.hermanowicz.pantry.filter;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test497 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetWeightFilterShouldShowProductsWithThisName/Trace-1659559058464.txt
     * Method invocation under test: <com.hermanowicz.pantry.filter.FilterModel: int getVolumeSince()>_2549_5088
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_filter_FilterModel_getVolumeSince_001() throws Exception {
        com.hermanowicz.pantry.filter.FilterModel filtermodel11 = null;
        filtermodel11 = new com.hermanowicz.pantry.filter.FilterModel();
        filtermodel11.getWeightSince();
        filtermodel11.getWeightFor();
        filtermodel11.setWeightSince(1200);
        filtermodel11.setWeightFor(-1);
        filtermodel11.getName();
        filtermodel11.getTypeOfProduct();
        filtermodel11.getProductCategory();
        filtermodel11.getExpirationDateSince();
        filtermodel11.getExpirationDateFor();
        filtermodel11.getExpirationDateSince();
        filtermodel11.getExpirationDateFor();
        filtermodel11.getVolumeSince();
    }
}
