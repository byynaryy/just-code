package com.oomph.bank;

public class BankAccount {
    private double balance;

    public BankAccount(double openBalance) {
        if(openBalance < 0) {
            throw new IllegalArgumentException("Opening balance can not be negative");
        }
        this.balance += openBalance;
    }
}
