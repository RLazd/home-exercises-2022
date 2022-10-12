package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n;

        System.out.print("Input number of times (n): ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();


        System.out.print("Input number number which to multiply (i) : ");
        Scanner in2 = new Scanner(System.in);
        i = in2.nextInt();

        int multipliedI = 1;

        for (int j = 1; j <= n; j++) {
            multipliedI *= i;
            System.out.println(multipliedI);
        }

    }

}
