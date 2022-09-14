package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDiceExercise9 {
    private static int desiredSum;

    private static int firstDice;
    private static int secondDice;
    private static int diceSum;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sum: ");

        desiredSum = in.nextInt();
        System.out.println("Desired sum: " + desiredSum);


        do {
            rollDices();
            
        } while (!isDiceSumEqualToDesiredSum());


    }

    private static void rollDices() {

        Random random = new Random();
        firstDice = random.nextInt(6) + 1;
        secondDice = random.nextInt(6) + 1;

    }

    private static boolean isDiceSumEqualToDesiredSum() {
        diceSum = firstDice + secondDice;
        System.out.println(firstDice + " and " + secondDice + " = " + diceSum);
        return desiredSum == diceSum;
    }
}
