package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Predicate (exemplo com removeIf) 
		 * 
		 * É uma interface generics do tipo T com apenas um método abstrato chamado test
		 * 
		 * public interface Predicate<T> {
		 * 		boolean test(T t);
		 * }
		 * */
		
		/*
		 * Problema exemplo:
		 * 
		 * Faça um programa que, a partir de uma lista de produtos, remova da lista somente aqueles cujo preço mínimo seja 100
		 * */
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// list.removeIf(p -> p.getPrice() >= 100); esse é com expressão lambda, o removeIf recebe um Predicate
		
		// Agora implementaremos o Predicate na mão por meio da interface
		
		// list.removeIf(new ProductPredicate());
		
		// Existem outras formas:
		
		// Reference method com método estático
		// Referência pra método: nome da classe onde o método está :: nome do método
		// list.removeIf(Product::staticProductPredicate);
		
		// Reference method com método não estático
		// list.removeIf(Product::nonStaticProductPredicate);
		
		// Expressão lambda declarada
		// Agora sem referência de método, colocando uma variável criada, que é do tipo Predicado que recebe uma função anônima
		// O bom desse método é que podemos declarar uma variável para ser o mínimo
		//
		// double min = 100;
		//
		// Predicate<Product> pred = p -> p.getPrice() >= min;
		// list.removeIf(pred);
		
		
		// Expressão lambda inline
		// Ao invés de declarar o predicato e então usar, dá pra usar a expressão lambda e pôr diretamente como argumento do removeIf
		
		double min = 100;
		
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
	
}
