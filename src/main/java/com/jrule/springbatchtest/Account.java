package com.jrule.springbatchtest;

public class Account {

    private int  accountNumber;

    public Account() {

    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "account number: " + accountNumber;
    }
}
