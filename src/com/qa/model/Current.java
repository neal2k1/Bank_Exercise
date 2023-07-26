package com.qa.model;

public class Current extends Account implements LoanApplication{

    public Current(double balance, String accName) {
        super(balance, accName);
    }

    @Override
    public boolean applyLoan(double loanAmount, int duration) {
        if(loanAmount > getBalance()) { return false;}


    }
}
