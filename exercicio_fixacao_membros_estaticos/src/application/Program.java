package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// Exercício de Fixação

		/*
		 * Faça um prorama para ler a cotação do dólar, depois, um valor em dólares a ser comprados por uma
		 * pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a
		 * pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter para
		 * ser responsável pelos cálculos
		 * 
		 * Exemplo:
		 * What is the dollar price? 3.10
		 * How many dollars will be bought? 200.00
		 * Amount to be paid in reais: 657.20
		 * */
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dollarBought = sc.nextDouble();
		
		System.out.printf("Amount to be paid in BRL: %.2f", CurrencyConverter.dollarAmount(dollarPrice, dollarBought));
		
		sc.close();
	}

}
