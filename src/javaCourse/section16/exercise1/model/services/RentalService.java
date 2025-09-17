package javaCourse.section16.exercise1.model.services;

import javaCourse.section16.exercise1.model.entities.CarRental;
import javaCourse.section16.exercise1.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private double PricePerHour;
    private double PricePerDay;

    private BrazilTaxService taxService;

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;

        carRental.setInvoice(new Invoice(50.0, 10.0));
    }

    public RentalService(double pricePerHour, double pricePerDay, BrazilTaxService taxService) {
        PricePerHour = pricePerHour;
        PricePerDay = pricePerDay;
        this.taxService = taxService;
    }
}
