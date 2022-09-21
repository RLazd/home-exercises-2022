package io.codelex.classesandobjects.practice.CarExercise3;

public class FuelGauge {
    private int currentFuelAmount;
    public int maxFuelAmount = 70;
    public int minFuelAmount = 0;

    public FuelGauge(int currentFuelAmount) {
        this.currentFuelAmount = currentFuelAmount;
    }

    public int getCurrentFuelAmount() {
        return currentFuelAmount;
    }

    public void incrementFuelAmount() {
        if (currentFuelAmount < maxFuelAmount) {
            currentFuelAmount += 1;
        }
    }

    public void decrementFuelAmount() {
        if (currentFuelAmount >= minFuelAmount) {
            this.currentFuelAmount -= 1;
        }
    }
}
