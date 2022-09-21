package io.codelex.classesandobjects.practice.SavingsAccountExercise8;

import java.util.Scanner;

public class SavingAccountTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money is in the account?: ");
        double startingBalance = scanner.nextDouble();

        System.out.println("How long has the account been opened?");
        int months = scanner.nextInt();

        System.out.println("Enter annual interest rate: ");
        int interestRate = scanner.nextInt();

        SavingsAccount account = new SavingsAccount(startingBalance, months);
        //System.out.println(account.balance);

        for (int i = 1; i <= months; i++) {

            System.out.println("Enter amount deposited for month nr. " + i);
            double depositedAmount = scanner.nextDouble();

            System.out.println("Enter amount withdrawn for month nr." + i);
            double withdrawnAmount = scanner.nextDouble();

            account.addDeposit(depositedAmount);
            account.subtractWithdrawal(withdrawnAmount);
            account.addMonthlyInterest(interestRate);

        }


        System.out.println(String.format("Total deposited $ %,.2f", account.totalDeposited));
        System.out.println(String.format("Total withdrawn $ %,.2f", account.totalWithdrawn));
        System.out.println(String.format("Interest earned $ %,.2f", account.totalInterest));
        System.out.println(String.format("Ending balance $ %,.2f", account.balance));


    }
}
