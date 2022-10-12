package io.codelex.arithmetic.practice;

//Write a program called Product1ToN to compute the product of integers from 1 to 10 (i.e., 1×2×3×...×10),
// as an int.
// Take a note that it is the same as factorial of N.

public class Product1ToNExercise4 {
    public static void main(String[] args) {
        int num = 10;
        int multipliedNTimes = 1;

        for (int i = 1; i <= num ; i++) {
            multipliedNTimes *= i;
        }

        System.out.println("Product is " + multipliedNTimes + ".");
    }


}
