package io.codelex.flowcontrol.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TenBillion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        long n = in.nextLong();

        if (n > Long.MIN_VALUE && n < Long.MAX_VALUE) {
            if (n < 0) {
                n *= -1;
            }
            if (n >= 10000000000L) {
                System.out.println("Number is greater or equals 10,000,000,000!");
            } else {
                int digits = String.valueOf(n).length();
                System.out.println("Number of digits in the number: " + digits);
            }
        } else {
            System.out.println("The number is not a long");
        }
    }

}
