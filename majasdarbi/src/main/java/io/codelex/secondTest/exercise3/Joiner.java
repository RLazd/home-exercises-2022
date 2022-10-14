package io.codelex.secondTest.exercise3;

import java.util.function.BiFunction;

public class Joiner<T> {

    String separator;
    BiFunction functionToMakeString;

    public Joiner(String separator, BiFunction functionToMakeString) {
        this.separator = separator;
        this.functionToMakeString = functionToMakeString;
    }

    public String join(T... objects) {
        String result = "";
        for (T object : objects) {
            result += functionToMakeString.apply(object, separator);
        }
        return result;
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
