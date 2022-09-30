package io.codelex.oop.shape;

public class EquilateralTriangle extends Shape {

    private int side;

    public EquilateralTriangle(int side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * side;
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(3) / 4 * Math.pow(side, 2);
    }
}
