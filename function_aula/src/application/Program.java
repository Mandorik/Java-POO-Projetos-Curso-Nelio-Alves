package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		/*
		 * É uma interface funcional que tem 2 parâmetros, recebe um objeto tipo T e retorna objeto tipo R
		 * 
		 * public interface Function<T, R> {
		 * 		R apply(T t);
		 * }
		 * */
		
		// PROBLEMA EXEMPLO
		
		// Faça um programa que, a partir de uma lista de produtos, gere uma nova lista contendo os nomes dos produtos em 
		// caixa alta
		
		List<Product> productList = new ArrayList<>();
		
		productList.add(new Product("Tv", 900.00));
		productList.add(new Product("Mouse", 50.00));
		productList.add(new Product("Tablet", 350.50));
		productList.add(new Product("HD Case", 80.90));
		
		// Versões
		
		// Implementação de interface
		//
		// Faremos um macete para aplicar a UpperCaseName pra toda a lista, com o map
		// A função "map" (não confundir com a estrutura de dados Map) é uma função que aplica uma função a todos os
		// elementos de uma stream. O stream por sua vez é uma sequência de dados.
		//
		// Como map não funciona em list, transformamos em stream, usamos o map, e aí então devolvemos para list
		//
		// Conversões:
		//
		// List para stream: .stream()
		//
		// Stream para List: .collect(Collectors.toList())
		
		// map recebe um Function
		// tudo isso terá de ser atribuído a uma nova lista, que será uma lista de Strings
		// List<String> upperCaseNames = productList.stream().map(new UpperCaseName()).collect(Collectors.toList()); 
		
		// Reference method com método estático
		// List<String> upperCaseNames = productList.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		// Reference method com método não estático
		// List<String> upperCaseNames = productList.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		// Expressão lambda declarada
		// Function<Product, String> func = p -> p.getName().toUpperCase();
		// List<String> upperCaseNames = productList.stream().map(func).collect(Collectors.toList());
		
		// Expressão lambda inline
		List<String> upperCaseNames = productList.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		upperCaseNames.forEach(System.out::println);
		
	}

}
