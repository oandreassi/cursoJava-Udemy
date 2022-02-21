package com.company.EstRepetitivas;

import java.util.Scanner;

public class Ex2 {

    private Scanner sc = new Scanner(System.in);

    //ENTRA LIDO
    int x = sc.nextInt();
    int y = sc.nextInt();

    public void calculaPlano(){

        while(x != 0 && y != 0) {
            if(x > 0 && y > 0)
                System.out.println("PRIMEIRO");
            else if(x < 0 && y > 0)
                System.out.println("SEGUNDO");
            else if(x < 0 && y < 0)
                System.out.println("TERCEIRO");
            else
                System.out.println("QUARTO");

            //SAI LIDO
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }


}
