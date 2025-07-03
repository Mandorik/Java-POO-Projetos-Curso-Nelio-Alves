package model.entities;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

	// Para melhorar o código, podemos receber a condição do if como parâmetro
	// p.getName().charAt(0) == 'T' é um predicado do tipo Product, retorna um booleano
		
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0;
		for (Product p: list) {
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
	
}
