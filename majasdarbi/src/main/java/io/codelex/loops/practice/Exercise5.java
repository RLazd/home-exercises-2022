package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {

    final static int maxAmountOfDots = 30;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String first = in.next();
        System.out.println("Enter second word: ");
        String second = in.next();


        String repeatedDots = "";
        int max = maxAmountOfDots - first.length() - second.length();

        for (int i = 0; i < max; i++) {
            repeatedDots += ".";
        }

        System.out.println(first + repeatedDots + second);

        ////Cits variants:

        String indexForABook = first + ".".repeat(maxAmountOfDots - first.length() - second.length()) + second;
        System.out.println(indexForABook);

    }
}

