package com.company.HerancaEPolimorfismo.Polimorfismo.Exercicio.ExercicioProdutos;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice () {
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag () {
        return getName()
            + " $ "
            + String.format("%.2f", totalPrice())
            + " (Customs fee: $ "
            + String.format("%.2f", customsFee)
            + ")";
        }
}
