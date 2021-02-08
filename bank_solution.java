package com.example;

import lombok.Getter;
import lombok.ToString;

@ToString
public class BankAccount {
    private double balance;
    private String account_number;
    private final @Getter String owner_name;

    public BankAccount(double balance, String account_number, String owner_name) {
        this.balance = balance;
        // better use the setter
        // this.account_number = account_number;
        setAccount_number(account_number);
        this.owner_name = owner_name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String newAccountNumber) {
        if (newAccountNumber.length() == 10) {
            account_number = newAccountNumber;
        } else {
            System.out.println("account number not valid and not set!");
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

 }
