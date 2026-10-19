package com.oomph;

import java.math.BigDecimal;

public class BankAccount {
    private BigDecimal balance;

    public BankAccount() {
        this.balance = BigDecimal.ZERO;
    }

    public void deposit(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException ("The amount must be positive");
        }
        balance = balance.add(amount);
    }

    public BigDecimal getBalance() {
        return this.balance;
    }
}
