package exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// EXERCÍCIO 4

		/**
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais
		 * 
		 * EXEMPLOS:
		 * 
		 * Entrada: 25 100 5.50
		 * 
		 * Saída
		 * 
		 * NUMBER: 25 SALARY: U$ 550.00
		 * 
		 * Entrada: 1 200 20.50
		 * 
		 * Saída
		 * 
		 * NUMBER = 1 SALARY> U$ 4100.00
		 * 
		 * Entrada: 6 145 15.55
		 * 
		 * Saída NUMBER = 6 SALARY = U$ 2254.75
		 */

		Scanner sc = new Scanner(System.in);

		int numero, horasTrabalhadas;
		double valorPorHora;

		System.out.println("Digite o número do funcionário:");
		numero = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas neste mês:");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Digite o valor por hora, em reais, que o funcionário recebe");
		valorPorHora = sc.nextDouble();
		double salario = horasTrabalhadas * valorPorHora;
		System.out.printf("O salário do funcionário número %d é de U$ %.2f", numero, salario);
		
		sc.close();

	}

}
