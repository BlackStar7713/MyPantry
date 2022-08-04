package com.hermanowicz.pantry.filter;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test661 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetVolumeFilterShouldShowProductsWithThisVolume/Trace-1659559148638.txt
     * Method invocation under test: <com.hermanowicz.pantry.filter.FilterModel: java.lang.String getName()>_2533_5056
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_filter_FilterModel_getName_001() throws Exception {
        com.hermanowicz.pantry.filter.FilterModel filtermodel6 = null;
        filtermodel6 = new com.hermanowicz.pantry.filter.FilterModel();
        filtermodel6.getVolumeSince();
        filtermodel6.getVolumeFor();
        filtermodel6.setVolumeSince(100);
        filtermodel6.setVolumeFor(700);
        filtermodel6.getName();
    }
}
