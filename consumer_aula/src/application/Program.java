package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		/*
		 * Parametrizada também no tipo <T>
		 * 
		 * public interface Consumer<T> {
		 * 		void accept (T t);
		 * }
		 * 
		 * Problema Exemplo:
		 * 
		 * Faça um programa que, a partir de uma lista de produtos, aumente o preço dos produtos em 10%;
		 * */
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// Versões
		
		// Implementação de interface
		// list.forEach(new PriceUpdate());
		
		// Reference method com método estático
		// list.forEach(Product::staticPriceUpdate);
		
		// Reference method com método não estático
		// list.forEach(Product::nonStaticPriceUpdate);
		
		// Expressão lambda declarada
		// double factor = 1.1;
		// Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor); 
		
		// Expressão lambda inline
		double factor = 1.1;
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println); // reference method para o println

	}

}
