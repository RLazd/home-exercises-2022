package io.codelex.typesandvariables.practice;

import java.util.Scanner;

//Write a program that asks the user to enter a series of single digit numbers
// and calculate the sum of all the numbers.
public class Exercise6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Please enter a single digit number: ");
            int a = userInput.nextInt();
            sum += a;
        }

        System.out.println("Sum of digits: ");
        System.out.println(sum);
    }

}
