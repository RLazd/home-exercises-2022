package io.codelex.oop.imperialToMetric;

public class Test {
    public static void main(String[] args) {

        System.out.println(MeasurmentConverter.convert(5, ConversionType.MILES_TO_KILOMETERS));
        System.out.println(MeasurmentConverter.convert(8, ConversionType.KILOMETERS_TO_MILES));

        System.out.println(MeasurmentConverter.convert(3, ConversionType.INCHES_TO_CENTIMETERS));
        System.out.println(MeasurmentConverter.convert(7, ConversionType.CENTIMETERS_TO_INCHES));

    }
}
