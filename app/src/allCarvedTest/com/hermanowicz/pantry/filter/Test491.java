package com.hermanowicz.pantry.filter;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test491 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetWeightFilterShouldShowProductsWithThisName/Trace-1659559058464.txt
     * Method invocation under test: <com.hermanowicz.pantry.filter.FilterModel: java.lang.String getName()>_2533_5056
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_filter_FilterModel_getName_001() throws Exception {
        com.hermanowicz.pantry.filter.FilterModel filtermodel6 = null;
        filtermodel6 = new com.hermanowicz.pantry.filter.FilterModel();
        filtermodel6.getWeightSince();
        filtermodel6.getWeightFor();
        filtermodel6.setWeightSince(1200);
        filtermodel6.setWeightFor(-1);
        filtermodel6.getName();
    }
}
