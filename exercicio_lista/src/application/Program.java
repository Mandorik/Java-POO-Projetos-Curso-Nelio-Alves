package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import utilities.Employee;

public class Program {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve
		 * haver repetição de id.
		 * 
		 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso o programa deve ler
		 * um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar
		 * a listagem autalizada dos funcionários conforme exemplos.
		 * 
		 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente.
		 * Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
		 * 
		 * EXEMPLO:
		 * 
		 * How many employees will be registered? 3
		 * 
		 * Employee #1:
		 * Id: 333
		 * Name: Maria Brown
		 * Salary: 4000.00
		 * 
		 * Employee #2:
		 * Id: 536
		 * Name: Alex Grey
		 * Salary: 3000.00
		 * 
		 * Employee #3:
		 * Id: 772
		 * Name: Bob Green
		 * Salary: 5000.00
		 * 
		 * Enter the employee id that will have salary increased: 536
		 * Enter the percentage: 10.0
		 * 
		 * List of employees:
		 * 333, Maria Brown, 4000.00
		 * 536 Alex Grey, 3300.00
		 * 772, Bob Green, 5000.00
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("How many employees will be registered? ");
		int N = sc.nextInt();
		List<Employee> employeeList = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.printf("Employee #%d:\n", i+ 1);
			sc.nextLine();
			System.out.print("Id: ");
			Integer id = sc.nextInt();

			while (hasId(employeeList, id)) { // Enquanto o id digitado existir na lista 
				System.out.println("This id is already takend! Try again: ");
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			Employee emp = new Employee(id, name, salary);
			employeeList.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have their salary increased: ");
		Integer idSalary = sc.nextInt();
		
		// Faz um filtro na lista employeeList e encontra o primeiro cujo id é igual ao idSalary, senão é vazio
		Employee emp = employeeList.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		// Integer pos =  findPosition(employeeList, idSalary); // Procurando a posição do idSalary dentro da lista
		
		if(!hasId(employeeList, idSalary)) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			//employeeList.get(pos).salaryIncrease(percentage);
			emp.salaryIncrease(percentage);
		}

		System.out.println();
		System.out.println("List of employees: ");
		for (int i = 0; i < N; i++) {
			System.out.println(employeeList.get(i));
		}
		
		sc.close();

	}
	
	public static Integer findPosition(List<Employee> employeeList, int id) { // Vai retornar a posição do item na lista
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getId() == id) {
				return i;
			}
		}
		return null; // Elemento não for encontrado
	}
	
	// Validação se o id já não existe:
	public static boolean hasId(List<Employee> employeeList, int id) {
		Employee emp = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	// No caso retorna TRUE se o id já existe
	
	// X antes da flecha é onde ele é declarado, no caso ele é uma representação do 
	// objeto Employee

}
