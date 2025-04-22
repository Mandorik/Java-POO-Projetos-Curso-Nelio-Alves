package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar nome,
		 * horas trabalhadas e valor por hora. Funcionários terceirizados possuem ainda uma despesa adicional
		 * 
		 * O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os 
		 * funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional
		 * 
		 * Faça um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista. 
		 * Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.
		 * 
		 * EXEMPLO:
		 * 
		 * Enter the number of employees: 3
		 * Employee #1 data:
		 * Outsorced (y/n)? n
		 * Name: Alex
		 * Hours: 50
		 * Value per hour: 20.00
		 * Employee #2 data:
		 * Outsourced (y/n)? y
		 * Name: Bob
		 * Hours: 100
		 * Value per hour: 15.00
		 * Additional charge: 200.00
		 * Employee #3 data:
		 * Outsourced (y/n)? n
		 * Name: Maria
		 * Hours: 60
		 * Value per hour: 20.00
		 * 
		 * PAYMENTS:
		 * Alex - $ 1000.00
		 * Bob - $ 1720.00
		 * Maria - $ 1200.00
		 * */

		Scanner sc = new Scanner(System.in);
				
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int N = sc.nextInt();
		
		// A lista pode receber objetos diferentes (Employee e OutsourcedEmployee) mas o tipo da lista será Employee, já que Outsourced o herda
		
		for(int i = 1; i<=N; i++) {
			System.out.printf("Employee #%d data: \n", i);
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine(); // Consumindo quebra de linha pendente do nextInt
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(outsourced == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
				// também é possível assim: list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
				// Assim o Employee emp nem precisa ser declarado
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		
		// Basta percorrer a lista, lendo nome e pagamento de cada um:
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
	}
		
		sc.close();
	}
	
}
