package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {


    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {

            String numerator = "";
            int divisor = 0;
            int numeratorToInt = 0;


            System.out.println("Enter the numerator");
            numerator = scanner.nextLine();

            if (numerator.toLowerCase().matches("\\bq.*")) {
                exit = true;
                break;
            }

            try {
                numeratorToInt = Integer.parseInt(numerator);
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                System.out.println(e);
                continue;
            }


            try {
                System.out.println("Enter the divisor");
                divisor = scanner.nextInt();

                System.out.println(numeratorToInt + " / " + divisor + " = " + numeratorToInt / divisor);

            } catch (InputMismatchException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");

            } catch (ArithmeticException e) {
                System.out.println("You cant divide " + numeratorToInt + " by " + divisor);
                System.out.println(e);

            } finally {
                scanner.nextLine();
                continue;
            }


        }


    }
}
