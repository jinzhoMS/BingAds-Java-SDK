package com.microsoft.bingads.v13.api.test.entities.offline_conversion.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.offline_conversion.BulkOfflineConversionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkOfflineConversion;

@RunWith(Parameterized.class)
public class BulkOfflineConversionWriteToRowValueAdjustmentTypeTest extends BulkOfflineConversionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Adjustment Type", "Adjustment Type"},
                {"", ""},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testWriteProperty("Adjustment Type", this.datum, this.expectedResult, new BiConsumer<BulkOfflineConversion, String>() {
            @Override
            public void accept(BulkOfflineConversion c, String v) {
                c.setAdjustmentType(v);
            }
        });
    }
}