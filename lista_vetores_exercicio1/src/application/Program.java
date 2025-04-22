package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// EXERCÍCIO DE FIXAÇÃO DE VETORES
		
		/*
		 * Faça um programa que lai um número inteiro positivo N (máximo = 10) e depois N números inteiros e 
		 * armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos
		 * 
		 * Exemplo:
		 * Quantos números você vai digitar? 6
		 * Digite um número: 8
		 * Digite um número: -2
		 * Digite um número: 9
		 * Digite um número: 10
		 * Digite um número: -3
		 * Digite um número: -7
		 * 
		 * NUMEROS NEGATIVOS:
		 * -2
		 * -3
		 * -7
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int N = sc.nextInt();
		
		int[] vect = new int[N];
		
		for ( int i = 0; i < vect.length; i++ ) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Número Negativos:");
	
		for ( int i = 0; i < vect.length; i++ ) {
			if (vect[i] < 0 ) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
		

	}

}
