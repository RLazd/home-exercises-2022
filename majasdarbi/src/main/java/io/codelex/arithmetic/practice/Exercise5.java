package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int maxValue= 100;
        int minValue = 1;
        int randomNum = (int)(Math.random()*(maxValue - minValue +1) + minValue);
        int inputNumber;

        //System.out.println(randomNum);

        Scanner scanner = new Scanner(System.in);
        System.out.println(" I'm thinking of a number between " + minValue + " - " + maxValue + ". Try to guess it.");
        inputNumber = scanner.nextInt();

        if (inputNumber == randomNum) {
            System.out.println("You guessed it!  What are the odds?!?");
        } else if (inputNumber > randomNum) {
            System.out.println("Sorry, you are too high.  I was thinking of " + randomNum);
        } else if (inputNumber < randomNum){
            System.out.println("Sorry, you are too low.  I was thinking of " + randomNum);
        } else {
            System.out.println("invalid");
        }

    }


}

//    Write a program that picks a random number from 1-100.
//    Give the user a chance to guess it.
//    If they get it right, tell them so.
//    If their guess is higher than the number, say "Too high."
//    If their guess is lower than the number, say "Too low."
//    Then quit. (They don't get any more guesses for now.)
//
//        ```
//        I'm thinking of a number between 1-100.  Try to guess it.
//        > 13
//
//        Sorry, you are too low.  I was thinking of 34.
//        ```
//
//        ```
//        I'm thinking of a number between 1-100.  Try to guess it.
//        > 79
//
//        Sorry, you are too high.  I was thinking of 51.
//        ```
//
//        ```
//        I'm thinking of a number between 1-100.  Try to guess it.
//        > 42
//
//        You guessed it!  What are the odds?!?
//        ```