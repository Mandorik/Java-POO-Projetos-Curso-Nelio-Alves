package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * public interface Comparable<T> {
		 * 		int compareTo(T o);
		 * }
		 * 
		 * Aqui entendemos que é como se fosse a lista, pois declaramos ela e entre o <> o tipo da lista.
		 * Ela é parametrizada em um tipo T qualquer. E esse int compareTo vai receber um objeto 'o' do tipo T.
		 * 
		 * Problema motivador:
		 * 
		 * Faça um programa para ler um arquivo contendo nome de pessoas (um nome por linha), armazenando-os em uma lista.
		 * Depois, ordene os dados dessa lista e os mostre ordenadamente na tela.
		 * Nota: o caminho do arquivo pode ser informado "hardcoded"
		 * 
		 * Exemplo:
		 * Maria Brown
		 * Alex Green
		 * Bob Grey
		 * Anna White
		 * Alex Black
		 * Eduardo Rose
		 * William Red
		 * Marta Blue
		 * Alex Brown
		 * */
		
		List<String> list = new ArrayList<>();
		String path = "D:\\Downloads(HD)\\JavaExercicios\\out\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			Collections.sort(list); // Forma de ordenar uma coleção
			for (String s : list) {
				System.out.println(s);
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		// Outro Problema
		
		/*
		 * Faça um programa para ler um arquivo contendo funcionários (nome e salário) no formato .csv, armazenando-os em uma lista.
		 * Depois, ordene a lista por nome e mostre o resultado na tela. Nota: o caminho do arquivo pode ser hardcoded
		 * 
		 * Maria Brown,4300.00
		 * Alex Green,3100.00
		 * Bob Grey,3100.00
		 * Anna White,3500.00
		 * Alex Black,2450.00
		 * Eduardo Rose,4390.00
		 * William Red,2900.00
		 * Marta Blue,6100.00
		 * Alex Brown,5000.00
		 * */
		System.out.println();
		
		List<Employee> list2 = new ArrayList<>();
		String path2 = "D:\\Downloads(HD)\\JavaExercicios\\out\\in-func+salar.txt";
		
		try(BufferedReader br2 = new BufferedReader(new FileReader(path2))){
			
			String employeeCSV = br2.readLine();
			while(employeeCSV != null) {
				String[] fields = employeeCSV.split(","); // Vetor separa cada campo pela ,
				list2.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCSV = br2.readLine();	
			}
			// Collections.sort agora dá erro, não aceita ordenar a lista de funcionários
			// Basicamente o método sort só pode ordenar a lista do tipo <T> se ela for de um tipo comparable
			// Para que o Employee implemente Comparable será necessário implementar a classe Comparable
			Collections.sort(list2); 
			for(Employee emp : list2) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
			
			// Suponhamos que agora a ordem é por salário e não por nome:
			// é necessário trocar no método compareTo o name por salary
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
	}

}
