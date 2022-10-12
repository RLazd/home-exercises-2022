package io.codelex.classesandobjects.practice.CarExercise3;

public class Odometer {

    // VARIABLES
    private int startMileage;
    private int currentMileage;
    private int maxMileage = 999999;
    private int kilometersIncremented = 0;

    private FuelGauge fuelGauge;

    public Odometer(int startMileage, FuelGauge fuelGauge) {
        this.startMileage = startMileage;
        this.currentMileage = startMileage;
        this.fuelGauge = fuelGauge;
    }

    public int getCurrentMileage() {
        return currentMileage;
    }

    public void incrementMileage() {
        if (currentMileage <= maxMileage) {
            currentMileage += 1;
        } else {
            currentMileage = 0;
            startMileage = 0;
        }


        kilometersIncremented++;
        if (kilometersIncremented == 10) {
            fuelGauge.decrementFuelAmount();
            kilometersIncremented = 0;
        }
    }


}
