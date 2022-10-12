package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Mouse extends Mammal {

    public Mouse(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Squeak");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Vegetable) {
            addFoodEaten(food.quantity);
            System.out.println(this);
        } else {
            System.out.println("Mouses are not eating that typeof food!");
        }
    }

    private String weight() {
        DecimalFormat format = new DecimalFormat("0.#");
        return format.format(animalWeight);
    }

    @Override
    public String toString() {
        return animalType + " [" + animalName + ", " + weight() + ", " + livingRegion + ", " + foodEaten + "]";
    }

}
