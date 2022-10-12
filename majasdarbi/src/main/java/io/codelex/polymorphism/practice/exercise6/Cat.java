package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Cat extends Feline {
    String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meow");
    }

    @Override
    void eat(Food food) {
        addFoodEaten(food.quantity);
        System.out.println(this);
    }

    private String weight() {
        DecimalFormat format = new DecimalFormat("0.#");
        return format.format(animalWeight);
    }

    @Override
    public String toString() {
        return animalType + "[" + animalName + ", " + breed + ", " + weight() + ", " + livingRegion + ", " + foodEaten + "]";
    }
}
