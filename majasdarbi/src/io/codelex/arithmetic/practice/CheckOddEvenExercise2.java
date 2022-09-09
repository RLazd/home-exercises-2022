package io.codelex.arithmetic.practice;

//Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise. The program shall always print “bye!” before exiting.

import java.util.Scanner;

public class CheckOddEvenExercise2 {
    public static void main(String[] args) {
        int inputNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        inputNumber = scanner.nextInt();

        oddOrEven(inputNumber);

        // Īsāks variants:
        // String evenOdd = (inputNumber %2 == 0) ? "Even" : "Odd";
        // System.out.println(evenOdd);
    }

    private static void oddOrEven(int inputNumber) {
        if (inputNumber %2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        System.out.println("Bye!");
    }
}
