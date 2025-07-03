package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Na contagem de votos de uma eleição, são gerados vários registros de votação contendo o nome
		 * do candidato e a quantidade de votos (formato .csv) que ele obteve em uma urna de votação. Faça
		 * um programa para ler os registros de votação a partir de um arquivo, e daí gerar um relatório
		 * consolidado com os totais de cada candidato
		 * 
		 * EXEMPLO
		 * 
		 * Input file example:
		 * Alex Blue,15
		 * Maria Green,22
		 * Bob Brown,21
		 * Alex Blue,30
		 * Bob Brown,15
		 * Maria Green,27
		 * Maria Green,22
		 * Bob Brown,25
		 * Alex Blue,31
		 * 
		 * Execution:
		 * Enter file full path: c:\temp\in.txt
		 * Alex Blue: 76
		 * Maria Green: 71
		 * Bob Brown: 61
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> votesMap = new LinkedHashMap<>();
		
		System.out.printf("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);
				
				if(votesMap.containsKey(name)) {
					int votesSum = votesMap.get(name);
					votesMap.put(name, count + votesSum);
				}
				else {
					votesMap.put(name, count);
				}
				
				line = br.readLine();
			}
			
			for (String key: votesMap.keySet()) {
				System.out.println(key + ": " + votesMap.get(key));
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}	
		
		sc.close();

	}

}
