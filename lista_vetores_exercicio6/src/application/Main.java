package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Problema "soma_vetores"
		
		/*
		 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro
		 * vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado
		 * 
		 * Exemplo:
		 * 
		 * Quantos valores vai ter cada vetor? 6
		 * Digite os valores do vetor A:
		 * 8
		 * 2
		 * 11
		 * 14
		 * 13
		 * 20
		 * 
		 * Digite os valores do vetor B:
		 * 5
		 * 10
		 * 3
		 * 1
		 * 10
		 * 7
		 * Vetor Resultante:
		 * 13
		 * 12
		 * 14
		 * 15
		 * 23
		 * 27
		 * */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos valores terão cada vetor? ");
		int N = sc.nextInt();
		int[] vectA = new int[N];
		int[] vectB = new int[N];
		int[] vectC = new int[N];
		
		for ( int i = 0; i < N; i++ ) {
			System.out.print("Digite o(s) valor(es) do primeiro vetor: ");
			vectA[i] = sc.nextInt();
		}
		
		for ( int i = 0; i < N; i++ ) {
			System.out.print("Digite o(s) valor(es) do segundo vetor: ");
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("Vetor resultante: ");
		
		for ( int i = 0; i < N; i++ ) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
		
		
		sc.close();

	}

}
