package io.codelex.polymorphism.practice.exercise3;

public class People {
    public static void main(String[] args) {

        Student student1 = new Student(7.8);
        student1.setAddress("Riga");
        student1.setFirstName("Milla");
        student1.setLastName("Ma");
        student1.setId(123);
        student1.display();

        Student student2 = new Student("Lalla", "La", "Riga", 456, 9.0);
        student2.display();

        Employee emp1 = new Employee("Michael", "Scott", "Scranton", 999, "Wordls best Boss");
        emp1.display();

    }
}
