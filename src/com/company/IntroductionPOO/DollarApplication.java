package com.company.IntroductionPOO;

import com.company.IntroductionPOO.entities.Dollar;

public class DollarApplication {
    public static void main(String[] args) {

        Dollar dollar = new Dollar(3.10,200);

        System.out.println("What is the dollar price: " + dollar.getDollarPrice());
        System.out.println("How many dollar will be bougth: " + dollar.getQuantity());
        System.out.println("Amount to be paid in Reais R$: " + dollar.convertDollar());
    }
}
