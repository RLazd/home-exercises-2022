package io.codelex.secondTest.exercise3;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Joiner<T> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... objects) {
        return Arrays.stream(objects)
                        .map(T::toString)
                        .collect(Collectors.joining(separator));
    }

}


//    Design the Joiner<T> class,
//    which in the constructor will take a separator (string)
//    and have a join() method that allows you to specify any number of T-type objects.
//    This method will return a string joining all passed elements by calling their toString() method and
//    separating them with a separator.
//
//        Write a test for the class.
//
//        e.g. for Integers and separator "-" it should return: 1-2-3-4 ...
