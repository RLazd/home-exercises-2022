package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int lowerBound = 1;
        int upperBound = 100;
        int count = upperBound - lowerBound + 1;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }

        average = (double)sum/count;

        System.out.println("The sum of "+ lowerBound + " to " + upperBound + " is " + sum + ".");
        System.out.println("The average is " + average + ".");
    }
}


//    Write a program called SumAverageRunningInt to produce the sum of 1, 2, 3, ..., to 100.
//    Store 1 and 100 in variables lowerbound and upperbound,
//    so that we can change their values easily.
//    Also compute and display the average. The output shall look like:
//
//        ```
//        The sum of 1 to 100 is 5050
//        The average is 50.5
//        ```