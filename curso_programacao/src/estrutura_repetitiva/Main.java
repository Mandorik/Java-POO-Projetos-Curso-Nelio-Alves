package estrutura_repetitiva;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Estrutura de controle que repete um bloco de comandos enquanto uma condição
		// for verdadeira
		// Quando usar? Quando não se sabe previamente a quantidade de repetições que
		// será realizada

		// Problema Exemplo:

		// Faça um programa que lê números inteiros até que o zero seja lido. Ao final
		// mostra a soma dos números lidos.
		// Entrada: 5 2 4 0
		// Saída 11
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0, total = 0;
		
		System.out.println("Digite um número inteiro. Digite 0 a qualquer momento para pararmos");
		i = sc.nextInt();
		
		while (i != 0) {
			System.out.printf("O número digitado foi: %d", i);
			total += i;
			System.out.println("Digite o próximo número:");
			i = sc.nextInt();
		} 
		
		System.out.printf("O total foi: %d", total);
		
		sc.close();

	}

}
