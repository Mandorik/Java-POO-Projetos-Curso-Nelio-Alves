package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Problema "abaixo_da_media"
		
		/*
		 * Faça um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, mostre na tela
		 * a média aritmética de todos os elementos com três casas decimais. Depois, mostre todos os elementos do vetor que estejam 
		 * abaixo da média, coma uma casa decimal cada.
		 * 
		 * Exemplo:
		 * 
		 * Quantos elementos vai ter o vetor? 4
		 * Digite um número: 10.0
		 * Digite um número: 15.5
		 * Digite um número: 13.2
		 * Digite um número: 9.8
		 * 
		 * Média do vetor = 12.125
		 * Elementos abaixo da média:
		 * 10.0
		 * 9.8
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos terá o vetor? ");
		int N = sc.nextInt();
		double[] vect = new double[N];
		double avgVect = 0, sumVect = 0;
		
		for ( int i = 0; i < N; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			sumVect += vect[i];
		}
		
		avgVect = sumVect / N;
		
		System.out.printf("Média do vetor: %.3f\n", avgVect);
		
		System.out.println("Elementos abaixo da média:");
		
		for ( int i = 0; i < N; i++) {
			if(vect[i] < avgVect) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}

}
