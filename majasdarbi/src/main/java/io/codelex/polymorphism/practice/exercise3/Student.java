package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person {
    double gpa;

    public Student(double gpa) {
        this.gpa = gpa;
    }

    public Student(String firstName, String lastName, String address, int id, double gpa) {
        super(firstName, lastName, address, id);
        this.gpa = gpa;
    }

    @Override
    public void display() {
        System.out.print("GPA" + getGpa() + ": ");
        super.display();
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
