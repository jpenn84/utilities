package com.joshualeepenn.utilities.math;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FractionBuilderTest {

    @Test
    public void testFractionBuilder() {
        Assert.assertEquals(FractionBuilder.getFraction(12,34), "¹²/₃₄");
    }
}
