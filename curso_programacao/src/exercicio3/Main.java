package exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exercício 3

		/**
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferença do produto de A e B pelo produto C e D seguindo
		 * a fórmula: DIFERENCA = (A * B - C * D).
		 * 
		 * Exemplos:
		 * 
		 * Entrada: 5 6 7 8
		 * 
		 * Saída: DIFERENCA = -26
		 * 
		 * Entrada: 5 6 -7 8
		 * 
		 * Saída: DIFERENCA = 86
		 */

		int A, B, C, D;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número inteiro:");
		A = sc.nextInt();
		System.out.println("Digite o segundo número inteiro:");
		B = sc.nextInt();
		System.out.println("Digite o terceiro número inteiro:");
		C = sc.nextInt();
		System.out.println("Digite o quarto número inteiro:");
		D = sc.nextInt();

		int DIFERENCA = ((A * B) - (C * D));
		System.out.printf("A 'DIFERENCA' é de %d", DIFERENCA);

		sc.close();

	}

}
