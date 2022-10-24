package io.codelex.classesandobjects.practice.CarExercise3;

public class FuelGauge {
    public int MAX_FUEL_AMOUNT = 70;
    public int MIN_FUEL_AMOUNT = 0;
    private int currentFuelAmount;

    public FuelGauge(int currentFuelAmount) {
        this.currentFuelAmount = currentFuelAmount;
    }

    public int getCurrentFuelAmount() {
        return currentFuelAmount;
    }

    public void incrementFuelAmount() {
        if (currentFuelAmount < MAX_FUEL_AMOUNT) {
            currentFuelAmount += 1;
        }
    }

    public void decrementFuelAmount() {
        if (currentFuelAmount >= MIN_FUEL_AMOUNT) {
            this.currentFuelAmount -= 1;
        }
    }
}
