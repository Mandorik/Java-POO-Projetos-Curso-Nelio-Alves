package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// Outro Exemplo
		
		/*
		 * Faça um pgroama para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
		 * Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
		 * Realizar uma entrada no estoque e mostrar novamente os dados do produto
		 * Realizar uma saída no estoque e mostrar novamente os dados do produto
		 * 
		 * 
		 * Para reolver este problema, você deve criar uma CLASSE conforme projeto ao lado
		 * 
		 * PRODUCT
		 * Name: string
		 * Price: double
		 * Quantity: int
		 * 
		 * +TotalValueInStock(): double
		 * +AddProducts(quantity: int) : void
		 * +ReomveProducts(quantity: int) : void
		 * 
		 * Example:
		 * Enter product data:
		 * Name: TV
		 * Price: 900.00
		 * Quantity in stock: 10
		 * 
		 * Product data: TV, $ 900.00, 10 units, Total: $ 9000.00
		 * 
		 * Enter the number of products to be added in stock: 5
		 * Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00
		 * 
		 * Enter the number of products to be removed from stock: 3
		 * Updated data: TV, $ 900.00, 12 units, Total: 10800.00
		 * */
		
		Product productX = new Product();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.println("Name");
		productX.name = sc.next();
		System.out.println("Price: ");
		productX.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		productX.quantity = sc.nextInt();
		
		System.out.println();
		
		//System.out.printf("Product data: %s, $ %.2f, %d units, Total: %.2f\n", x.name, x.price, x.quantity, x.totalValueInStock());
		
		System.out.println("Product data: " + productX); // Por ter a função String que retorna o nome, por estar no contexto de print o compilador entende
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		productX.addProducts(quantity); // Vai adicionar essa quantity como parâmetro da função addProducts()
		System.out.println("Updated data: " + productX);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		productX.removeProducts(quantity);
		System.out.println("Updated data: " + productX);
		
		sc.close();
	}

}
