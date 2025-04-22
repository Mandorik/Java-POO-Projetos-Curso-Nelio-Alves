package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// Exercício 2
		
		/*
		 * Faça um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados
		 * do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem
		 * dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
		 * projetada abaixo:
		 * 
		 * Employee
		 * - Name : string
		 * - GrossSalary : double
		 * - Tax : double
		 * 
		 * + NetSalary() : double
		 * + IncreaseSalary(percentage: double) : void
		 * 
		 * Exemplo:
		 * 
		 * Name: Joao Silva
		 * Gross salary: 6000.00
		 * Tax: 1000.00
		 * 
		 * Employee: Joao Silva, $ 5000.00
		 * 
		 * Which percentage to increase salary? 10.0
		 * 
		 * Updated data: Joao Silva, $ 5600.00*/
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f\n", employee.name, employee.netSalary());
		
		System.out.println("Which percentage to increase the employee's salary?");
		
		employee.increaseSalary(sc.nextDouble());
		
		System.out.printf("Update data: %s, $ %.2f", employee.name, employee.netSalary());
		
		sc.close();

	}

}
