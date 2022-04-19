package com.company.EnumsEComposicoes.Ex1.Application;

import com.company.EnumsEComposicoes.Ex1.Entities.Department;
import com.company.EnumsEComposicoes.Ex1.Entities.HourContract;
import com.company.EnumsEComposicoes.Ex1.Entities.Worker;
import com.company.EnumsEComposicoes.Ex1.Entities.WorkerLevel;

import java.time.LocalDate;
import java.util.Locale;

public class Ex1Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Worker work1 = new Worker("Alex", WorkerLevel.MID_LEVEL, 1200, new Department("Desing"));

        work1.addContract(new HourContract(LocalDate.of(2018, 8, 1), 50, 20));
        work1.addContract(new HourContract(LocalDate.of(2018, 8, 25), 80, 10));
        work1.addContract(new HourContract(LocalDate.of(2016, 4, 19), 80, 10));

        int year = 2018, month = 8;
        double sum = work1.income(year, month);
        System.out.println("Name: " + work1.getName());
        System.out.println("Department: " + work1.getDepartment().getName());
        System.out.println("Income for: " + month + "/" + year + ": " + sum);
    }
}

