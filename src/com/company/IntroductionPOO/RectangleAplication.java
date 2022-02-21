package com.company.IntroductionPOO;

import com.company.IntroductionPOO.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class RectangleAplication {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Rectangle rectangle = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a rectangle width and heigth: ");
        rectangle.setWidth(sc.nextDouble());
        rectangle.setHeigth(sc.nextDouble());

        System.out.printf("AREA = %.2f%n", rectangle.area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());

        sc.close();
    }
}
