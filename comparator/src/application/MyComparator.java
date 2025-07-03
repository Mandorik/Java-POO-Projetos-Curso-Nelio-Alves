package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product> {

	// Princípio bem parecido com o Comparable:
	// número inteiro positivo se arg0 > arg1
	// 0 se arg0 == arg1
	// número inteiro negativo se arg0 < arg1
	
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

	// Essa é uma das formas possíveis, existem várias formas de definir um comparator 
	
}
