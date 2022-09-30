package io.codelex.oop.shape;

public class Cone extends Shape3D {
    public Cone(int height, int base) {
        super(height, base);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * base / 2 * height;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(base / 2, 2) + Math.PI * base / 2 * height;
    }

    @Override
    double calculateVolume() {
        return 1 / 3 * Math.PI * Math.pow(base / 2, 2) * height;
    }
}
