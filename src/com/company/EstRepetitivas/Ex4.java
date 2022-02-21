package com.company.EstRepetitivas;

import java.util.Scanner;

public class Ex4 {

    private Scanner sc = new Scanner(System.in);
    private int numero = sc.nextInt();


    public void calculaImpares() {

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
