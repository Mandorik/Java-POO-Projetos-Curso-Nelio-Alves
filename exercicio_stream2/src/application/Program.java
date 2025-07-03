package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		/*
		 * Faça um programa para ler os dados (nome, email e salário) de funcionários a partir de um arquivo
		 * em formato .csv
		 * 
		 * Em seguida mostre, em ordem alfabética, o email dos funcionários cujo slaário seja superior a 
		 * um dado valor fornecido pelo usuário.
		 * 
		 * Mostre tambéma soma dos salários dos funcionários cujo nome começa com a letra M.
		 * 
		 * EXEMPLO
		 * 
		 * Input File:
		 * Maria,maria@gmail.com,3200.00
		 * Alex,alex@gmail.com,1900.00
		 * Marco,marco@gmail,1700.00
		 * Bob,bob@gmail,3500.00
		 * Anna,anna@gmail,2800.00
		 * 
		 * Execution:
		 * Enter full file path: c:\\temp\in.txt
		 * Enter salary: 2000.00
		 * Email of people whose salary is more than 2000.00:
		 * anna@gmail.com
		 * bob@gmail.com
		 * maria@gmail.com
		 * Sum of salary of people whose name starts with 'M': 4900.00
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter full file path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			List<Employee> list = new ArrayList<>();
			
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			double avg = list.stream()
					.map(emp -> emp.getSalary())
					.reduce(0.0, (x,y) -> x + y / list.size());
			
			System.out.printf("Enter salary: ");
			Double salaryThreshold = sc.nextDouble();
			
			List<String> emails = list.stream()
					.filter(emp -> emp.getSalary() > avg)
					.map(emp -> emp.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is over " + salaryThreshold + ": ");
			emails.forEach(System.out::println);
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
		
	}

}
