package com.joshualeepenn.utilities.math;

public class FractionBuilder {

    private int numerator;
    private int denominator;

    public FractionBuilder(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static String getFraction(int numerator, int denominator) {
        return new FractionBuilder(numerator, denominator).getFraction();
    }

    public String getFraction() {
        String numString = Integer.toString(this.numerator);
        numString = numString.replaceAll("0", "⁰");
        numString = numString.replaceAll("1", "¹");
        numString = numString.replaceAll("2", "²");
        numString = numString.replaceAll("3", "³");
        numString = numString.replaceAll("4", "⁴");
        numString = numString.replaceAll("5", "⁵");
        numString = numString.replaceAll("6", "⁶");
        numString = numString.replaceAll("7", "⁷");
        numString = numString.replaceAll("8", "⁸");
        numString = numString.replaceAll("9", "⁹");

        String denomString = Integer.toString(this.denominator);
        denomString = denomString.replaceAll("0", "₀");
        denomString = denomString.replaceAll("1", "₁");
        denomString = denomString.replaceAll("2", "₂");
        denomString = denomString.replaceAll("3", "₃");
        denomString = denomString.replaceAll("4", "₄");
        denomString = denomString.replaceAll("5", "₅");
        denomString = denomString.replaceAll("6", "₆");
        denomString = denomString.replaceAll("7", "₇");
        denomString = denomString.replaceAll("8", "₈");
        denomString = denomString.replaceAll("9", "₉");

        return numString + "/" + denomString;
    }
}
