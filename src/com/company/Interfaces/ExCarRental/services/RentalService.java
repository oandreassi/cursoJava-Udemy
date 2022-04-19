package com.company.Interfaces.ExCarRental.services;

import com.company.Interfaces.ExCarRental.entities.CarRental;
import com.company.Interfaces.ExCarRental.entities.Invoice;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;

    private Taxa taxaServico;

    public RentalService(Double pricePerDay, Double pricePerHour, Taxa taxaServico) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxaServico = taxaServico;
    }

    public void processInvoice(CarRental carRental) {

        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        double hours = (double)(t2 - t1) / 1000 / 60 / 60;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxaServico.taxacarro(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}

