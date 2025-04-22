package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		// A partir do Java 8, interfaces podem ter "default methods" ou "defender methods"
		
		// Isso possui implicações conceituais e práticas, que serão discutidas mais à frente neste capítulo
		
		// Primeiro vamos trabalhar com a definição "clássica" de interfaces. Depois vamos acrescentar o conceito de default methods
		
		// DEFINIÇÃO CLÁSSICA:
		
		/*
		 * Interface é um tipo que define um conjunto de operações que uma classe deve implementar
		 * 
		 * A interface estabelece um contrato que a classe deve cumprir
		 * 
		 * Por exemplo:
		 * 
		 * interface Shape {
		 * 
		 * 		double area();
		 * 		double perimeter();
		 * }
		 * 
		 * Pra que interfaces?
		 * Para criar sistemas com baixo acoplamento e flexíveis
		 * */
		
		// Problema exemplo
		
		/*
		 * Uma locadora brasileira de carros cobra um valor por hora para locações até 12 horas. Porém, se a duração da locação
		 * ultrapassar 12 horas, a locação será cobrada com base em um valor diário. Além do valor de locação, é acrescido no preço o 
		 * valor do importo conforme regras do país que, no caso do Brasil, é de 20% para valores até 100.00, ou 15% para
		 * valores acima de 100.00. Faça um programa que lê os dados da locação (modelo do carro, instante inicial e final da locação), 
		 * bem como o valor por hora e o valor diário de locação. O programa deve então gerar a nota de pagamento (contendo valor
		 * da locação, valor do imposto e valor total de pagamento) e informar os dados na tela. Veja os exemplos:
		 * 
		 * EXEMPLO
		 * 
		 * Enter rental data
		 * Car model: Civic
		 * Pickup (dd/MM/yyyy hh:mm): 25/06/2018 10:30
		 * Return (dd/MM/yyyy hh:mm): 25/06/2018 14:40
		 * Enter price per hour: 10.00
		 * Enter price per day: 130.00
		 * INVOICE
		 * Basic payment: 50.00
		 * Tax: 10.00
		 * Total payment: 60.00
		 * 
		 * Enter rental data
		 * Car model: Civic
		 * Pickup (dd/MM/yyyy hh:mm): 25/06/2018 10:30
		 * Return (dd/MM/yyyy hh:mm): 27/06/2018 11:40
		 * Enter price per hour: 10.00
		 * Enter price per day: 130.00
		 * INVOICE:
		 * Basic payment: 390.00
		 * Tax: 58.50
		 * Total payment: 448.50
		 * */
		
		
		// 1ª Solução, sem interfaces
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter rental data");
		System.out.printf("Car model: ");
		String model = sc.nextLine();
		System.out.printf("Pickup (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.printf("Return (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(model));
		
		System.out.printf("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.printf("Enter price per day: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("INVOICE");
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		sc.close();

	}

}
