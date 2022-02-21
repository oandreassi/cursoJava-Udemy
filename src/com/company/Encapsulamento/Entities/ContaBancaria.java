package com.company.Encapsulamento.Entities;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ContaBancaria {

    private static final double TAXA = 5.00;
    private int contaId;
    private String nome;
    private double depositoInicial, saldo;

    public ContaBancaria(int contaId, String nome, double depositoInicial) {
        this.contaId = contaId;
        this.nome = nome;
        this.depositoInicial = depositoInicial;
        this.saldo = depositoInicial;
        System.out.println("Deposito inicial: " + depositoInicial);
    }

    public ContaBancaria(int contaId, String nome) {
        this.contaId = contaId;
        this.nome = nome;
        this.depositoInicial = 0.00;
        this.saldo = depositoInicial;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Conta id: " + contaId);
        System.out.println(" Titular: " + nome);
        System.out.println(" Deposito de: " + valor + " Saldo de: " + saldo);

    }

    public void sacar(double valor) {
        saldo -= valor + TAXA;
        System.out.println("Conta id: " + contaId);
        System.out.println(" Titular: " + nome);
        System.out.println(" Saque de: " + valor + " Saldo de: " + saldo);
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }

    public double getSaldo() {
        return saldo;
    }
}
