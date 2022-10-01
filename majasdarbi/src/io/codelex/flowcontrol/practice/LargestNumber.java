package io.codelex.flowcontrol.practice;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        int[] arrayOfNum;

        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        arrayOfNum = new int[]{num1, num2, num3};

        Arrays.sort(arrayOfNum);
        System.out.println("The 1st number:" + arrayOfNum[0]);
        System.out.println("The 2nd number:" + arrayOfNum[1]);
        System.out.println("The 3rd number:" + arrayOfNum[2]);

        System.out.println(Arrays.toString(arrayOfNum));

    }

}
