package io.codelex.oop.shape;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }
}
