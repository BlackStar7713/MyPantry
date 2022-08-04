package com.hermanowicz.pantry.filter;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test498 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetWeightFilterShouldShowProductsWithThisName/Trace-1659559058464.txt
     * Method invocation under test: <com.hermanowicz.pantry.filter.FilterModel: int getVolumeFor()>_2550_5090
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_filter_FilterModel_getVolumeFor_001() throws Exception {
        com.hermanowicz.pantry.filter.FilterModel filtermodel12 = null;
        filtermodel12 = new com.hermanowicz.pantry.filter.FilterModel();
        filtermodel12.getWeightSince();
        filtermodel12.getWeightFor();
        filtermodel12.setWeightSince(1200);
        filtermodel12.setWeightFor(-1);
        filtermodel12.getName();
        filtermodel12.getTypeOfProduct();
        filtermodel12.getProductCategory();
        filtermodel12.getExpirationDateSince();
        filtermodel12.getExpirationDateFor();
        filtermodel12.getExpirationDateSince();
        filtermodel12.getExpirationDateFor();
        filtermodel12.getVolumeSince();
        filtermodel12.getVolumeFor();
    }
}
