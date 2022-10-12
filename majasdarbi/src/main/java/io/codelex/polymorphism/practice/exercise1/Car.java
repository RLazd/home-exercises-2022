package io.codelex.polymorphism.practice.exercise1;

public interface Car {

    void speedUp();

    void slowDown();

    Integer showCurrentSpeed();

    String getName();

    default void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

}
