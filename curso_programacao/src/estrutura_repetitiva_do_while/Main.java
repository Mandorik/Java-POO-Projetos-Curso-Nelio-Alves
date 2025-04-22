package estrutura_repetitiva_do_while;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Estrutura repetitiva "faça-enquanto"
		
		//Menos utilizada, mas em alguns casos, encaixa-se melhor ao problema
		
		//O bloco de comandos executa pelo menos uma vez, pois é a condição verificada no final
		
		/*
		 * do {
		 * 		comando 1
		 * 		comando 2
		 * } while (condição) */
		
		/*
		 * Problema Exemplo:
		 * 
		 * Faça um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenhait. Perguntar se o usuário deseja repetir (s/n)
		 * Caso o usuário digite "s", repetir o programa
		 * 
		 * Fórmula: F = (9C/5) + 32
		 * 
		 * Exemplo:
		 * Digite a temperatura em Celsius: 30.0
		 * Equivalente em Fahrenheit: 86.0
		 * Dseja repetir (s/n)? s
		 * Digite a temperatura em Celsius: 21.0
		 * Equivalente em Fahrenheint: 69.8
		 * Deseja repetir (s/n)? s
		 * Digite a temperatura em Celsius: -10.5
		 * Equivalente em Fahrenheit: 13.1
		 * Deseja repetir (s/n)? n
		 * */
		
		Scanner sc = new Scanner(System.in);

		
		double fahrenheit = 0;
		char continuar = 0;
		double temperatura = 0;
		
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			temperatura = sc.nextDouble();
			fahrenheit = ((9 * temperatura)/5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f\n", fahrenheit);
			System.out.println("Deseja repetir (s/n)?");
			continuar = sc.next().charAt(0);
		} while (continuar != 'n');
		
	}

}
