package lista4_exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exercício 4
		
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro
		 * pelo segundo. Se o denominador for igual a zeo, mostrar a mensagem "divisao impossivel".
		 * 
		 * Exemplo:
		 * ENTRADA
		 * 3
		 * 3 -2
		 * -8 0
		 * 0 8
		 * 
		 * SAÍDA
		 * -1.5
		 * -8 0
		 * 0 8
		 * 
		 * */
		
		int N;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		for ( int i = 0; i < N ; i++ ) {
			double val1, val2;
			val1 = sc.nextInt();
			val2 = sc.nextInt();
			
			if (val2 != 0) {
				double divisao = val1/val2;
				System.out.println(divisao);
			} else
				System.out.println("Divisão impossível!");
			

		}
		sc.close();
	}

}
