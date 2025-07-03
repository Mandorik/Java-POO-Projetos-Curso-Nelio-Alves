package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		/*
		 * Faça um progrma para ler um conjunto de proutos a partir de um arquivo em formato .csv
		 * (suponha que exista pelo menos um produto).
		 * 
		 * Em seguida, mostre o preço necessário dos produtos. Depois, mostre os nomes, em ordem descrescente,
		 * dos produtos que possuem preço inferior ao preço médio
		 * 
		 * EXEMPLO:
		 * 
		 * Input file:
		 * Tv,900.0
		 * Mouse,50.0
		 * Tablet,350.50
		 * HD Case,80.90
		 * Computer,850.00
		 * Monitor,290.00
		 * 
		 * Execution:
		 * Enter full file path: c:\temp\in.txt
		 * Average price: 420.23
		 * Tablet
		 * Mouse
		 * Monitor
		 * HD Case
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter full file path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Product> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			double avg = list.stream()
					.map(p -> p.getPrice()) // a lista é de Produtos, queremos uma só com os valores
					.reduce(0.0, (x,y) -> x + y) / list.size();
			
			System.out.println("Average price: " + String.format("%.2f", avg));
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> productNames = list.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getName()).sorted(comp.reversed()) // .sorted é para ordenar
					.collect(Collectors.toList());
			
			productNames.forEach(System.out::println);
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
		
	}

}
