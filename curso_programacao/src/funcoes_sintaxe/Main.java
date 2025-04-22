package funcoes_sintaxe;

import java.util.Scanner;

public class Main { // Agora criaremos nossas próprias funções, as {} delimitam a função

	public static void main(String[] args) { //Função padrão do entry point, executada em 1o lugar
		// Funções (Sintaxe)
		
		/*
		 * Representam um processamento que possui um signifcado
		 * Math.sqrt(double)
		 * System.out.println(string)
		 * */

		//Principais vantagens: modularização, delegação e reaproveitamento
		
		/*
		 * Dados de entrada e saída
		 * Funções podem receber dados de entrada (parâmetros ou argumentos)
		 * Funções podem ou não retornar uma saída
		 * */
		
		//Em orientação a objetos, funções em classes recebem o nome de métodos
		
		
		
		//Problema exemplo:
		
		/*
		 * Faça um programa para ler três números inteiros e mostrar na tela o maior deles.
		 * 
		 * Exemplo:
		 * Enter three numbers:
		 * 5
		 * 8
		 * 3
		 * Higher = 8
		 * */
		
		int val1, val2, val3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre three numbers:");
		val1 = sc.nextInt();
		val2 = sc.nextInt();
		val3 = sc.nextInt();
		
		int higher = max(val1, val2, val3); // Função para achar o mais alto dentre os valores
		
		showResult(higher); // Função para mostrar o resultado maior
		
		sc.close();
		
	}
	
	// public = a função ficará disponível em outras classes
	// static = pode ser chamada independente de se criar um objeto
	// 3o é o tipo de dado que ela retorna, no caso a função max vai encontrar o maior dentre 3 números inteiros é um número inteiro
	
	public static int max(int x, int y, int z) { // Parâmetro não precisa ser o mesmo nome do da variável do Main, não têm nada a ver um com o outro, uma vai 'casar' com a outra
		int aux; // Por conta do escopo só existem aqui, mesma coisa com os parâmetros
		if( x > y && x > z ) {
			aux = x;
		} else if ( y > z ){
			aux = y;
		} else {
			aux = z;
		}
		
		// É preciso indicar que essa função vai RETORNAR esse valor
		
		return aux;
		
	} // Quando o escopo terminar as variáveis são desalocadas
	
	
	// Essa é void pois não vai retornar nada, vai só fazer uma ação
	
	public static void showResult(int value) { // Parâmetro declarado como int pois é o que a função vai receber
		System.out.println("Higher = " + value);
	}

}
