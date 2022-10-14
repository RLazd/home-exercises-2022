package io.codelex.secondTest.exercise1;

import java.math.BigDecimal;

public class Examples {
    public static void main(String[] args) {

        DebitCard debitCard = new DebitCard("Will smith", 12345, "099", BigDecimal.valueOf(1000));
        DebitCard debitCard2 = new DebitCard("xxx", 12345, "099", BigDecimal.valueOf(1000));

        CreditCard creditCard = new CreditCard("yyy", 5555, "055", BigDecimal.valueOf(500));

        debitCard.addMoney(BigDecimal.valueOf(100));
        System.out.println(debitCard.balance);


    }
}
