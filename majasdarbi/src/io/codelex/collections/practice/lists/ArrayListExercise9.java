package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("Duplicates")
public class ArrayListExercise9 {

    public static void main(String[] args) {

        List<String> firstList = new ArrayList<>();
        firstList.add("Red");
        firstList.add("Green");
        firstList.add("Black");
        firstList.add("White");
        firstList.add("Pink");
        System.out.println("List of first array: " + firstList);

        List<String> secondList = new ArrayList<>();
        secondList.add("Red");
        secondList.add("Green");
        secondList.add("Black");
        secondList.add("Pink");
        System.out.println("List of second array: " + secondList);

        //TODO: Write a Java program to join two array lists.
        List<String> joinedList = new ArrayList<>();
        joinedList.addAll(firstList);
        joinedList.addAll(secondList);

        System.out.println(joinedList);

//        //
//        List<String> joinedList2 = Stream.of(firstList, secondList)
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList());
//
//        System.out.println(joinedList2);
//
//        //
//        List<Object> newList = new ArrayList<>();
//        Stream.of(firstList, secondList).forEach(newList::addAll);
//
//        System.out.println(newList);

    }

}
