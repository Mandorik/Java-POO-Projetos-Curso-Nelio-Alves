package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Problema "mais_velho"
		
		/*
		 * Faça um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes devem
		 * ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostre na tela o nome da pessoa mais velha
		 * 
		 * Exemplo:
		 * 
		 * Quantas pessoas serão digitadas? 5
		 * Dados da 1a pessoa:
		 * Nome: Joao
		 * Idade: 16
		 * Dados da 2a pessoa:
		 * Nome: Maria
		 * Idade: 21
		 * Dados da 3a pessoa:
		 * Nome: Teresa
		 * Idade: 15
		 * Dados da 4a pessoa:
		 * Nome: Carlos
		 * Idade: 23
		 * Dados da 5a pessoa:
		 * Nome: Paulo
		 * Idade: 17
		 * PESSOA MAIS VELHA: Carlos
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas você vai digitar? ");
		int N = sc.nextInt();
		String nomes[] = new String[N];
		int idades[] = new int[N];
		
		for ( int i = 0; i < N; i++) {
			System.out.printf("Dados da %dª pessoa: ", i + 1);
			System.out.println();
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		int maisVelho = idades[0];
		int posicaoMaisVelho = 0;
		
		for (int i = 0; i < N; i++) {
			if(maisVelho < idades[i]) {
				maisVelho = idades[i];
				posicaoMaisVelho = i;
			}
		}
		
		System.out.println("Pessoa mais velha: " + nomes[posicaoMaisVelho]);
		
		sc.close();
		
	}

}
