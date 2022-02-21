package com.company.Condicional;

import java.util.Scanner;

public class Ex4 {

    private Scanner sc = new Scanner(System.in);
    private int horaInicial, horaFinal, duracao;

    public void calculaDuracao() {

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal)
            duracao = horaFinal - horaInicial;
        else
            duracao = 24 - horaInicial + horaFinal;

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }

}
