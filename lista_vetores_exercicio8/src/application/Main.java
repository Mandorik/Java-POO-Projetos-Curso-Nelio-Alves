package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Problema "media_pares"
		
		/*
		 * Faça um programa para ler um vetor de N números inteiros. Em seguida, mostre na tela a média
		 * artimética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
		 * digitado, mostrar a mensagem "NENHUM NÚMERO PAR"
		 * 
		 * Exemplo 1:
		 * Quantos elementos terá o vetor? 6
		 * Digite um número: 8
		 * Digite um número: 2
		 * Digite um número: 11
		 * Digite um número: 14
		 * Digite um número: 13
		 * Digite um número: 20
		 * Media dos pares = 11.0
		 * 
		 * Exemplo 2:
		 * Quantos elementos terá o vetor? 3
		 * Digite um número: 7
		 * Digite um número: 9
		 * Digite um número: 11
		 * NENHUM NÚMERO PAR
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos elementos terá o vetor? ");
		
		int N = sc.nextInt();
		int[] vect = new int[N];
		double avg = 0, sum = 0;
		int nPares = 0;
		
		for ( int i = 0; i < N; i++ ) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		for( int i = 0; i < N; i++ ) {
			if( vect[i] % 2 == 0 ) {
				sum += vect[i];
				nPares++;
			}
		}
		
		if( nPares == 0) {
			System.out.println("NENHUM NÚMERO PAR!");
		}else {
			avg = (double) sum/nPares;
			System.out.printf("Média dos pares: %.1f", avg);
		}
		
		sc.close();
		
		
	}
}
