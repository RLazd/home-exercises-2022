package io.codelex.secondTest.exercise5;

import com.sun.source.tree.LambdaExpressionTree;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class exercise5 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, (String name) -> name.length() > 4);
        System.out.println(percent); //Should print out 0.75 because 75% of names are longer than 4 letters

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, (Integer n) -> n % 2 == 1);
        System.out.println(evenPercent); //Should print out 0.5 because 50% of numbers are even

    }

    public static <T> double partOf(List<T> list, Predicate<T> lambda) {
        List<T> filtered = list.stream().filter(lambda).toList();
        return (double) filtered.size() / list.size();
    }


}


//#### (generics + functional programming)
//        Implement the generic partOf method, which will return % of items satisfying the condition based on any
//        type of list and the function indicated as parameter.
//
//        Example of how it should work:
//        ```java
//        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
//        double percent = partOf(names, (String name) -> name.length() > 4);
//        System.out.println(percent); //Should print out 0.75 because 75% of names are longer than 4 letters
//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        double evenPercent = partOf(numbers, (Integer n) -> n % 2 == 1);
//        System.out.println(evenPercent); //Should print out 0.5 because 50% of numbers are even