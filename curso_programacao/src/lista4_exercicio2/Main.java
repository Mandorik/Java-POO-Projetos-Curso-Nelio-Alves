package lista4_exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exercício 2
		
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		 * Mostre quantos desde valores X estão dentro do intervalo [10, 20] e quantos estão fora do intervalo, mostrando essas informações
		 * conforme exemplo (use a palavra "in" para dentro do intervalo e "out" para fora do intervalo).
		 * 
		 * Entrada: 5 14 123 10 -25 32
		 * 
		 * Saída: 2 in 3 out
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int qtdIn = 0;
		int qtdOut = 0;
		int inputUsuario;
		
		for (int i = 0; i < 5 ; i++) {
			System.out.println("Digite um número inteiro");
			inputUsuario = sc.nextInt();
			
			if (inputUsuario <= 20 && inputUsuario >= 10) 
				qtdIn++;
			else
				qtdOut++;
			
		}
		
		System.out.println(qtdIn + "In");
		System.out.println(qtdOut + "Out");

		sc.close();
	}

}
