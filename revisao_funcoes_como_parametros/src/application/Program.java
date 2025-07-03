package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import model.entities.ProductService;

public class Program {

	public static void main(String[] args) {

		// Recordando algumas exemplos:
		
		// removeIf(Predicate)
		
		// foreach(Consumer)
		
		// map(Function)
		
		// Mas, e se quisermos criar nossa própria função que recebe outra função?
		
		// Problema Exemplo:
		
		// Faça um programa que, a partir de uma lista de produtos, calcule a somente a soma de produtos 
		// cujo nome comece com a letra "T"
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		// double sum = ps.filteredSum(list, p -> p.getPrice() < 100.00);
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
		// Podemos melhorar nosso código
		// Indo no service, vimos que a função está presa a quem inicia com letra 'T'
		// Outra condição precisará mudar outra condição no service, e a classe não está filtrada para alteração
	}

}
