package com.company.IntroductionPOO.entities;

public class Rectangle {
    private double width, heigth;

    public double area() {
        return width * heigth;
    }

    public double perimeter() {
        return 2 * (width + heigth);
    }

    public double diagonal() { // HIPOTENUSA
        double result = Math.sqrt((Math.pow(width, 2) + Math.pow(heigth, 2)));
        return result;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
}
