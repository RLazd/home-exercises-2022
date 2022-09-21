package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise6 {

    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            int upper = 100;
            int lower = 1;
            int randomNumber = (int) (Math.random() * (upper - lower)) + lower;
            array1[i] = randomNumber;
        }

        for (int i = 0; i < 10; i++) {
            array2[i] = array1[i];
        }

        array1[9] = -7;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}