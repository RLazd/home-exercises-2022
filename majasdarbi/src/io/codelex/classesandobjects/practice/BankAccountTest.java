package io.codelex.classesandobjects.practice;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount benben = new BankAccount("Benson", 20.25);

        benben.withdraw(3.75);

        System.out.println(benben.toString());

    }
}
