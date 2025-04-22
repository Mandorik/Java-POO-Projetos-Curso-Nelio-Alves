package exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// EXERCÍCIO 5

		/**
		 * Faça um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
		 * 
		 * Exemplos:
		 * 
		 * ENTRADA 12 1 5.30 16 2 5.10
		 * 
		 * SAÍDA VALOR A PAGAR: R$ 15.50
		 * 
		 * ENTRADA 13 2 15.30 161 4 5.20
		 * 
		 * SAÍDA VALOR A PAGAR: R$ 51.40
		 * 
		 * ENTRADA 1 1 15.10 2 1 15.10
		 * 
		 * SAÍDA VALOR A PAGAR: R$ 30.20
		 */

		Scanner sc = new Scanner(System.in);

		int codPeca1, nPeca1, codPeca2, nPeca2;
		double valorUnitarioPeca1, valorUnitarioPeca2;

		System.out.println("Informe o código da peça:");
		codPeca1 = sc.nextInt();
		System.out.println("Informe a quantidade de peças:");
		nPeca1 = sc.nextInt();
		System.out.println("Informe o valor unitário da peça:");
		valorUnitarioPeca1 = sc.nextDouble();
		System.out.println("Informe o código da outra peça:");
		codPeca2 = sc.nextInt();
		System.out.println("Informe a quantidade de peças da outra peça");
		nPeca2 = sc.nextInt();
		System.out.println("Informe o valor unitário da outra peça:");
		valorUnitarioPeca2 = sc.nextDouble();

		double total = (nPeca1 * valorUnitarioPeca1) + (nPeca2 * valorUnitarioPeca2);
		System.out.printf("Valor a pagar: R$ %.2f", total);

		sc.close();

	}

}
