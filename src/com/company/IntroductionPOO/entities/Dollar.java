package com.company.IntroductionPOO.entities;

public class Dollar {

    private static final double IOFTAX = 0.06;
    private double dollarPrice;
    private double quantity;

    public Dollar(double dollarPrice, double quantity) {
        this.dollarPrice = dollarPrice;
        this.quantity = quantity;
    }

    public double convertDollar() {
        double iofValue = (dollarPrice * quantity) * IOFTAX;
        return dollarPrice * quantity + iofValue;
    }

    public double getDollarPrice() {
        return dollarPrice;
    }

    public double getQuantity() {
        return quantity;
    }
}


