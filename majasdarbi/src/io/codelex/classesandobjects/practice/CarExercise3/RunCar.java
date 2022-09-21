package io.codelex.classesandobjects.practice.CarExercise3;

public class RunCar {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge(50);

        Odometer odometer = new Odometer(90000, fuelGauge);

        System.out.println("First fuel amount: " + fuelGauge.getCurrentFuelAmount());
        System.out.println("Start mileage " + odometer.getCurrentMileage());

        int maxLitersToFill = (int) (fuelGauge.maxFuelAmount - fuelGauge.getCurrentFuelAmount());
        for (int i = 0; i < maxLitersToFill; i++) {
            fuelGauge.incrementFuelAmount();
        }

        System.out.println("Should be full fuel amount: " + fuelGauge.getCurrentFuelAmount());


        while (fuelGauge.minFuelAmount != fuelGauge.getCurrentFuelAmount()) {
            odometer.incrementMileage();
            //System.out.println(fuelGauge.getCurrentFuelAmount());
            //System.out.println(odometer.getCurrentMileage());
        }

        System.out.println("After increment fuel amount " + fuelGauge.getCurrentFuelAmount());
        System.out.println("After increment mileage " + odometer.getCurrentMileage());
    }
}
