package io.codelex.arrays.practice;

import java.text.DecimalFormat;

public class Exercise3 {

    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};

        //fixme - calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of the array elements is : " + sum);

        //fixme - calculate average value

        double average = (double) sum / numbers.length;
        System.out.println(String.format("Average value of the array elements is : %.2f", average));

    }
}
