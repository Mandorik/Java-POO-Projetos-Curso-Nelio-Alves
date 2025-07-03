package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {

		/*
		 * Um site de internet registra um log de acessos dos usuários. Um registro de log consiste
		 * no nome do usuário (apenas uma palavra) e o instante em que o usuário acessou o site no padrão
		 * ISO 8601, separados por espaço, conforme exemplo. Faça um programa que leia o log de acessos
		 * a partir de um arquivo e informe quantos usuários distintos acessaram o site.
		 * 
		 * EXEMPLO:
		 * 
		 * input file:
		 * amanda 2018-08-26T20:45:08Z
		 * alex86 2018-08-26T21:49:37Z
		 * bobbrown 2018-08-27T03:19:13Z
		 * amanda 2018-08-27T08:11:00Z
		 * jeniffer3 2018-08-27T09:19:24Z
		 * alex86 2018-08-27T22:39:52Z
		 * amanda 2018-08-28T07:42:19Z
		 * 
		 * Execution:
		 * 
		 * Enter file full path: c:\temp\in.txt
		 * Total users: 4
		 * */
		
		// O set é bem útil aqui pois não aceita repetições
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter file's full path: ");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Set<LogEntry> set = new HashSet<>(); // Mais rápido e no problema pra contar quantidade de usuários independe ordem de entrada
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				set.add(new LogEntry(username, moment)); // A própria estrutura de dados set vai barrar inserções com mesmo nome
				
				line = br.readLine();
			}
			
			System.out.println("Total users: " + set.size());
			
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		
		sc.close();
	}

}
