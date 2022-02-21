package com.company.IntroductionPOO.entities;

public class Employee {

    private String nome;
    private double grossSalary, tax;

    public Employee(String nome, double grossSalary, double tax) {
        this.nome = nome;
        this.grossSalary = grossSalary;
        this.tax = tax / 100.00;
    }

    public double increaseSalary(Double percentage) {
        double increase = grossSalary * percentage;
        return grossSalary - 1000.00 + increase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void printEmployee(){
        System.out.println("Name: " + nome + " , " + "Salary: " + increaseSalary(tax));
    }
}
