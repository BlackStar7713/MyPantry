package com.hermanowicz.pantry.filter;

import org.junit.Before;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

public class Test256 {

    /**
     * Generated from /scratch/berreiter/action-based-test-carving/apps-src/MyPantry/traces/activities.MyPantryActivityTest#onSetNameFilterShouldShowProductsWithThisName/Trace-1659559133917.txt
     * Method invocation under test: <com.hermanowicz.pantry.filter.FilterModel: java.lang.String getProductCategory()>_2541_5073
     */
    @Test(timeout = 4000)
    public void test_com_hermanowicz_pantry_filter_FilterModel_getProductCategory_001() throws Exception {
        com.hermanowicz.pantry.filter.FilterModel filtermodel5 = null;
        filtermodel5 = new com.hermanowicz.pantry.filter.FilterModel();
        filtermodel5.getName();
        filtermodel5.setName("Raspberry juice");
        filtermodel5.getName();
        filtermodel5.getName();
        filtermodel5.getTypeOfProduct();
        filtermodel5.getProductCategory();
    }
}
