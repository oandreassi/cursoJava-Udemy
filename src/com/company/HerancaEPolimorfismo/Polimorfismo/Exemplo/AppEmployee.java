package com.company.HerancaEPolimorfismo.Polimorfismo.Exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AppEmployee {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Alex", 50, 20.00));
        list.add(new Employee("Maria", 60, 200.00));
        list.add(new OutsourcedEmployee("Bob", 100, 15.00, 200.00));

        for(Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
    }
}
