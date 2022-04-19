package com.company.EnumsEComposicoes.Ex1.Entities;

import java.time.LocalDate;

public class HourContract {

    private LocalDate date;
    private double valuesPerHour;
    private int hours;

    public HourContract() {
    }

    public HourContract(LocalDate date, double valuesPerHour, int hours) {
        this.date = date;
        this.valuesPerHour = valuesPerHour;
        this.hours = hours;
    }

    public double totalValue(){
        return valuesPerHour * hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValuesPerHour() {
        return valuesPerHour;
    }

    public void setValuesPerHour(double valuesPerHour) {
        this.valuesPerHour = valuesPerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
