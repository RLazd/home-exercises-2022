package io.codelex.classesandobjects.practice.Exercise9;

public class Point {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void swapPoints(Point p1, Point p2) {
        Point temp = new Point(p1.x, p1.y);

        p1.setX(p2.x);
        p1.setY(p2.y);

        p2.setX(temp.x);
        p2.setY(temp.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
