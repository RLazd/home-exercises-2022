package io.codelex.oop.cars;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getByEngineType(EngineType type) {
        return cars.stream()
                .filter(car -> car.getTypeOfEngine() == type)
                .toList();
    }

    public List<Car> getByManufacturedBeforeYear(int year) {
        return cars.stream()
                .filter(car -> car.getYearOfManufacture().isBefore(Year.of(year)))
                .toList();
    }

    public Car mostExpensiveCar() {
        Car mostExpensiveCar = cars.get(0);
        double price = cars.get(0).getPrice();
        for (Car car : cars) {
            if (car.getPrice() > price) {
                price = car.getPrice();
                mostExpensiveCar = car;
            }
        }

        return mostExpensiveCar;
    }

    public Car leastExpensiveCar() {
        Car leastExpensiveCar = cars.get(0);
        double price = cars.get(0).getPrice();
        for (Car car : cars) {
            if (car.getPrice() < price) {
                price = car.getPrice();
                leastExpensiveCar = car;
            }
        }
        return leastExpensiveCar;
    }

    public List<Car> carsWithAtLeastNumberOfManufacturers(int countOfManufacturers) {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= countOfManufacturers)
                .toList();
    }

    public boolean IsCarInTheList(Car car) {
        return cars.contains(car);
    }


    //11. returning a list of cars manufactured by a specific manufacturer

    public List<Car> carsWithSpecificManufacturer(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .toList();
    }


    // 12. returning the list of cars manufactured by the manufacturer
    //with the year of establishment <,>, <=,> =, =,! = from the given.

    public List<Car> carsWithManufacturerAndYear(Year year, RelationalOperators relationalOperator) {

        List<Car> filteredCars = new ArrayList<>();

        switch (relationalOperator) {
            case LESS_THAN: {
                for (Car car : cars) {
                    for (Manufacturer manufacturer : car.getManufacturers()) {
                        if (manufacturer.getYearOfEstablishment().isBefore(year)) {
                            filteredCars.add(car);
                        }
                    }
                }
                break;
            }

            case GREATER_THAN: {
                for (Car car : cars) {
                    for (Manufacturer manufacturer : car.getManufacturers()) {
                        if (manufacturer.getYearOfEstablishment().isAfter(year)) {
                            filteredCars.add(car);
                        }
                    }
                }
                break;
            }

            case GREATER_THAN_OR_EQUAL: {
                for (Car car : cars) {
                    for (Manufacturer manufacturer : car.getManufacturers()) {
                        if (manufacturer.getYearOfEstablishment().isAfter(year) ||
                                manufacturer.getYearOfEstablishment().equals(year)) {
                            filteredCars.add(car);
                        }
                    }
                }
                break;
            }

            case LESS_THAN_OR_EQUAL: {
                for (Car car : cars) {
                    for (Manufacturer manufacturer : car.getManufacturers()) {
                        if (manufacturer.getYearOfEstablishment().isBefore(year) ||
                                manufacturer.getYearOfEstablishment().equals(year)) {
                            filteredCars.add(car);
                        }
                    }
                }
                break;
            }

            case EQUAL: {
                for (Car car : cars) {
                    for (Manufacturer manufacturer : car.getManufacturers()) {
                        if (manufacturer.getYearOfEstablishment().equals(year)) {
                            filteredCars.add(car);
                        }
                    }
                }
                break;
            }

            case NOT_EQUAL: {
                for (Car car : cars) {
                    for (Manufacturer manufacturer : car.getManufacturers()) {
                        if (!manufacturer.getYearOfEstablishment().equals(year)) {
                            filteredCars.add(car);
                        }
                    }
                }
                break;
            }

        }

        return filteredCars;
    }


    // 9. returning a list of all cars sorted according to the passed parameter :ascending/descending
    public List<Car> carsAscending(String sortBy) {
        switch (sortBy.toLowerCase()) {
            case "price":
                return cars.stream().sorted(Comparator.comparing(Car::getPrice)).toList();
            case "yearofmanufacture":
                return cars.stream().sorted(Comparator.comparing(Car::getYearOfManufacture)).toList();
            case "model":
                return cars.stream().sorted(Comparator.comparing(Car::getModel)).toList();
            case "name":
                return cars.stream().sorted(Comparator.comparing(Car::getName)).toList();
            case "engine type":
                return cars.stream().sorted(Comparator.comparing(Car::getTypeOfEngine)).toList();
            default:
                System.out.println("Choose valid parameter to sort by");
                return null;
        }

    }

    public List<Car> carsDescending(String sortBy) {
        switch (sortBy.toLowerCase()) {
            case "price":
                return cars.stream().sorted(Comparator.comparing(Car::getPrice).reversed()).toList();
            case "yearofmanufacture":
                return cars.stream().sorted(Comparator.comparing(Car::getYearOfManufacture).reversed()).toList();
            case "model":
                return cars.stream().sorted(Comparator.comparing(Car::getModel).reversed()).toList();
            case "name":
                return cars.stream().sorted(Comparator.comparing(Car::getName).reversed()).toList();
            case "engine type":
                return cars.stream().sorted(Comparator.comparing(Car::getTypeOfEngine).reversed()).toList();
            default:
                System.out.println("Choose valid parameter to sort by");
                return null;
        }

    }
}
