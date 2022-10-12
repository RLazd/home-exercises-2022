package io.codelex.generics.practice.exercise1;

public abstract class DrugsGeneral {

    String classOfDrug;
    String name;

    public DrugsGeneral(String classOfDrug, String name) {
        this.classOfDrug = classOfDrug;
        this.name = name;
    }

    @Override
    public String toString() {
        return "DrugsGeneral{" +
                "classOfDrug='" + classOfDrug + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public abstract void sideEffects();
}
