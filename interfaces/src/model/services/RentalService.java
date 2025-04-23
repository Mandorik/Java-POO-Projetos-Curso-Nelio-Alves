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
	
	/*
	 * RentalService tem uma dependência com o TaxService, a classe BrazilTaxService a implementa, cumprindo o contrato
	 * No programa principal eu passo como argumento uma nova instância dessa classe BrazilTaxService.
	 * Quem instancia a classe concreta é o programa principal, a classe RentalService não tem responsabilidade de instanciar a classe completa
	 * ela só recebe alguma classe que implementa a interface e essa instância concreta que foi instanciada no programa principal vai casar
	 * com esse parâmetro do tipo TaxService. 
	 * Nisso ocorre um upcasting.  
	 * Qualquer outra classe que implementasse a classe daria certo de ser instanciada no construtor.
	 * Isso é "Injeção de Dependência por Meio de Construtor"
	 * O objeto TaxService, do qual a minha classe RentalService depende é instanciado por outro lugar, no caso o programa principal, e essa 
	 * instância é injetada no RentalService por meio do construtor.
	 * */
	
	/*
	 * Mas como seria a implementação desse processo sem a questão da injeção de dependência? Assim:
	 * 
	 * public RentalService(Double pricePerHour, Double pricePerDay){
	 * 		this.pricePerHours = pricePerHour;
	 * 		this.pricePerDay = pricePerDay;
	 * 		this.taxService = new BrazilTaxService;
	 * 	}
	 * 
	 * Mas assim manteria o acoplamento forte, pois agora a RentalService é responsável por instanciar a dependência dela,
	 * esse tipo de implementação gera o mesmo problema de forte acoplamento.
	 * Portanto queremos que a classe receba uma instância da interface e o construtor simplesmente vai guardar a referência,
	 * quem possui a responsabilidade de fornecer a instância é outro lugar, no caso aqui o programa principal
	 * */
}
