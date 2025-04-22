package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double workerBaseSalary = sc.nextDouble();
		
		// WorkerLevel.valueOf(workerLevel) vai criar uma instancia do tipo enumerado WorkerLevel
		// departamento é outro objeto do Department. Precisa primeiro instanciar um departamento e só então associar worker com ele
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(departmentName));
		
		System.out.print("How many contracts this worker has? ");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.printf("Enter contract #%d data: \n", i);
			System.out.print("Date (DD/MM/YYYY): ");
			
			// Para receber uma data no formato (DD/MM/YYYY) vamos precisar criar um SimpleDateFormat para receber nesse formato
			// .parse() recebe o string contendo a data, nesse caso o next()
			
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours); // Instancia-o 
			worker.addContract(contract); // Para associar esse contract ao trabalhador:
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		
		// Em vez de utilizar SimpleDateFormat, podemos recortar a String e guardá-la como int separadamente
		int month = Integer.parseInt(monthAndYear.substring(0,2)); // Onde para precisa ser a posição onde quer + 1
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName()); // Acessamos o objeto departamento do worker e aí então pegamos o nome
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();

	}

}
