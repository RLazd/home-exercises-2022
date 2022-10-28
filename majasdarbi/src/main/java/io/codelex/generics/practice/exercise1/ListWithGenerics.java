package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ListWithGenerics<V> {
    List<V> list = new ArrayList<>();

    public void add(int i, V el) {
        list.add(i, el);
    }

    public Object get(int i) {
        return list.get(i);
    }

    @Override
    public String toString() {
        return "ListWithGenerics{" +
                "list=" + list +
                '}';
    }
}
