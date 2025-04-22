package estrutura_repetitiva_para;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Estrutura repetitiva "para" (FOR)
		
		/*
		 * É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores
		 * 
		 * Quando usar: quando se sabe previamente a quantidade de repetições, ou o intervalo de valores
		 * 
		 * Por exemplo:
		 * 
		 * Fazer um programa que lê um valor inteiro N e depois N números inteiros.
		 * Ao final mostra a foma dos N números lidos
		 * 
		 * ENTRADA
		 * 3 5 2 4
		 * 
		 * SAÍDA
		 * 11
		 * */
		
		int inputInicial, total = 0, inputUsuario;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		inputInicial = sc.nextInt();
		
		// for (início ; condição ; incremento)
		// Início: O que executa somente na primeira vez
		// Condição: V executa e volta / F: pula fora
		// Incremento: executa toda vez depois de voltar
		
		for (int i = 0; i < inputInicial; i++) {
			System.out.println("Digite um número inteiro");
			inputUsuario = sc.nextInt();
			total += inputUsuario;
		}
		
		System.out.println(total);
		
		sc.close();

		
		/*
		 * Perceba que a estrutura "para" é ótima para se fazer uma repetição baseada em CONTAGEM:
		 * 
		 * for ( int i = 0; i < 5; i++ ){
		 * 		System.out.println("Valor de i: " + i)
		 * }
		 * */
		
		/*
		 * O mesmo serve para contagem regressiva:
		 * 
		 * for ( int i = 5; i > 0; i--){
		 * 		System.out.println("Valor de i: " + i)
		 * }
		 * */
	}

}
