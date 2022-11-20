package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Animals {

    private static List<Mammal> listOfMammals = new ArrayList<>();

    public static void main(String[] args) {
        //Cat Gray 1.1 Home Persian
        while (true) {
            Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
            //Scanner scanner = new Scanner(System.in);
            System.out.println("Enter animal info: ");
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] arrayOfAnimalInfo = input.split(" ");

            Mammal mammal = determineClass(arrayOfAnimalInfo);

            mammal.makeSound();

            System.out.println("Enter food: ");
            String inputFood = scanner.nextLine();
            String[] arrayOfFoodInfo = inputFood.split(" ");

            Food food = determineFood(arrayOfFoodInfo);

            mammal.eat(food);

            listOfMammals.add(mammal);
        }

        System.out.println(listOfMammals);


    }


    private static Mammal determineClass(String[] arrayOfAnimalInfo) {
//        String doubleValue = arrayOfAnimalInfo[3] + "d";
//        System.out.println(doubleValue);
        switch (arrayOfAnimalInfo[0]) {
            case "Cat":
                return new Cat(arrayOfAnimalInfo[0], arrayOfAnimalInfo[1], Double.valueOf(arrayOfAnimalInfo[2]), arrayOfAnimalInfo[3], arrayOfAnimalInfo[4]);
            case "Tiger":
                return new Tiger(arrayOfAnimalInfo[0], arrayOfAnimalInfo[1], Double.valueOf(arrayOfAnimalInfo[2]), arrayOfAnimalInfo[3]);
            case "Mouse":
                return new Mouse(arrayOfAnimalInfo[0], arrayOfAnimalInfo[1], Double.valueOf(arrayOfAnimalInfo[2]), arrayOfAnimalInfo[3]);
            case "Zebra":
                return new Zebra(arrayOfAnimalInfo[0], arrayOfAnimalInfo[1], Double.valueOf(arrayOfAnimalInfo[2]), arrayOfAnimalInfo[3]);
        }
        return null;
    }

    private static Food determineFood(String[] arrayOfFoodInfo) {
        Integer quantity = Integer.parseInt(arrayOfFoodInfo[1]);
        switch (arrayOfFoodInfo[0]) {
            case "Vegetable":
                return new Vegetable(quantity);
            case "Meat":
                return new Meat(quantity);

        }
        return null;
    }

}
