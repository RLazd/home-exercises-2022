package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();

        String number = num;
        int sum = 0;
        do {
            sum = 0;
            String[] arrayOfDigits = number.split("");
            for (String digit : arrayOfDigits) {
                sum += Math.pow(Integer.parseInt(digit), 2);
            }
            number = Integer.toString(sum);
        } while (number.length() != 1);

        System.out.println("Is happy: " + number.equals("1"));

    }
}
