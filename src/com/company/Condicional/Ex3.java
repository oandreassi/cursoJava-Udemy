package com.company.Condicional;

import java.util.Scanner;

public class Ex3 {
    private Scanner sc = new Scanner(System.in);
    private int num1, num2;

    public void saoMultiplos() {
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0)
            System.out.println("São Multiplos");
        else
            System.out.println("Não sao multiplos");

        sc.close();
    }

}
