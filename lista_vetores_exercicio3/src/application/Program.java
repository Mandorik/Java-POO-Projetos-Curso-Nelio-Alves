package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		// Problema "alturas"
		
		
		/*
		 * Faça um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura
		 * média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes
		 * dessas pessoas se houver
		 * 
		 * Exemplo:
		 * 
		 * Quantas pessoas serão digitadas? 5
		 * Dados 1a pessoa:
		 * Nome: João
		 * Idade: 15
		 * Altura: 1.82
		 * Dados 2a pessoa:
		 * Nome: Maria
		 * Idade: 16
		 * Altura: 1.60
		 * Dados 3a pessoa:
		 * Nome: Teresa
		 * Idade: 14
		 * Altura: 1.58
		 * Dados 4a pessoa:
		 * Nome: Carlos
		 * Idade: 21
		 * Altura: 1.65
		 * Dados 5a pessoa:
		 * Nome: Paulo
		 * Idade: 17
		 * Altura: 1.78
		 * 
		 * Altura média: 1.69
		 * Pessoas com menos de 16 anos: 40%
		 * João
		 * Teresa
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		
		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		int[] idades = new int[N];
		double[] alturas = new double[N];
		
		int under16 = 0;
		double avgHeight = 0, sumHeight = 0;
		
		
		for ( int i = 0; i < N; i++ ) {
			System.out.printf("Dados da %dª pessoa: \n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			sumHeight += alturas[i];
			}
		
		
		for ( int i = 0; i < N; i++) {
			if (idades[i] < 16) {
				under16++;
			}
		}
		
		avgHeight = sumHeight / N;
		
		double under16Percent = ((double) under16 / N) * 100;
		
		System.out.printf("Altura média: %.2f\n", avgHeight);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", under16Percent);
		
		for ( int i = 0; i < N; i++) {
			if(idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	
	}
	
}
