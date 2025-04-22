package lista4_exercicio7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exercício 7
		
		/*
		 * Faça um programa para ler um número inteiro positivo. O programa então deve mostrar na teal N linhas, começando 
		 * de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.
		 * 
		 * Exemplo:
		 * 
		 * ENTRADA: 5
		 * 
		 * SAÍDA:
		 * 1 1 1
		 * 2 4 8
		 * 3 9 27
		 * 4 16 64
		 * 5 25 125
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double quadrado = 0;
		double cubo = 0;
		
		for ( int i = 1; i <= N; i++) {
			
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d\n", primeiro, segundo, terceiro);

		}
		
		sc.close();

	}

}
