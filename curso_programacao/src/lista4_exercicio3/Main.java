package lista4_exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exercício

		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
		 * casa decimal. Apresente a média ponderada para cada um desde conjuntos de 3
		 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
		 * o terceiro valor tem peso 5
		 * 
		 * Exemplo:
		 * 
		 * ENTRADA: 
		 * 3 
		 * 6.5 4.3 6.2 
		 * 5.1 4.2 8.1 
		 * 8.0 9.0 10.0
		 * 
		 * SAÍDA 5.7 6.3 9.3
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int N;
		double val1, val2, val3;
		
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			val1 = sc.nextDouble();
			val2 = sc.nextDouble();
			val3 = sc.nextDouble();

			double media = (val1 * 2.0 + val2 * 3.0 + val3 * 5.0) / 10.0;
			System.out.printf("%.1f\n", media);

		}
		
		sc.close();

	}

}
