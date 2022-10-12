package io.codelex.polymorphism.practice.exercise1;

public class Volvo implements Car {

    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 7;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 7;
    }

    @Override
    public Integer showCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String getName() {
        return "Volvo";
    }
}
