package io.codelex.oop.cars;

import java.time.Year;
import java.util.Objects;

import static io.codelex.oop.cars.EngineType.V12;

public class CarServiceTest {
    public static void main(String[] args) {
        //Cars and manufacturers
        Manufacturer honda = new Manufacturer("Honda", "Japan", 1946);
        Manufacturer volkswagen = new Manufacturer("Volkswagen", "Germany", 1937);
        Manufacturer volkswagen2 = new Manufacturer("Volkswagen2", "Germany", 1937);
        Manufacturer subaru = new Manufacturer("Subaru", "Japan", 1960);

        Car car1 = new Car("Forester", "ForesterSUV", 10000, 1998, EngineType.S3);
        car1.addManufacturer(subaru);

        Car car2 = new Car("GolfHonda", "Golf123", 25000, 2021, EngineType.V6);
        car2.addManufacturer(volkswagen);
        car2.addManufacturer(volkswagen2);
        car2.addManufacturer(honda);


        Car car3 = new Car("Jetta", "Jetta123", V12);
        car3.addManufacturer(volkswagen);
        car3.addManufacturer(volkswagen2);
        car3.setPrice(30000);
        car3.setYearOfManufacture(2000);

        Car car4 = new Car("Civic", "Civic123", 26000, 2005, EngineType.V6);
        car4.addManufacturer(honda);

        //CarServiceTesting:
        //1.,2. adding/removing Cars to the list
        CarService carService = new CarService();
        carService.addCar(car2);
        carService.addCar(car1);
        carService.addCar(car3);
        carService.addCar(car4);
        //carService.removeCar(car4);


        System.out.println("3.---Returning a list of cars ----");
        System.out.println(carService.getCars());

        //4.returning cars with V12 engine;
        System.out.println("4.---Returning cars with V12 engine ----");
        System.out.println(carService.getByEngineType(V12));

        //5.returning cars produced before 1999;
        System.out.println("5.---Cars produced before 1999 ----");
        System.out.println(carService.getByManufacturedBeforeYear(1999));

        //6.,7.Cheapest and the most expensive
        System.out.println("6.---Most expensive ----");
        System.out.println(carService.mostExpensiveCar());
        System.out.println("7.---Least expensive ----");
        System.out.println(carService.leastExpensiveCar());

        //8.
        System.out.println("8.---Cars  with at least 3 manufacturers----");
        System.out.println(carService.carsWithAtLeastNumberOfManufacturers(3));

        //10.
        System.out.println("10.---Is car in the list? ----");
        Car car5 = new Car("Forester", "ForesterSUV", 10000, 1998, EngineType.S3);
        car5.addManufacturer(subaru);

        System.out.println(carService.IsCarInTheList(car5));

        System.out.println("With hash codes: ");
        System.out.println(Objects.equals(car5.hashCode(), car1.hashCode()));

        Car car6 = new Car("ForesterNotTheSame", "ForesterSUV", 10000, 1998, EngineType.S3);
        car5.addManufacturer(subaru);

        System.out.println(carService.IsCarInTheList(car6));

        System.out.println("With hash codes: ");
        System.out.println(Objects.equals(car6.hashCode(), car1.hashCode()));

        //9.
        System.out.println("9.---Sorted Ascending cars----");
        System.out.println("---by price ---");
        System.out.println(carService.carsAscending("price"));

        System.out.println("---by name ---");
        System.out.println(carService.carsAscending("name"));

        System.out.println("---by year of manufacture ---");
        System.out.println(carService.carsAscending("yearOfManufacture"));


        System.out.println("---Sorted Descending cars----");
        System.out.println("---by price ---");
        System.out.println(carService.carsDescending("price"));
        System.out.println("---by name ---");
        System.out.println(carService.carsDescending("name"));
        System.out.println("---by engine ---");
        System.out.println(carService.carsAscending("engine type"));
        System.out.println("---by year of manufacture ---");
        System.out.println(carService.carsDescending("yearOfManufacture"));

        //11.
        System.out.println("11.----return cars manufactured by a specific manufacturer------");
        System.out.println(carService.carsWithSpecificManufacturer(volkswagen2));

        //12.
        System.out.println("12.------Manufactured by specific manufacturer with the year of establishment...------");
        System.out.println("-equals to 1946- ");
        System.out.println(carService.carsWithManufacturerAndYear(Year.of(1946), RelationalOperators.EQUAL));
        System.out.println(" - less than 1946 - ");
        System.out.println(carService.carsWithManufacturerAndYear(Year.of(1946), RelationalOperators.LESS_THAN));
        System.out.println(" - greater than 1937 - ");
        System.out.println(carService.carsWithManufacturerAndYear(Year.of(1937), RelationalOperators.GREATER_THAN));


    }
}
