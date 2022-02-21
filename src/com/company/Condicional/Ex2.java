package com.company.Condicional;
import java.util.Scanner;

public class Ex2 {
    private Scanner sc = new Scanner(System.in);
    private int numero;

    public void verificaParImpar() {

        numero = sc.nextInt();
        numero = numero % 2;

        if (numero == 0)
            System.out.println("Numero Par");
        else
            System.out.println("Numero impar");

    }
}
