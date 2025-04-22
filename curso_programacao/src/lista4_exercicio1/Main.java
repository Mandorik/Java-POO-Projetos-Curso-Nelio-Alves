package lista4_exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exercício 1:

		// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		// até X, um valor por liha, inclusive o X se for o caso.

		// Entrada: 8
		// Saída: 1 3 5 7

		Scanner sc = new Scanner(System.in);
		//int X = sc.nextInt();

		for (int X = sc.nextInt(); X > 0; X = X - 2) {

			if (X % 2 != 0) {
				System.out.println(X);
			} else {
				X = X + 1;
			}
		}

		sc.close();

	}

}
