package com.hermanowicz.pantry.filter;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test262 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetNameFilterShouldShowProductsWithThisName/Trace-1659559133917.txt
     * Method invocation under test: <com.hermanowicz.pantry.filter.FilterModel: int getWeightSince()>_2556_5103
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_filter_FilterModel_getWeightSince_001() throws Exception {
        com.hermanowicz.pantry.filter.FilterModel filtermodel10 = null;
        filtermodel10 = new com.hermanowicz.pantry.filter.FilterModel();
        filtermodel10.getName();
        filtermodel10.setName("Raspberry juice");
        filtermodel10.getName();
        filtermodel10.getName();
        filtermodel10.getTypeOfProduct();
        filtermodel10.getProductCategory();
        filtermodel10.getExpirationDateSince();
        filtermodel10.getExpirationDateFor();
        filtermodel10.getExpirationDateSince();
        filtermodel10.getExpirationDateFor();
        filtermodel10.getVolumeSince();
        filtermodel10.getVolumeFor();
        filtermodel10.getWeightSince();
    }
}
