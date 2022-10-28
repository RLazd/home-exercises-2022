package io.codelex.generics.practice.exercise1;

public class Exercise1 {
    public static <T> void main(String[] args) {

        //---------------------ListForJustOneClass--------------------------------------------
        ListForJustOneClass drugsString = new ListForJustOneClass();
        drugsString.add(0, "Antibiotics");
        drugsString.add(1, "Stimulants");
        drugsString.add(2, "Antidepressants");

        System.out.println("String list: " + drugsString);
        System.out.println("O. element: " + drugsString.get(0));

        //Abstract Class ---------ListForOneClass-------------------------------------------------------
        ListForOneAbstractClass listOfDrugsGeneral = new ListForOneAbstractClass();
        Stimulants drugGeneral1 = new Stimulants("Stimulants", "Nicotine", "Inhaling, dermal");
        Stimulants drugGeneral2 = new Stimulants("Stimulants", "Adderall", "Per os");
        Antibiotics drugGeneral3 = new Antibiotics("Antibiotics", "Penicillin", 10);

        listOfDrugsGeneral.add(0, drugGeneral1);
        listOfDrugsGeneral.add(1, drugGeneral2);
        listOfDrugsGeneral.add(2, drugGeneral3);

        System.out.println(" List using one abstract class: " + listOfDrugsGeneral.get(1));

        //Generic types --------------ListWithGenerics------------------------------------------------------------
        ListWithGenerics drugs = new ListWithGenerics();
        drugs.add(0, drugGeneral1);
        drugs.add(1, drugGeneral2);
        drugs.add(2, drugGeneral3);
        System.out.println("Drug list from ListWithGenerics: " + drugs);

        ListWithGenerics integers = new ListWithGenerics();
        integers.add(0, 0);
        integers.add(1, 1);
        integers.add(2, 2);

    }
}
