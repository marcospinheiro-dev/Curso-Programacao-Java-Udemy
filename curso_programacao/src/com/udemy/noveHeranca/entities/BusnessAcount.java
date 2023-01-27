package com.udemy.noveHeranca.entities;

public class BusnessAcount extends Account {

    private Double loanLimit; //Limite de empréstimo

    public BusnessAcount() {
        super();
    }

    public BusnessAcount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            deposit(amount);

        }
    }
}
