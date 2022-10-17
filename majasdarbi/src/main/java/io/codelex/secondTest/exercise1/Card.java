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
        this.balance = balance;
    }

    public abstract void addMoney(BigDecimal value);

    public abstract void spendMoney(BigDecimal value);

}
