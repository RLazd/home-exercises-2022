package io.codelex.oop.imperialToMetric;

public class MeasurmentConverter {

    public static double convert(int value, ConversionType conversionType) {
        return Math.round(value * conversionType.getValue() * 100.00) / 100.00;

    }
}
