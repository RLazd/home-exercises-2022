package io.codelex.practice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise2 {
    private static LocalDate launchDate;

    public static void main(String[] args) {
        launchDate = launchDate();
        System.out.println("Server launched: " + launchDate);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year (yyyy) : ");
        String year = scan.nextLine();
        System.out.print("Enter month (name of month): ");
        String month = scan.nextLine();

        desiredMonthAndYearUpdateDate(year, month);

    }

    private static LocalDate launchDate() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a date (dd.MM.yyyy): ");
        String str = scan.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(str, formatter);
    }

    private static void desiredMonthAndYearUpdateDate(String year, String month) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        LocalDate desiredDate = LocalDate.parse("01 " + month.substring(0, 3) + " " + year, formatter);


        LocalDate updateDate = launchDate;
        while (updateDate.isBefore(desiredDate)) {
            updateDate = updateDate.plusDays(14);

        }
        System.out.println("Update in " + month + " : " + updateDate);


        if (updateDate.plusDays(14).getMonth() == desiredDate.getMonth()) {
            System.out.println("Update in " + month + " : " + updateDate.plusDays(14));
        }

    }


}


//    Server update must be performed every two weeks (14 days).
//        Given a date when server is launched create a method that calculates at
//        which dates server must be updated in given month.
//        For example if server is launched on 02.02.2022 it must be updated on 16th of February, then on 2nd of March.
//
//        So if user inputs server launch date (for ex. 01.06.2022), year (for ex. 2022) and month (for ex. September),
//        then application should return at which dates server must be updated in September 2022.