package com.company.Sequencial;

import java.util.Scanner;

public class Ex4 {
    private int id,horas_trabalhadas;
    private double valor_horas,salario;

    public double calculaSalario(){
        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        horas_trabalhadas = sc.nextInt();
        valor_horas = sc.nextDouble();
        salario = horas_trabalhadas * valor_horas;
        return salario;
    }

    public int getId() {
        return id;
    }
}
