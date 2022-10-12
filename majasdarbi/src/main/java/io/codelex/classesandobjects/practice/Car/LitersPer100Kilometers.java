package io.codelex.classesandobjects.practice.Car;

import java.util.Scanner;

public class LitersPer100Kilometers {

    public static void main(String[] args) {


        Car car = carData();

        Scanner in = new Scanner(System.in);

        System.out.print("Filled up. Enter mileage:  ");
        double mileage = in.nextDouble();
        System.out.print("Filled up. Enter liters consumed: ");
        double liters = in.nextDouble();

        car.fillUp(mileage, liters);

        System.out.println("Liters per 100 kilometers " + car.calculateConsumption());
        System.out.println("GasHog?" + car.isGasHog());
        System.out.println("Economy?" + car.isEconomyCar());


    }

    private static Car carData() {
        double startKilometers;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first reading:  ");
        startKilometers = scan.nextDouble();

        return new Car(startKilometers);

    }

}
