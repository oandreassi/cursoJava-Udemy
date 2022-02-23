package com.company.EnumsEComposicoes.ExercicioFixacao.Application;

import com.company.EnumsEComposicoes.ExercicioFixacao.Entities.Client;
import com.company.EnumsEComposicoes.ExercicioFixacao.Entities.Order;
import com.company.EnumsEComposicoes.ExercicioFixacao.Entities.OrderItem;
import com.company.EnumsEComposicoes.ExercicioFixacao.Entities.Product;
import com.company.EnumsEComposicoes.ExercicioFixacao.Entities.enums.OrderStatus;

import java.time.LocalDate;
import java.util.Locale;

public class OrderApplication {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Client client = new Client("Matheus", "matheus@mail.com", LocalDate.of(1998, 5, 19));
        Order order = new Order(LocalDate.now(), OrderStatus.PROCESSING, client);

        Product product1 = new Product("TV", 1000);
        Product product2 = new Product("Mouse", 40);

        OrderItem item1 = new OrderItem(2, product1);
        OrderItem item2 = new OrderItem(3, product2);

        order.addItem(item1);
        order.addItem(item2);

        System.out.println();
        System.out.println("ORDER SUMARY");
        System.out.println();

        System.out.println(order);
    }
}
