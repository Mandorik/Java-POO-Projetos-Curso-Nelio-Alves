package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Problema "numeros pares"
		
		/*
		 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela todos os números
		 * pares, e, também, a quantidade de números pares
		 * 
		 * Exemplo:
		 * Quantos números você vai digitar? 6
		 * Digite um número: 8
		 * Digite um número: 2
		 * Digite um número: 11
		 * Digite um número: 14
		 * Digite um número: 13
		 * Digite um número: 20
		 * 
		 * Números Pares:
		 * 8 2 14 20
		 * 
		 * Quantidade de números pares = 4
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int N = sc.nextInt();
		int[] vect = new int[N];
		int totalPar = 0;
		
		for ( int i = 0; i < N; i++ ) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Números pares:");
		
		for ( int i = 0; i < N; i++) {
			if (vect[i]%2 == 0) {
				System.out.print(vect[i] + " ");
				totalPar++;
				
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de números pares: " + totalPar);
		
		
		sc.close();

	}

}
