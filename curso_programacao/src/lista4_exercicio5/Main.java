package lista4_exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exercício 5
		
		/*
		 * Leia um valor N. Calcule e escreva seu respectivo seu respectivo fatorial. Natorial de N = N * (N-1) * (N*2) * (N-3) ... * 1.
		 * Lembrando que, por definição, fatorial de 0 é 1.
		 * 
		 * Exemplos:
		 * ENTRADA: 4
		 * SAÍDA: 24
		 * 
		 * ENTRADA: 1
		 * SAÍDA: 1
		 * 
		 * ENTRADA: 5
		 * SAÍDA: 120
		 * 
		 * ENTRADA: 0
		 * SAÍDA: 1
		 * */

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int fatorial = N;
		int total = 1;
		
		for ( int i = 1; i < N; i++ ) {
			total *= fatorial;
			fatorial -= 1;
			
		}
		
		
		System.out.println(total);
		
		sc.close();
	}

}
