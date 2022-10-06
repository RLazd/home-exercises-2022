package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen",
                "Mercedes", "Tesla"};

        //ArrayList
        ArrayList<String> arrayToList = new ArrayList<>();
        Collections.addAll(arrayToList, array);
        System.out.println(arrayToList);

        //HashSet
        Set<String> arrayToSet = new HashSet<>();
        Collections.addAll(arrayToSet, array);
        System.out.println(arrayToSet);

        //HashMap
        Map<String, String> arrayToHashMap = new HashMap<>();
        for (String car : array) {
            switch (car) {
                case "Audi":
                case "BMW":
                case "Volkswagen":
                case "Mercedes":
                    arrayToHashMap.put(car, "Germany");
                    break;
                case "Honda":
                    arrayToHashMap.put(car, "Japan");
                    break;
                case "Tesla":
                    arrayToHashMap.put(car, "USA");
                    break;
            }
        }
        System.out.println(arrayToHashMap.entrySet());

    }
}
