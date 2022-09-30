package io.codelex.oop.cars;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Car  {

    private String name;
    private String model;
    private double price;
    private Year yearOfManufacture;

    private List<Manufacturer> manufacturers = new ArrayList<>();
    private EngineType typeOfEngine;


    public Car(String name, String model, double price, int yearOfManufacture, EngineType typeOfEngine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = Year.of(yearOfManufacture);
        this.typeOfEngine = typeOfEngine;
    }

    public Car(String name, String model, EngineType typeOfEngine) {
        this.name = name;
        this.model = model;
        this.typeOfEngine = typeOfEngine;
    }

    public void addManufacturer(Manufacturer manufacturer) {
        manufacturers.add(manufacturer);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = Year.of(yearOfManufacture);
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public Year getYearOfManufacture() {
        return yearOfManufacture;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public EngineType getTypeOfEngine() {
        return typeOfEngine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return name.equals(car.name) && model.equals(car.model) && typeOfEngine == car.typeOfEngine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, typeOfEngine);
    }

    @Override
    public String toString() {
        return "Car: " +
                "name= " + name + '\'' +
                ", model= " + model + '\'' +
                ", price= " + price +
                ", year of manufacture= " + yearOfManufacture +
                ", manufacturers = " + manufacturers +
                ", typeOfEngine = " + typeOfEngine +
                ".\n";
    }

}
