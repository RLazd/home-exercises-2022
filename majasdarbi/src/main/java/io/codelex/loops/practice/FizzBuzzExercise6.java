package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzzExercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter max value: ");
        int maxValue = in.nextInt();

        for (int i = 1; i <= maxValue; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.print("FizzBuzz ");
                } else {
                    System.out.print("Fizz ");
                }
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}

