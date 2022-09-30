package io.codelex.oop.shape;

public class Cube extends Shape3D {

    public Cube(int height, int base) {
        super(height, base);
        this.height = base;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * (height + base + base);
    }

    @Override
    public double calculateArea() {
        return 6 * base * base;
    }

    @Override
    double calculateVolume() {
        return height * base * base;
    }
}
