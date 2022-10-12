package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input distance in meters: ");
        int distanceInMeters = input.nextInt();

        Scanner input1 = new Scanner(System.in);
        System.out.println("Input hours: ");
        int hours = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Input minutes: ");
        int minutes = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Input seconds: ");
        int seconds = input3.nextInt();

        double totalTimeInSeconds = hours * 3600 + minutes * 60 + seconds;

        double metersPerSecond = (double)distanceInMeters / (double)totalTimeInSeconds;
        double kilometersPerHour = metersPerSecond * 3.6;
        double milesPerHour = ((double)distanceInMeters*3600)/(1609*(double)totalTimeInSeconds);

        System.out.println(" ..." + totalTimeInSeconds); //pareizi
        System.out.println("Input distance in meters: " + distanceInMeters);
        System.out.println("Input hours: " + hours);
        System.out.println("Input minutes: " + minutes);
        System.out.println("Input seconds: " + seconds);

        System.out.println("Your speed in meters/second is  " + metersPerSecond);
        System.out.println("Your speed in km/h is  " + kilometersPerHour);
        System.out.println("Your speed in miles/h is  " + milesPerHour);
    }
}

//     int distanceInMeters;
//    int hours;
//    int minutes;
//    int seconds;

//    public Exercise9(int distance, int hours, int minutes, int seconds) {
//        this.distanceInMeters = distance;
//        this.hours = hours;
//        this.minutes = minutes;
//        this.seconds = seconds;
//    }




/*
* Write a Java program to takes the user for a distance (in meters)
* and the time was taken (as three numbers: hours, minutes, seconds),
* and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).

```
Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158801
```
*/
