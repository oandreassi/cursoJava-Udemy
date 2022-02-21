package com.company.Sequencial;

import java.util.Scanner;

public class Ex5 {

    int peca_id, numero_pecas;
    double valor_unitario, valorPago = 0;
    Scanner sc = new Scanner(System.in);

    public void valor_a_pagar() {

        for (int i = 0; i < 2; i++) {
            peca_id = sc.nextInt();
            numero_pecas = sc.nextInt();
            valor_unitario = sc.nextDouble();
            valorPago += numero_pecas * valor_unitario;
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);
    }
}
