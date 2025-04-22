package lista2_exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// EXERCÍCIO 2
		
		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		 * 
		 * Exemplos:
		 * 
		 * ENTRADA: 12
		 * SAÍDA: PAR
		 * 
		 * ENTRADA: -27
		 * SAÍDA: ÍMPAR
		 * 
		 * ENTRADA: 0
		 * SAÍDA: PAR
		 * */
		
		Scanner sc = new Scanner(System.in);
		int numDigitado;
		
		System.out.println("Digite um número real");
		numDigitado = sc.nextInt();
		
		if (numDigitado % 2 == 0)
			System.out.println("O número digitado é par!");
		else
			System.out.println("O número digitado é ímpar!");
		
		sc.close();
	}

}
