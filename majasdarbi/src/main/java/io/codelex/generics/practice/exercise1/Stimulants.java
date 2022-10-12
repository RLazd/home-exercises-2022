package io.codelex.generics.practice.exercise1;

public class Stimulants extends DrugsGeneral {

    String routeOfAdministration;

    public Stimulants(String classOfDrug, String name, String routeOfAdministration) {
        super(classOfDrug, name);
        this.routeOfAdministration = routeOfAdministration;
    }

    @Override
    public void sideEffects() {
        System.out.println("Rapid heartbeat, palpitations, seizures");
    }


}
