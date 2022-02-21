package com.company.IntroductionPOO;

import com.company.IntroductionPOO.entities.Employee;

import java.util.Locale;

public class EmployeeApplication {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Employee employee = new Employee("Matheus", 6000.00,10.00);
        employee.printEmployee();
    }
}
