package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Tiger extends Feline {

    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("ROARR");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Meat) {
            addFoodEaten(food.quantity);
            System.out.println(this);
        } else {
            System.out.println("Tigers are not eating that type of food!");
        }
    }

    private String weight() {
        DecimalFormat format = new DecimalFormat("0.#");
        return format.format(animalWeight);
    }

    @Override
    public String toString() {
        return animalType + "[" + animalName + ", " + weight() + ", " + livingRegion + ", " + foodEaten + "]";
    }
}
