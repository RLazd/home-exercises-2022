package io.codelex.generics.practice.exercise1;

public class Antibiotics extends DrugsGeneral {

    int daysToBeTaken;

    public Antibiotics(String classOfDrug, String name, int daysToBeTaken) {
        super(classOfDrug, name);
        this.daysToBeTaken = daysToBeTaken;
    }

    @Override
    public void sideEffects() {
        System.out.println("Diarrhea, headaches");
    }
}
