package com.company.Interfaces.services;

public class BrazilTaxService implements Taxa {

    public double taxacarro(double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        }
        else {
            return amount * 0.15;
        }
    }
}
