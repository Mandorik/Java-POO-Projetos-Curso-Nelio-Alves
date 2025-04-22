package lista2_exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// EXERCÍCIO
		
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "São múltiplos" ou "Não são multiplos",
		 * indicando se os valores lidos são múltiploes entre si. Atenção os números devem poder ser digitados em ordem 
		 * crescente ou decrescente*/
		
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		System.out.println("Digite dois números inteiros");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A  == 0)
		System.out.println("Os números são múltiplos entre si");
		else 
			System.out.println("Os números não são múltiplos entre si");
		
		sc.close();
	}

}
