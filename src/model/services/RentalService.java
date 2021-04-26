package model.services;

import model.entities.CarRental;

public class RentalService {

	private Double pricePerday;
	private Double pricePerHour;

	private BrazilTaxService taxService;

	public RentalService(Double pricePerday, Double pricePerHour, BrazilTaxService taxService) {

		this.pricePerday = pricePerday;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	public void processInvoice(CarRental carRental) {
		
		
		
	}
}
