package io.codelex.generics.practice.exercise1;

public class Antidepressants extends DrugsGeneral {

    public Antidepressants(String classOfDrug, String name) {
        super(classOfDrug, name);
    }

    @Override
    public void sideEffects() {
        System.out.println("Constipation, loss of appetite, anxiousness, headaches");
    }
}
