package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		// EXERCÍCIO DE FIXAÇÃO
		
		/*
		 * Faça um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais podem ser pessoa física ou 
		 * pessoa jurídica, e depois mostrar o valor do imposto pago por cada um, bem como o total de imposto arrecadado
		 * 
		 * Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica são nome,
		 * renda anual e número de funionários. As regras para cálculo de imposto são as seguintes:
		 * 
		 * Pessoa Física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com renda de 20000.00 em diante
		 * pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto.
		 * 
		 * EXEMPLO: uma pessoa cuja renda foi de 50000.00 e teve 2000.00 em gastos com saúde, o imposto fica:
		 * (50000 * 25%) - (2000 * 50%) = 11500.00
		 * 
		 * Pessoa Jurídica: pessoas jurídicas pagam 16¨de imposto. Porém, se a empresa possuir mais de 10 funcionários, ela paga 14%
		 * de imposto.
		 * 
		 * EXEMPLO: uma empresa cuja renda foi de 4000000.00 e possui 25 funcionários o imposto fica:
		 * 400000.00 * 14% = 56000.00
		 * 
		 * Enter the number of tax payers: 3
		 * Tax payer #1 data:
		 * Individual or company (i/c)? i
		 * Name: Alex
		 * Anual income: 50000.00
		 * Health expenditures: 2000.00
		 * Tax payer #2 data:
		 * Individual or company (i/c)? c
		 * Name: SoftTech
		 * Anual income: 400000.00
		 * Number of employees: 25
		 * Tax payer #3 data:
		 * Individual or company (i/c)? i
		 * Name: Bob
		 * Anual income: 120000.00
		 * Health expenditures: 1000.00
		 * 
		 * TAXES PAID:
		 * Alex: $ 11500.00
		 * SoftTech: $ 56000.00
		 * Bob: $ 29500.00
		 * 
		 * TOTAL TAXES: $ 97000.00
		 * */

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the number of tax payers: ");
		int N = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for(int i = 1; i<=N; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.printf("Individual or Company (i/c)? ");
			char taxPayerType = sc.next().charAt(0);
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Annual income: ");
			Double annualRevenue = sc.nextDouble();
			if(taxPayerType == 'i') {
				System.out.printf("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, annualRevenue, healthExpenditures));
			} else if (taxPayerType == 'c') {
				System.out.printf("Number of employees: ");
				int employeeNumber = sc.nextInt();
				list.add(new Company(name, annualRevenue, employeeNumber));
			} else {
				System.out.println("Invalid Input");
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double totalTax = 0.0;
		
		for(TaxPayer taxpayer : list) {
			System.out.println(taxpayer.getName() + ": $ " + String.format("%.2f", taxpayer.annualTax()));
			totalTax += taxpayer.annualTax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + totalTax);
		
		sc.close();
		
	}

}
