package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department; // Um trabalhador só tem um departamento
	
	// Agora, como ele pode ter vários contratos, eles devem ser representados como uma lista
	
	private List<HourContract> contracts = new ArrayList<>(); // Lista precisa ser instanciada já na declaração do atributo
	
	public Worker() {
		
	}

	// Não marcar atributos que sejam listas para gerar constructor!

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	// Sem setter pois ele trocaria a lista por uma outra, o que não pode!
	
	// Vai simplesmente pegar a lista de contratos e adicionar nela o que veio como argumento
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	// Vai remover o contrato informado da lista de contratos
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	// O quanto ele ganhou no mês é o salário base somado às horas do contrato no mês em questão
	
	public Double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		
		// Agora é preciso percorrer os contratos testando quais são do mês e ano. Se for, entrará também na soma
		for (HourContract c : contracts) {
			
			// Todo contrato tem uma data, a partir dela pegamos mês e ano
			cal.setTime(c.getDate()); // Pegamos a data do contrato e definimos como a data do calendário
			
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH); // Mês começa com 0
			
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		
				
		return sum;
	}
	
}
