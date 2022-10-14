package io.codelex.secondTest.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public CreditCard(String owner, int number, String codeCCV, BigDecimal balance) {
        super(owner, number, codeCCV, balance);
    }

    @Override
    public void addMoney(BigDecimal value) {
        balance = balance.add(value);
    }

    @Override
    public void spendMoney(BigDecimal value) {
        if (balance.subtract(value).compareTo(BigDecimal.valueOf(100)) <= 0) {
            System.out.println("Warning: Low funds");
        }
        if (balance.subtract(value).compareTo(BigDecimal.ZERO) == 0) {
            throw new NotEnoughFundsException("Not enough funds");
        } else {
            balance.subtract(value);
        }

    }


}
