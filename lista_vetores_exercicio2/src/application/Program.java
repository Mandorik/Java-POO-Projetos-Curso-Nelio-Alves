package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Problema "soma_vetor"
		
		/*
		 * Faça um programa que leia N números reais e os armazene em um vetor. Em seguida:
		 * - Imprima todos os elementos do vetor
		 * - Mostre na tela a soma e a média dos elementos do vetor
		 * 
		 * Exemplo:
		 * Quantos números você vai digitar? 4
		 * Digite um número: 8.0
		 * Digite um número: 4.0
		 * Digite um número: 10.0
		 * Digite um número: 14.0
		 * 
		 * Valores = 8.0 4.0 10.0 14.0
		 * Soma = 36.00
		 * Media = 9.00
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você digitará? ");
		
		int N = sc.nextInt();
		
		double[] vect = new double[N];
		
		double sum = 0;
		
		for ( int i = 0; i < vect.length; i++ ) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		System.out.println("Valores:");

		for ( int i = 0; i < vect.length; i++ ) {
			System.out.print(vect[i] + " ");
		}
		
		double avg = sum / N;
		System.out.println();
		System.out.println("Soma: " + sum);
		System.out.println("Média: " + avg);
		
		sc.close();
		
		

	}

}
