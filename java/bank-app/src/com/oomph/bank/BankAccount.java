package com.oomph.bank;

public class BankAccount {
    private double balance;

    public BankAccount(double openBalance) {
        if(openBalance < 0) {
            throw new IllegalArgumentException("Opening balance can not be negative");
        }
        this.balance += openBalance;
    }

    public void deposit(double deposit) {
        if(deposit <= 0) {
            throw new IllegalArgumentException("The deposit amount should be positive");
        }
        this.balance += deposit;
    }
}
