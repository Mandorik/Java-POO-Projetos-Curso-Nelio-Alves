package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Problema "maior_posicao"
		
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostre na tela o maior número 
		 * do vetor (supor não haver empates). Mostrar também a posicaçõ do maior elemento, considerando a primeira posição como 0 (zero)
		 * 
		 * Exemplo:
		 * Quantos números você vai digitar? 6
		 * Digite um número: 8.0
		 * Digite um número: 4.0
		 * Digite um número: 10.0
		 * Digite um número: 14.0
		 * Digite um número: 13.0
		 * Digite um número: 7.0
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você digitará? ");
		int N = sc.nextInt();
		double[] vect = new double[N];
		
		
		for (int i = 0; i < N; i++ ) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double maior = vect[0];
		int posicaoMaior = 0;

		for ( int i = 0; i < N; i++ ) {
			if (maior < vect[i]) {
				maior = vect[i];
				posicaoMaior = i;
			}
		}
		
		System.out.println("Maior valor: " + maior);
		System.out.println("Posição do maior valor: " + posicaoMaior);
		
		sc.close();

	}

}
