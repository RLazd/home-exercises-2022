package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ListForJustOneClass {
    List<String> list = new ArrayList<>();

    public void add(int i, String el) {
        list.add(i, el);
    }

    public Object get(int i) {
        return list.get(i);
    }

    @Override
    public String toString() {
        return "ListForJustOneClass{" +
                "list=" + list +
                '}';
    }
}
