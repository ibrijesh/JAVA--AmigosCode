package com.amigoscode;

import java.math.BigDecimal;

import static java.math.BigDecimal.*;

public class BankAccount {
    String name;
    BigDecimal balance;
    boolean hasOverDraft;

    public BigDecimal withdraw(BigDecimal amount) {
        if (balance.subtract(amount).compareTo(ZERO) >= 0) {
            this.balance = this.balance.subtract(amount);
            return amount;
        }

        return ZERO;
    }
}
