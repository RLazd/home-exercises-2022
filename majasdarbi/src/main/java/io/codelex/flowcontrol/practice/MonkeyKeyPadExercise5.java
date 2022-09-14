package io.codelex.flowcontrol.practice;

import java.util.Arrays;
import java.util.Scanner;

public class MonkeyKeyPadExercise5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter letters");
        String string = in.next().toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (character == 'a' || character == 'b' || character == 'c') {
                System.out.print(2);
            } else if (character == 'd' || character == 'e' || character == 'f') {
                System.out.print(3);
            } else if (character == 'g' || character == 'h' || character == 'i') {
                System.out.print(4);
            } else if (character == 'j' || character == 'k' || character == 'l') {
                System.out.print(5);
            } else if (character == 'm' || character == 'n' || character == 'o') {
                System.out.print(6);
            } else if (character == 'p' || character == 'q' || character == 'r' || character == 's') {
                System.out.print(7);
            } else if (character == 't' || character == 'u' || character == 'v') {
                System.out.print(8);
            } else if (character == 'w' || character == 'x' || character == 'y' || character == 'z') {
                System.out.print(9);
            } else {
                System.out.println(".");
            }
        }

        System.out.println();

        for (int i = 0; i < string.length(); i++) {
           switch (string.charAt(i)) {
               case 'a':
               case 'b':
               case 'c':
                    System.out.print(2);
                   break;
               case 'd':
               case 'e':
               case 'f':
                   System.out.print(3);
                   break;
               case 'g':
               case 'h':
               case 'i':
                   System.out.print(4);
                   break;
               case 'j':
               case 'k':
               case 'l':
                   System.out.print(5);
                   break;
               case 'm':
               case 'n':
               case 'o':
                   System.out.print(6);
                   break;
               case 'p':
               case 'q':
               case 'r':
               case 's':
                   System.out.print(7);
                   break;
               case 't':
               case 'u':
               case 'v':
                   System.out.print(8);
                   break;
               case 'w':
               case 'x':
               case 'y':
               case 'z':
                   System.out.print(9);
                   break;
               default:
                   System.out.print(".");
                    break;
            }
       }

    }
}
