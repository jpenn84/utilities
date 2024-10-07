package com.joshualeepenn.utilities.math;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FractionBuilderTest {

    @Test
    public void testStaticFractionBuilder() {
        Assert.assertEquals(FractionBuilder.getFraction(12345,67890), "¹²³⁴⁵/₆₇₈₉₀");
    }

    @Test
    public void testFractionBuilder() {
        FractionBuilder fb = new FractionBuilder(67890, 12345);

        Assert.assertEquals(fb.getFraction(), "⁶⁷⁸⁹⁰/₁₂₃₄₅");
    }
}
