package io.codelex.generics.practice;

import io.codelex.generics.practice.exercise1.Antibiotics;
import io.codelex.generics.practice.exercise1.DrugsGeneral;
import io.codelex.generics.practice.exercise1.Stimulants;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {


    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("String");
        String concatenate = concatenate(list1);
        System.out.println(concatenate);

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        System.out.println(concatenate(list2));

        List<Object> objects = new ArrayList<>();
        objects.add(new Object());
        System.out.println("One Object: " + concatenate(objects));

        List<DrugsGeneral> drugs = new ArrayList<>();
        Stimulants drugGeneral2 = new Stimulants("Stimulants", "Adderall", "Per os");
        Antibiotics drugGeneral3 = new Antibiotics("Antibiotics", "Penicillin", 10);
        drugs.add(drugGeneral2);
        drugs.add(drugGeneral3);

        System.out.println(concatenate(drugs));


    }

    public static <T> String concatenate(List<T> list) {
        String result = "";
        String separator = "";

        if (isAStringList(list)) {
            result = "String:";
            separator = " ";
        } else if (isAnIntegerList(list)) {
            result = "Integers:";
            separator = "+";
        }

        for (Object el : list) {
            result = result + separator + el.toString();
        }
        return result;
    }


    public static <T> boolean isAStringList(List<T> objectList) {
        Boolean isClass = true;
        if (objectList instanceof List<?>) {
            for (Object object : objectList) {
                if (!(object instanceof String)) {
                    return false;
                }
            }
        }
        return isClass;
    }

    public static boolean isAnIntegerList(List<?> objectList) {
        Boolean isClass = true;
        if (objectList instanceof List<?>) {
            for (Object object : objectList) {
                if (!(object instanceof Integer)) {
                    return false;
                }
            }
        }
        return isClass;
    }

//    public static <T> boolean isAClassList(List<T> objectList, Object x) {
//        // ??? - te varetu padot String vai Integer kka - java.lang.class String ?? ?????
//        Boolean isClass = true;
//        if (objectList instanceof List<?>) {
//            for (Object object : objectList) {
//                if (!(object instanceof x)) {
//                    return false;
//                }
//            }
//        }
//        return isClass;
//    }


}




