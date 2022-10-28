package io.codelex.generics.practice;

import io.codelex.generics.practice.exercise1.Antibiotics;
import io.codelex.generics.practice.exercise1.DrugsGeneral;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {

        //----------------------------1----------------------------------------
        List<DrugsGeneral> drugs = new ArrayList<>();
        Antibiotics drugGeneral2 = new Antibiotics("Cephalosporins", "Cefalexin", 5);
        Antibiotics penicillin = new Antibiotics("Antibiotics", "Penicillin", 10);
        add(drugGeneral2, drugs);
        add(penicillin, drugs);
        System.out.println("Multiple subclasses: " + drugs);


        //----------------------------2------------------------------------------

        //----addAllY----- more restrictive------
        List<Antibiotics> antibiotics = new ArrayList<>();
        Antibiotics macrolide = new Antibiotics("Synthetic Antibiotics", "Erythromycin", 15);
        Antibiotics quinolone = new Antibiotics("Synthetic Antibiotics", "Ciprofloxacin", 21);
        antibiotics.add(macrolide);
        antibiotics.add(quinolone);

        List<Antibiotics> antibiotics2 = new ArrayList<>();

        addAllY(antibiotics, antibiotics2);
        System.out.println("Just antibiotics: " + antibiotics2);
                 //Wont allow:
        //addAllY(antibiotics, drugs);


        //----addAllX----- less restrictive-----------
                //will allow:
        addAllX(antibiotics, drugs);
        System.out.println(antibiotics2);
                //also will allow:
        addAllX(antibiotics, antibiotics2);

    }

    public static <V> void add(V value, List<V> list) {
        list.add(value);
    }

    public static <V> void addAllY(List<V> v, List<V> l) {
        for (V el : v) l.add(el);
    }

    public static <V> void addAllX(List<V> v, List<? super V> l) {
        for (V el : v) l.add(el);
    }


}
