package application;

import java.util.Scanner;

import utilities.Product;

public class Program {

	public static void main(String[] args) {
		// Problema exemplo 2
		
		/*
		 * Faça um programa para ler um número inteiro N e os dados (nome e preço) de N produtos.
		 * Armazene os N produtos em um vetor. Em seguida, mostre o preço médio deles
		 * 
		 * EXEMPLO:
		 * 
		 * Entrada:
		 * 3
		 * TV
		 * 900.00
		 * Fryer
		 * 400.00
		 * Stove
		 * 800.00
		 * 
		 * Saída
		 * AVERAGE PRICE: 700.00
		 * */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de produtos: ");
		int N = sc.nextInt();
		double totalPrice = 0;
		
		Product[] vect = new Product[N];
		
		// for ( int i = 0; i < N; i++)
		
		for ( int i = 0; i < vect.length; i++ ) {
			System.out.print("Digite o nome do produto: ");
			String name = sc.nextLine();
			sc.nextLine(); // Pra pular senão quebra
			System.out.print("Digite o valor do produto: ");
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price); // Instanciamos o novo produto e o vect na posição i vai apontar pra esse objeto
			totalPrice += price;
		}
		
		double avgPrice = totalPrice / vect.length;
		
		System.out.printf("A média dos preços é de $ %.2f", avgPrice);
		
		sc.close();
		
		/*
		 * Sobre o atributo lenght. A gente tá usando a variável N, que é a quantidade de elementos, mas podemos trocá-la por
		 * vect.length.
		 * 
		 * Já que vect.length é a quantidade de elementos do vetor, dá na mesma. O melhor é usá-la pois ai não depende de uma 
		 * variavel que não está atrelada ao vetor.
		 * */
		
	}

}
