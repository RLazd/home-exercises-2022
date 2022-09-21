package io.codelex.classesandobjects.practice.Car;

//liters per km changet to: liters per 100km
public class Car {
    double startKilometers;
    double endKilometers;
    double liters;

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
        this.endKilometers = startKilometers;
        this.liters = 0;
    }


    public double calculateConsumption() {
        return 100 * liters / (endKilometers - startKilometers);
    }

    public boolean isGasHog() {
        return calculateConsumption() > 15;

    }

    public boolean isEconomyCar() {
        return calculateConsumption() < 5;

    }


    public void fillUp(double mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;

    }
}
