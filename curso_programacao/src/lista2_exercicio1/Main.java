package lista2_exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// EXERCÍCIO 1
		
		/*
		 * Fazer um programa para ler um número inteiro e, depois, dizer se este número é negativo ou não
		 * 
		 * Exemplos:
		 * Entrada: -10
		 * Saída: NEGATIVO
		 * 
		 * Entrada: 8
		 * Saída: NAO NEGATIVO
		 * 
		 * Entrada: 0
		 * Saída: NAO NEGATIVO
		 * */
		
		int validadorNegativo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número real");
		validadorNegativo = sc.nextInt();
		
		if (validadorNegativo < 0)
		System.out.println("O número digitado é negativo");
		else
			System.out.println("O número digitado é positivo");
		
		sc.close();
			
	}

}
