package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Problema "dados_pessoas"
		
		/*
		 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Faça um programa que calcule e 
		 * escreva a maior e a menor altura do grupo, a média de altura das mulheres e o número de homens
		 * 
		 * Exemplo:
		 * Quantas pessoas serão digitadas? 5
		 * Altura 1a pessoa: 1.70
		 * Genero 1a pessoa: F
		 * Altura 2a pessoa: 1.83
		 * Genero 2a pessoa: M
		 * Altura 3a pessoa: 1.54
		 * Genero 3a pessoa: M
		 * Altura 4a pessoa: 1.61
		 * Genero 4a pessoa: F
		 * Altura 5a pessoa: 1.75
		 * Genero 5a pessoa: F
		 * 
		 * Menor altura = 1.54
		 * Maior altura = 1.83
		 * Media das alturas das mulheres = 1.69
		 * Numero de homens = 2
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas serão digitadas? ");
		int N = sc.nextInt();
		double[] altura = new double[N];
		char[] genero = new char[N];
		
		double maiorAltura = 0, menorAltura = 0, sumAlturaF = 0, avgAlturaF = 0;
		int qtdM = 0;
		int qtdF = 0;
		
		for (int i = 0; i < N; i++) {
			System.out.printf("Altura da %d pessoa: ", i+1);
			altura[i] = sc.nextDouble();
			System.out.printf("Gênero da %d pessoa: ", i+1);
			genero[i] = sc.next().charAt(0);
		}
		
		for (int i = 0; i < N; i++) {
			if(genero[i] == 'M') {
				qtdM++;
			} else {
				qtdF++;
				sumAlturaF += altura[i];
			}
		}
		
		maiorAltura = altura[0];
		menorAltura = altura[0];
		avgAlturaF = sumAlturaF / qtdF;
		
		for (int i = 0; i < N; i++) {
			if(maiorAltura < altura[i])
				maiorAltura = altura[i];
		}
		
		for (int i = 0; i < N; i++) {
			if(menorAltura > altura[i])
				menorAltura = altura[i];
		}
		
		System.out.printf("Menor altura: %.2f\n", menorAltura);
		System.out.printf("Maior altura: %.2f\n", maiorAltura);
		System.out.printf("Média das alturas das mulheres: %.2f\n", avgAlturaF);
		System.out.printf("Número de homens: %d", qtdM);		
		
		sc.close();

	}

}
