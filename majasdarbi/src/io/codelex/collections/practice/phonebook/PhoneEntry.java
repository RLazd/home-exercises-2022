package io.codelex.collections.practice.phonebook;

public class PhoneEntry {
    String name;
    String number;

    public PhoneEntry(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneEntry: " +
                "name=" + name +
                ", number=" + number + ".";
    }
}
