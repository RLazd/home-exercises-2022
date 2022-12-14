package io.codelex.oop.cars;

import java.time.Year;
import java.util.Objects;

public class Manufacturer {

    private String name;
    private String country;
    private Year yearOfEstablishment;

    public Manufacturer(String name, String country, int yearOfEstablishment) {
        this.name = name;
        this.country = country;
        this.yearOfEstablishment = Year.of(yearOfEstablishment);
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Year getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(country, that.country) &&
                Objects.equals(yearOfEstablishment, that.yearOfEstablishment);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, country, yearOfEstablishment);
    }

    @Override
    public String toString() {
        return "Manufacturer: " +
                "name= " + name + '\'' +
                ", country= " + country + '\'' +
                ", year of establishment = " + yearOfEstablishment +
                '.';
    }
}
