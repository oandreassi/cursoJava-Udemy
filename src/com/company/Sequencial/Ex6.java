package com.company.Sequencial;

import java.util.Scanner;

public class Ex6 {

    double result = 0;
    public static final double PI = 3.14159;
    Scanner sc = new Scanner(System.in);

    public void ler_numeros() {
        double a, b, c, result = 0;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        calcula_circulo(c);
        calcula_quadrado(b);
        calcula_retangulo(a, b);
        calcula_trapezio(a, b, c);
        calcula_triangulo(a, c);
    }

    public void calcula_triangulo(double a, double c) {
        result = a * c / 2;
        System.out.printf("TRIANGULO: %.3f%n", result);
    }

    public void calcula_circulo(double c) {
        result = PI * c * c;
        System.out.printf("CIRCULO: %.3f%n", result);
    }

    public void calcula_trapezio(double a, double b, double c) {
        result = (a + b) / 2 * c;
        System.out.printf("TRAPEZIO: %.3f%n", result);
    }

    public void calcula_quadrado(double b) {
        result = b * b;
        System.out.printf("QUADRADO: %.3f%n", result);
    }

    public void calcula_retangulo(double a, double b) {
        result = a * b;
        System.out.printf("RETANGULO: %.3f%n", result);
    }
}
