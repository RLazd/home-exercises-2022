package io.codelex.polymorphism.practice.exercise1;

public class Subaru implements Car, NitrousOxideEngine {

    private Integer currentSpeed = 0;

    @Override
    public void useNitrousOxideEngine() {
        this.currentSpeed = currentSpeed + 25;
    }

    @Override
    public void speedUp() {
        currentSpeed += 11;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 11;
    }

    @Override
    public Integer showCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String getName() {
        return "Subaru";
    }
}
