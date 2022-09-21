package io.codelex.classesandobjects.practice.Car;

//liters per km changed to: liters per 100km
public class Car {
    private final int GAS_HOG_CONSUMPTION = 15;
    private final int ECONOMY_CAR_CONSUMPTION = 5;
    private double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
        this.endKilometers = startKilometers;
        this.liters = 0;
    }


    public double calculateConsumption() {
        return 100 * liters / (endKilometers - startKilometers);
    }

    public boolean isGasHog() {
        return calculateConsumption() > GAS_HOG_CONSUMPTION;

    }

    public boolean isEconomyCar() {
        return calculateConsumption() < ECONOMY_CAR_CONSUMPTION;

    }


    public void fillUp(double mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;

    }
}
