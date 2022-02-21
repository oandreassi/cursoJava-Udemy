package com.company.EstRepetitivas;

import java.util.Scanner;

public class Ex1 {

    private int senhaCorreta = 2002;
    private Scanner sc = new Scanner(System.in);
    private int senhaDigitada = sc.nextInt();

    public void verificaSenha() {
        while (senhaDigitada != senhaCorreta) {
            System.out.println("SENHA INVALIDA");
            senhaDigitada = sc.nextInt();
        }
        System.out.println("ACESSO PERMITIDO");
    }
}
