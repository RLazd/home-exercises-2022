package io.codelex.classesandobjects.practice.SavingsAccountExercise8;

public class SavingsAccount {

    double startingBalance;
    double balance;
    double totalDeposited;
    double totalWithdrawn;
    double totalInterest;
    int monthsOpened;


    public SavingsAccount(double startingBalance, int monthsOpened) {
        this.startingBalance = startingBalance;
        this.balance = startingBalance;
        this.monthsOpened = monthsOpened;
    }

    public void subtractWithdrawal(double withdrawalAmount) {
        this.totalWithdrawn += withdrawalAmount;
        this.balance -= withdrawalAmount;
    }

    public void addDeposit(double depositAmount) {
        this.totalDeposited += depositAmount;
        this.balance += depositAmount;
    }

    public void addMonthlyInterest(int annualInterestRate) {
        this.totalInterest += (double) annualInterestRate / 12 * balance;
        this.balance += (double) annualInterestRate / 12 * balance;

    }

}
