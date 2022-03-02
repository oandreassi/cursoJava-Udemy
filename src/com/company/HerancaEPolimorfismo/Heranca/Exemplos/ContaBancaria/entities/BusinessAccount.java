package com.company.HerancaEPolimorfismo.Heranca.Exemplos.ContaBancaria.entities;

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

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.00;
    }
}
