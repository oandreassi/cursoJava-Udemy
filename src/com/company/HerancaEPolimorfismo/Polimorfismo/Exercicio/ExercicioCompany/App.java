package com.company.HerancaEPolimorfismo.Polimorfismo.Exercicio.ExercicioCompany;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<TaxPayer> taxList = new ArrayList<>();

        taxList.add(new Individual("Alex", 50000.00, 2000.00));
        taxList.add(new Company("SoftTech", 400000.00, 25));
        taxList.add(new Individual("Bob", 120000.00, 1000.00));

        double sum = 0.0;
        System.out.println("TAXES PAID:");
        for (TaxPayer tp : taxList) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

    }
}
