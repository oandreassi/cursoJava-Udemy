package com.company.Encapsulamento;

import com.company.Encapsulamento.Entities.ContaBancaria;

public class ContaBancariaAplication {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(23, "Matheus Lopes", 1000);
        conta1.depositar(1500);
        conta1.sacar(200);
    }
}
