package com.company.Heranca.Exemplos.ContaBancaria;

public class BusinessAccount extends Account{

    private double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if(amount <= loanLimit) {
            amount -= amount;
        }
    }
}
