package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product> {

	// O que seria testar um produto p nesse predicado?
	
	// Implementemos o teste que fizemos na expressão lambda
	
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

}
