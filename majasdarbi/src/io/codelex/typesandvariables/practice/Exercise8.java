package io.codelex.typesandvariables.practice;
//Write a Java program to convert minutes into a number of years and days.

public class Exercise8 {


    public static void main(String[] args) {
        calculateMin(5);
        calculateDays(5);
    }

    public static void calculateMin(int minutes) {
        double days = minutes * 0.000694;
        System.out.println(minutes + " minutes is days : " + days);
    }

    public static void calculateDays(int minutes) {
        double years = minutes * 1.901 * Math.pow(10, -6);
        System.out.println(minutes + " minutes is years: " + years);

    }


}
