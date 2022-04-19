package com.company.HerancaEPolimorfismo.Polimorfismo.Exercicio.ExercicioProdutos;

import java.time.LocalDate;

public class UsedProduct extends Product{
    LocalDate manufacturedDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, double price, LocalDate manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    @Override
    public String priceTag (){
        return getName()
            + " (used) $ "
            + String.format("%.2f", getPrice())
            + " (Manufacture date: "
            + manufacturedDate.toString()
            + ")";
    }
}
