package io.codelex.typesandvariables.practice;

import java.util.Scanner;

//Write a program that prompts the user to enter a string
// and displays the number of the uppercase letters in the string
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");

        String inputString = input.nextLine();

        //String upperCaseLetters= inputString.stream().filter(chr -> Character.isUpperCase(chr));
        // System.out.println(upperCaseLetters);
        // String upperCaseLetters = inputString.filter(chr -> Character.isUpperCase(chr));
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
