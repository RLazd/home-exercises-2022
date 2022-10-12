package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ListForOneAbstractClass {
    List<DrugsGeneral> list = new ArrayList<>();

    public void add(int i, DrugsGeneral el) {
        list.add(i, el);
    }

    public Object get(int i) {
        return list.get(i);
    }
}
