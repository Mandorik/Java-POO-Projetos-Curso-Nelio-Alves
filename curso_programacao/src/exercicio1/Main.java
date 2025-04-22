package exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Faça um programa para ler dois valores inteiros e depois motre na tela a soma
		 * desses números com uma mensagem explicativa, conforme exemplos:
		 * 
		 * Exemplos: Entrada: 10 30
		 * 
		 * Saída: SOMA = 40
		 * 
		 * Entrada: -30 10 Saída: SOMA = -20
		 * 
		 * Entrada: 0 0
		 * 
		 * Saída: SOMA = 0
		 */

		int x, y;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");
		x = sc.nextInt();
		System.out.println("Digite outro número inteiro:");
		y = sc.nextInt();

		int soma = x + y;
		System.out.printf("A soma dos números que você digitou é: %d + %d = %d", x, y, soma);
		
		sc.close();
	}

}
