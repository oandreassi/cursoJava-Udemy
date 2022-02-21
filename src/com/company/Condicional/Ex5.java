package com.company.Condicional;

import java.util.Scanner;

public class Ex5 {

    private Scanner sc = new Scanner(System.in);
    private int itemId, quantidadeItem;

    public void calculaValorPagar() {

        itemId = sc.nextInt();
        quantidadeItem = sc.nextInt();

        if (itemId == 1)
            System.out.println("Total: R$ " +  4.00 * quantidadeItem);
        if (itemId == 2)
            System.out.println("Total: R$ " +  4.50 * quantidadeItem);
        if (itemId == 3)
            System.out.println("Total: R$ " +  5.00 * quantidadeItem);
        if (itemId == 4)
            System.out.println("Total: R$ " +  2.00 * quantidadeItem);
        if (itemId == 5)
            System.out.println("Total: R$ " +  1.50 * quantidadeItem);

        sc.close();

    }

}
