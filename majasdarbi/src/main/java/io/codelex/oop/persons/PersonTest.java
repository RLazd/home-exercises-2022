package io.codelex.oop.persons;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Brown", "Id777", 44,
                "Accountant", LocalDate.of(2015, 7, 20));

        System.out.println(employee1.getWorkExperience());
        System.out.println(employee1.getId());
        System.out.println(employee1.getInfo());


        Customer customer1 = new Customer("Peter", "Brown", "CID1234", 54, 13);

        customer1.setPurchaseCount(17);
        System.out.println(customer1.getPurchaseCount());
        System.out.println(customer1.getInfo());
    }
}
