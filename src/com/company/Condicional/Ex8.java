package com.company.Condicional;

import java.util.Scanner;

public class Ex8 {

    private Scanner sc = new Scanner(System.in);
    private double salario;

    public void calculaImposto() {

        salario = sc.nextDouble();

        if(salario > 0.00 && salario <= 2000.00)
            System.out.println("ISENTO");
        else if(salario <= 3000.00)
            System.out.println((salario - 2000.000 ) * 0.08);
        else if(salario <= 4500.00)
            System.out.println( (salario - 3000) * 0.18 + 1000 * 0.08);
        else if(salario > 4500.00)
            System.out.println((salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08);
        else
            System.out.println("ISENTO");

        sc.close();
    }
}
