package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		/*
		 * Problema
		 * 
		 * Supoha uma classe Product com os atributos name e price
		 * 
		 * Podemos implementar a comparação de produtos por meio da implementação da interface Comparable<Product>
		 * 
		 * Entretando, desta forma nossa classe não fica fechada para alteração: se o critério de comparação mudar,
		 * precisaremos alterar a classe Product
		 * 
		 * Podemos então usar default o method "sort" da interface List:
		 * 		default void sort(Comparator<? super E> c
		 * */
	
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV",  900.0));
		list.add(new Product("Notebook",  1200.0));
		list.add(new Product("Tablet",  450.0));
		
		// Collections.sort(list);
		
		// Ele pede um Comparator, que é uma interface funciona - isso é tem apenas um método ABSTRATO
		// Essa é uma das formas possíveis, existem várias formas de definir um comparator
		// list.sort(new MyComparator());
		
		// #####################################################################################################
		
		// Agora, vamos declarar um Comparator no programa principal usando sintaxe de classe anônima:
		// Comparator<Product> comp = new Comparator<Product>() {

		// 	@Override
		// 	public int compare(Product p1, Product p2) {
		// 		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		// 	}
			
		// };
		
		// list.sort(comp);
		
		// Essa declaração é muito verbosa, pra deixar mais enxuto podemos usar expressão lambda - função anônima
		
		// #####################################################################################################
		
		// Aqui definimos uma função anônima, sua sintaxe é:
		// (x, y) os parâmetros
		// ->
		// implementação da função
		
		
		// O compilador faz inferência de tipos, dispensa necessidade de declarar os tipos dos parâmetros
		// Comparator<Product> comp = (p1, p2) -> {
		//	return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		// };
		
		// Como nossa implementação tem apenas uma linha, os {} e o return são dispensáveis 
		
		// Comparator<Product> comp = (p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
				
		// list.sort(comp);
		
		// Mais um movimento que pode enxugar a quantidade de códigos, jogar toda a função anônima dentro do sort

		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product p : list) {
			System.out.println(p);
		}
		
		/*
		 * Como guardamos a lógica de comparação dentro do Product, se o critério mudar é necessário mudar a implementação do método
		 * O ideal é termos critérios de comparação que sejam independente da classe Product. De modo que não precisemos alterar
		 * a classe toda vez que mudar o critério.
		 * */
		
		// Dentro da interface List existe um default method sort, e ele recebe um Comparator como argumento
				
	}

}
