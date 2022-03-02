package com.company.HerancaEPolimorfismo.Polimorfismo.Exercicio.ExercicioProdutos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AppProduct {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);

        List<Product> listProducts = new ArrayList<>();

        listProducts.add(new Product("Notbook",1100.00));
        listProducts.add(new UsedProduct("Iphone", 4000, LocalDate.now()));
        listProducts.add(new ImportedProduct("Tablet", 260.00, 20.00));

        for (Product prod : listProducts) {
            System.out.println(prod.priceTag());
        }

    }
}
