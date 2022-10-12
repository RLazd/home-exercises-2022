package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        //TODO: Add 10 values to list
        List<String> numbers = new ArrayList<>();
        numbers.add("00");
        numbers.add("02");
        numbers.add("03");
        numbers.add("04");
        numbers.add("05");
        numbers.add("06");
        numbers.add("07");
        numbers.add("08");
        numbers.add("09");

        //TODO: Add new value at 5th position
        numbers.set(5, "Fifth position");

        //TODO: Change value at last position (Calculate last position programmatically)
        numbers.set(numbers.size() - 1, "Last");

        //TODO: Sort your list in alphabetical order
        Collections.sort(numbers);
        System.out.println(numbers);

        //TODO: Check if your list contains "Foobar" element
        System.out.println(numbers.contains("Foobar"));

        //TODO: Print each element of list using loop
        for (String element : numbers) {
            System.out.println(element);
        }
    }

}
