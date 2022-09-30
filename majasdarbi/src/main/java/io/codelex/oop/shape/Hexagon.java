package io.codelex.oop.shape;

public class Hexagon extends Shape {

    private int side;

    public Hexagon(int side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * side;
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
    }
}
