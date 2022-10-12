package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");

        String inputString = input.nextLine();

        System.out.println(inputString.replaceAll("[^A-Z]", ""));

        int sum = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isUpperCase(inputString.charAt(i))) {
                sum++;
            }
        }

        System.out.println("You entered " + sum + " uppercase letters.");
    }
}
