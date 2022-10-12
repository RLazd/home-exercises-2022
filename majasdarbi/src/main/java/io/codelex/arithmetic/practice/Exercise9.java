package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int weightInKg = 0;
        int heightInCm = 0;
        double weightInPounds = weightInKg * 2.2;
        double heightInInches = heightInCm * 0.39;
        double bmi = weightInPounds * 702 / Math.pow(heightInInches, 2);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your wieght in kilos: ");
        weightInKg = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your height in cm: ");
        heightInCm = scanner1.nextInt();

        if (bmi < 18.5) {
            System.out.println("You re underweight.");
        } else if (bmi > 25) {
            System.out.println("You re overweight.");
        } else {
            System.out.println("Your weight is optimal.");
        }
    }
}

//    Write a program that calculates and displays a person's body mass index (BMI).
//        A person's BMI is calculated with the following formula:
//        ```BMI = weight x 703/ height ^ 2```.
//        Where weight is measured in pounds and height is measured in inches.
//        Display a message indicating whether the person has optimal weight,
//        is underweight, or is overweight.
//        A sedentary person's
//        weight is considered optimal if his or her BMI is between 18.5 and 25.
//        If the BMI is less than 18.5, the person is considered underweight.
//        If the BMI value is greater than 25, the person is considered overweight.
//
//        Your program must accept metric units.
