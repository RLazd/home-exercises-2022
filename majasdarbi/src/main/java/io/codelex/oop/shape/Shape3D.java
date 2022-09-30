package io.codelex.oop.shape;

public abstract class Shape3D extends Shape {
    int height;
    int base;

    public Shape3D(int height, int base) {
        this.height = height;
        this.base = base;
    }

    abstract double calculateVolume();
}
