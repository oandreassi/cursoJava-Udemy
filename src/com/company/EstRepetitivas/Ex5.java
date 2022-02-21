package com.company.EstRepetitivas;

import java.util.Scanner;

public class Ex5 {

    private Scanner sc = new Scanner(System.in);
    private int in, out = 0;

    public void calculaIntervalo(){
        int quantidadeNumeros = sc.nextInt();

        for (int i = 0; i < quantidadeNumeros; i++) {
            if( i >= 10 && i <= 20)
                in =+ 1;
            else
                out =+ 1;
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }

}
