package application;

import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;
import services.USAInterestService;

public class Program {

	public static void main(String[] args) {
		// Default methods (defender methods)
		
		/*
		 * A partir do Java 8, interfaces podem conter métodos concretos.
		 * 
		 * A intenção básica é promover implementação padrão para métodos, de modo a evitar:
		 * 1) Repetição de implementação em toda classe que implemente a interface
		 * 2) A necessidade de se criar classes abstratras para prover reuso da implementação
		 * 
		 * Outras vantagens:
		 * 1) Manter a retrocompatibilidade com sistemas existentes
		 * 2 Permitir que "interfaces funcionais" (que devem conter apenas um método) possam prover 
		 * outras operações padrão reutilizáveis
		 * */
		
		// Problema exemplo:
		
		/*
		 * Faça um programa para ler uma quantia e a duração em meses de um empréstimo. Informe o valor
		 * a ser pago depois do decorrido o prazo do empréstimo, conforme regras de juros do Brasil. 
		 * A regra de cálculo de juros do Brasil é juro composto padrão de 2% ao mês.
		 * 
		 * Exemplo:
		 * 
		 * Amount: 200.00
		 * Months: 3
		 * Payment after 3 months:
		 * 212.24
		 * 
		 * Calculations: Payment = 200 * 1.02 * 1.02 * 1.02 = 200 * 1.02³ = 212.2416
		 * Payment = amount * (1 + interestRate / 100)*N 
		 * */

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Amount: ");
		double amount = sc.nextDouble();
		System.out.printf("Months: ");
		int months = sc.nextInt();
		
		InterestService bis = new BrazilInterestService(2.0);
		double payment = bis.payment(amount, months);
		
		System.out.printf("Payment after %d months: ", months);
		System.out.println(String.format("%.2f", payment));
				
		sc.close();
		
		// Mas e se tivéssemos de calcular o juros de outro país?
		
		// Suponhamos que nos EUA a taxa de juros é de 1%
		
		// Calculations: Payment = 200 * 1.01 * 1.01 * 1.01 = 200 * 1.01³ = 206.0602
		
		InterestService uis = new USAInterestService(1.0);
		
		// Ambas as classes (BIS e UIS) possuem a mesma lógica de cálculo de juros, mesma estrutura, mas repetimos
		// Para mudarmos isso e deixar a aplicação mais flexível e até possibilidade de polimorfismo, implementaremos uma interface
		
		System.out.printf("Payment after %d months: ", months);
		System.out.println(String.format("%.2f", uis.payment(amount, months)));
		
		
		/*
		 * Considerações finais:
		 * 
		 * Agora interfaces podem prover reuso
		 * 
		 * Temos uma forma de herança múltipla
		 * (Mas o compilador reclama se houver mais de um método com a mesma assinatura, obrigando a sobrescrevê-lo
		 * 
		 * Interfaces ainda são bem diferentes de classes abstratas, Interfaces não possuem recursos tais como 
		 * construtores e atributos
		 * */
		
	}

}
