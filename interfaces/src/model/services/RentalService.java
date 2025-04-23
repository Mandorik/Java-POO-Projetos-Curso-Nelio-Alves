package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService; // a dependência muda agora, pois é com a interface

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		double basicPayment;
		
		if(hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours); // .ceil arredonda para cima
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
	// Em lugar algum há menções ao BrazilTaxService, será só o TaxService e a RentalService não sabe qual implementação será usada, istoé 
	// Agora a classe RentalService está fechada para alteração 
}
