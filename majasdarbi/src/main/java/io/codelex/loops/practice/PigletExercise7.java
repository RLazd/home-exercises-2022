package io.codelex.loops.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static org.apache.commons.lang3.RandomUtils.nextInt;

public class PigletExercise7 {
    private static int score;
    private static String rollAgain;
    private static int randomNum;

    public static void main(String[] args) {

        System.out.println("Welcome to piglet!");

        do {
            play();
            validateRoll();
        } while (rollAgain.equals("y"));

        System.out.println("Your score is " + score);
        System.out.println("Game over.");
    }

    private static int randomInteger() {
        Random random = new Random();
        return random.nextInt(6 - 1 + 1) + 1;
        //formula(pieraksti sev): random.nextInt(max + 1 - min) + min
    }

    private static void play() {
        randomNum = randomInteger();

        System.out.println("You rolled: " + randomNum);
    }

    private static void validateRoll() {
        if (randomNum == 1) {
            rollAgain = "n";
            score = 0;
            return;
        } else {
            score += randomNum;
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Roll again? y/n");
        rollAgain = in.next().toLowerCase();

        validateIfUserSelectedYorN(in);
    }

    private static void validateIfUserSelectedYorN(Scanner in) {
        while (!rollAgain.equals("y") && !rollAgain.equals("n")) {
            System.out.println("You must select y or n");
            rollAgain = in.next().toLowerCase();
        }
    }
}
