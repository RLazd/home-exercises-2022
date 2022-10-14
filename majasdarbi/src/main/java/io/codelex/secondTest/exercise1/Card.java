package io.codelex.secondTest.exercise1;

import java.math.BigDecimal;

public abstract class Card {

    String owner;
    int number;
    String codeCCV;
    BigDecimal balance;

    public Card(String owner, int number, String codeCCV, BigDecimal balance) {
        this.owner = owner;
        this.number = number;
        this.codeCCV = codeCCV;
        //validateCCV(codeCCV);
        this.balance = balance;
    }

    public abstract void addMoney(BigDecimal value);

    public abstract void spendMoney(BigDecimal value);

    public void validateCCV(String code) {
        //šeit kaut kas negāja un nebija laika labot
//        String[] numbers = code.split("");
//        //varētu regexā bet nezinu kā...
//        if (!numbers[0].equals('0') || !numbers[1].matches("[0-9]") || !numbers[2].matches("[0-9]") || numbers.length != 3) {
//            throw new IllegalArgumentException("Not valid CCV");
//        }
    }


}
