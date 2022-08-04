package com.hermanowicz.pantry.filter;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test489 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetWeightFilterShouldShowProductsWithThisName/Trace-1659559058464.txt
     * Method invocation under test: <com.hermanowicz.pantry.filter.FilterModel: void setWeightFor(int)>_2509_5012
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_filter_FilterModel_setWeightFor_001() throws Exception {
        com.hermanowicz.pantry.filter.FilterModel filtermodel4 = null;
        filtermodel4 = new com.hermanowicz.pantry.filter.FilterModel();
        filtermodel4.getWeightSince();
        filtermodel4.getWeightFor();
        filtermodel4.setWeightSince(1200);
        filtermodel4.setWeightFor(-1);
    }
}
