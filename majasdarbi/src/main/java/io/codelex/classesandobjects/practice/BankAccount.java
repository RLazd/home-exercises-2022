package io.codelex.classesandobjects.practice;

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        this.balance += amount;
    }

    public final void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return name + String.format(", $%.2f", balance);

    }
}
