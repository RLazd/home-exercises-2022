package io.codelex.classesandobjects.practice;

public class AccountTest {

    public static void main(String[] args) {
        Account account1 = new Account("Bob", 100);
        account1.deposit(20);

        System.out.println(account1.toString());

        Account mattsAccount = new Account("Matt", 1000);
        Account myAccount = new Account("Me", 0);

        mattsAccount.withdrawal(100);
        myAccount.deposit(100);

        Account a = new Account("A", 100);
        Account b = new Account("B", 0);
        Account c = new Account("C", 0);
        Account.transfer(a, b, 50);
        Account.transfer(b, c, 25);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

    }
}
