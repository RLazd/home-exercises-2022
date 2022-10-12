package io.codelex.loops.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import static jdk.vm.ci.meta.JavaKind.Int;

public class NumberSquareExercise10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter min value: ");
        int min = in.nextInt();
        System.out.println("Enter max value: ");
        int max = in.nextInt();

        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int k = min; k <= i - 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

    }

}


