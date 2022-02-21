package com.company.Condicional;
import java.util.Scanner;

public class Ex7 {

    Scanner sc = new Scanner(System.in);
    private double x, y;

    public void calculaEixo() {

        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("ORIGEM");
        }
        else if (x == 0.0)
            System.out.println("Eixo Y");
         else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

         sc.close();
    }

}
