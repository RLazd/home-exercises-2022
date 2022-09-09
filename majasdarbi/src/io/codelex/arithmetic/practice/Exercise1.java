package io.codelex.arithmetic.practice;
//Write a Java program to accept two integers and return true if the either one is 15 or if their sum or difference is 15.

import java.util.Scanner;

public class Exercise1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1:");
        int first = scanner.nextInt();
        System.out.println("2:");
        int second = scanner.nextInt();


        System.out.println(isEitherFifteenOrSumOrDifferenceisFifteen(first, second));

    }

    private static Boolean isEitherFifteenOrSumOrDifferenceisFifteen(int first, int second) {
        if (isEitherFifteen(first, second) || isDifference(first, second) || isSumFifteen(first,second)) {
            return true;
        }else {
            return false;
        }
    }

    private static boolean isEitherFifteen(int first, int second) {
        return first == 15 || second == 15;
    }

    private static boolean isDifference(int first, int second) {
        return first-second == 15 || second-first==15;
    }

    private static boolean isSumFifteen(int first, int second) {
        return first+second == 15 || second+first==15;
    }



}
