package io.codelex.classesandobjects.practice;

import io.codelex.NoCodeWrittenException;

public class EnergyDrinks {
    final static int NUMBERED_SURVEYED = 12467;
    final static double PURCHASED_ENERGY_DRINKS = 0.14;
    final static double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);

        int energyDrinkers = (int) (PURCHASED_ENERGY_DRINKS * 100);
        System.out.println("Approximately " + energyDrinkers + "% bought at least one energy drink");

        int preferCitrus = (int) (PREFER_CITRUS_DRINKS * 100);
        System.out.println(preferCitrus + "% of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        throw new NoCodeWrittenException();
    }

    public static double calculatePreferCitris(int numberSurveyed) {
        throw new NoCodeWrittenException();
    }
}
