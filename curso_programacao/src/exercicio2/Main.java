package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exercício 2

		/*
		 * Faça um programa para ler o valor do raio de um círculo e, depois, mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos
		 * 
		 * 
		 * Fórmula da área: area = π . raio²
		 * 
		 * considere o valor de π = 3.14159
		 * 
		 * EXEMPLOS:
		 * 
		 * Entrada: 2.00
		 * 
		 * Saída: A = 12.5664
		 * 
		 * Entrada: 100.64
		 * 
		 * Saída: A = 31819.3103
		 * 
		 * Entrada: 150.00
		 * 
		 * Saída: A = 70685.7750
		 */

		double raio;
		double pi = 3.14159;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o raio do círculo:");
		raio = sc.nextDouble();
		double area = pi * (raio * raio);
		System.out.printf("A área deste círculo é de %.4f", area);

		sc.close();

	}

}
