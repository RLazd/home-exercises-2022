package io.codelex.secondTest.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(String owner, int number, String codeCCV, BigDecimal balance) {
        super(owner, number, codeCCV, balance);
    }

    @Override
    public void addMoney(BigDecimal value) {
        if (value.compareTo(BigDecimal.valueOf(10000)) >= 0) {
            System.out.println("Warning: Too much money");
        }
        balance = balance.add(value);
    }

    @Override
    public void spendMoney(BigDecimal value) {
        if (balance.subtract(value).compareTo(BigDecimal.ZERO) == 0) {
            throw new NotEnoughFundsException("Not enough funds");
        } else {
            balance = balance.subtract(value);
        }
    }
}
