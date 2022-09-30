package io.codelex.oop.shapes;

public class Triangle extends Shape {

    int width;
    int height;

    public Triangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (height*width)/2;
    }

    @Override
    public double getPerimeter() {   //if orthogonal
        return Math.round((width+height+ Math.sqrt(Math.pow(width,2) + Math.pow(height,2)))*100.0)/100.0;
    }


}
