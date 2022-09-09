package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        if (radius.doubleValue() < 0) {
            throw new NoCodeWrittenException(); //nezinu, kada kluda jaliek
        }
        return radius.doubleValue() * Math.PI * 2;
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        if (length.doubleValue() < 0 ) {
            throw new NoCodeWrittenException();
        }
        if (width.doubleValue() < 0 ) {
            throw new NoCodeWrittenException();
        }
        return length.doubleValue() * width.doubleValue();

        //throw new NoCodeWrittenException();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        if (base.doubleValue() < 0) {
            throw new NoCodeWrittenException();
        }
        if (h.doubleValue() < 0 ) {
            throw new NoCodeWrittenException();
        }
        return base.doubleValue() * h.doubleValue() * 0.5;
        //throw new NoCodeWrittenException();
    }


}

//    Design a Geometry class with the following methods:
//
//        - A static method that accepts the radius of a circle and returns the area of the circle. Use the following formula:
//        - Area = π * r * 2
//        - Use Math.PI for π and r for the radius of the circle

//        - A static method that accepts the length and width of a rectangle and returns the area of the rectangle. Use the following formula:
//        - Area = Length x Width

//        - A static method that accepts the length of a triangle’s base and the triangle’s height. The method should return the area of the triangle. Use the following formula:
//        - Area = Base x Height x 0.5
//
//        The methods should display an error message if negative values are used for the circle’s radius, the rectangle’s length or width, or the triangle’s base or height.
//
//        Next write a program to test the class, which displays the following menu and responds to the user’s selection:
//
//        ```
//        Geometry calculator:
//
//        Calculate the Area of a Circle
//        Calculate the Area of a Rectangle
//        Calculate the Area of a Triangle
//        Quit
//        Enter your choice (1-4):
//        ```
//
//        Display an error message if the user enters a number outside the range of 1 through 4 when selecting an item from the menu.