package com.oomph.bank;

public class BankAccount {
    private double balance;

    public BankAccount(double openingBalance) {
        if(openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance can not be negative");
        }
        this.balance = openingBalance;
    }

    public void deposit(double deposit) {
        if(deposit <= 0) {
            throw new IllegalArgumentException("The amount should be positive");
        }
        this.balance += deposit;
    }

    public void withdraw(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("The amount should be more than: "+ amount);
        }

        if(amount > balance) {
            throw new IllegalArgumentException("You have insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }
}
