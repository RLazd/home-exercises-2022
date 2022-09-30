package io.codelex.oop.shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 4, 5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getNumSides());
    }
}
