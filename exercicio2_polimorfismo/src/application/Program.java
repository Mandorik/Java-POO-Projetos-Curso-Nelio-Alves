package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		// EXERCÍCIO DE FIXAÇÃO
		
		/*
		 * Faça um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final, mostre a etiqueta de preço
		 * de cada produto na mesma ordem em que foram digitados.
		 * Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e produtos usados
		 * possuem data de fabricação. Estes dados específicos devem ser acrescentados na etiqueta de preço conforme exemplo
		 * Para produtos importados, a taxa e alfândag devem ser acrescentadas ao preço final do produto.
		 * 
		 * EXEMPLO:
		 * 
		 * Enter the number of products: 3
		 * Product #1 data:
		 * Common, used or imported (c/u/i)? i
		 * Name: Tablet
		 * Price: 260.00
		 * Customs fee: 20.00
		 * Product #2 data:
		 * Common, used or imported? (c/u/i)? c
		 * Name: Notebook
		 * Price: 1100.00
		 * Product #3 data:
		 * Common, used or imported? (c/u/i)? u
		 * Name: Iphone
		 * Price: 400.00
		 * Manufacture date (DD/MM/YYY): 15/03/2017
		 * 
		 * PRICE TAGS:
		 * Tablet $ 280.00 (Customs fee: $ 20.00)
		 * Notebook $ 1100.00
		 * Iphone (used) $ 400.00 (Manufacture date: 15/03/2017)
		 * */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int N = sc.nextInt();
				
		List<Product> productList = new ArrayList<>();
		
		for (int i = 1; i <= N; i++ ) {
			System.out.printf("Product #%d data:\n", i);
			System.out.print("Common, used or imported (c/u/i)? ");
			char productType = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(productType == 'c') {
				productList.add(new Product(name, price));
			} else if(productType == 'u') {
				System.out.print("Manufacture Date (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				productList.add(new UsedProduct(name, price, manufactureDate));
			} else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				productList.add(new ImportedProduct(name, price, customsFee));
			}
		}	
		
		System.out.println();
		System.out.println("PRICE TAGS");
		for(Product prod : productList) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
		
	}

}
