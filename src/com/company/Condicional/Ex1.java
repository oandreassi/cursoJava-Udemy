package com.company.Condicional;

import java.util.Scanner;

public class Ex1 {

    private Scanner sc = new Scanner(System.in);
    private int numero;

    public void negativoPositvo() {
        numero = sc.nextInt();
        if (numero < 0)
            System.out.println("Negativo");
        else
            System.out.println("Não negativo");
    }
}
