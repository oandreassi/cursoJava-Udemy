package com.company.SetAndMap.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        Set<Product> setProduct = new HashSet<>();
        //Set<Product> set = new TreeSet<>();
        //Set<Product> set = new LinkedHashSet<>();

        setProduct.add(new Product("TV", 900.0));
        setProduct.add(new Product("Notebook", 1200.0));
        setProduct.add(new Product("Tablet", 400.0));

        for (Product p : setProduct) {
            System.out.println(p);
        }
    }
}
