package javaCourse.section16.exercise1.model.services;

import javaCourse.section16.exercise1.model.entities.CarRental;
import javaCourse.section16.exercise1.model.entities.Invoice;

public class RentalService {
    private double PricePerHour;
    private double PricePerDay;

    private BrazilTaxService taxService;

    public void processInvoice(CarRental carRental){
        carRental.setInvoice(new Invoice());
    }

    public RentalService(double pricePerHour, double pricePerDay, BrazilTaxService taxService) {
        PricePerHour = pricePerHour;
        PricePerDay = pricePerDay;
        this.taxService = taxService;
    }
}
