package com.company.EstRepetitivas;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Ex3 {
    private Scanner sc = new Scanner(System.in);
    private int alcool, gasolina, diesel = 0;
    private int tipo = sc.nextInt(); // ENTRA LIDO

    public void preferencia() {

        while (tipo != 4) {
            if (tipo == 1)
                alcool += 1;
            else if (tipo == 2)
                gasolina += 1;
            else if (tipo == 3)
                diesel = +1;

            tipo = sc.nextInt(); // SAI LIDO
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();


    }


}
