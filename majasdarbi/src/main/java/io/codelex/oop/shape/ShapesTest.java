package io.codelex.oop.shape;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());


        EquilateralTriangle triangle = new EquilateralTriangle(3);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());


        Hexagon hexagon = new Hexagon(3);
        System.out.println(hexagon.calculateArea());
        System.out.println(hexagon.calculatePerimeter());


        Cone cone = new Cone(4, 4);
        System.out.println(cone.calculateVolume());
        System.out.println(cone.calculateArea());
        System.out.println(cone.calculatePerimeter());

        Cube cube = new Cube(3, 3);
        System.out.println(cube.calculateVolume());
        System.out.println(cube.calculateArea());
        System.out.println(cube.calculatePerimeter());

    }
}
