package com.qa.model;

public abstract class Account {

    private double balance;
    private String accName;

    public Account(double balance, String accName) {
        this.balance = balance;
        this.accName = accName;

    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public double getBalance(){
        return balance;
    }
    public  String getAccName(){
        return accName;
    };

}
