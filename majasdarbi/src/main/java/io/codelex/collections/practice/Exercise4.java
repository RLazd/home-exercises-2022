package io.codelex.collections.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> names = new HashSet<>();

        while (true) {
            System.out.println("Enter name: ");
            String name = scan.nextLine();
            if (name == "") {
                break;
            } else {
                names.add(name);
            }
        }

        System.out.print("Unique name list contains: ");
        for (String name : names) {
            System.out.print(name + " ");
        }

    }
}
