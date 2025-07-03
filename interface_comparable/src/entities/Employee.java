package entities;

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	// Suponhamos que agora a ordem é por salário e não por nome:
	// é necessário trocar no método compareTo o name por salary
	
	// Se fosse por ordem decrescente, seria por um - na frente do salary.compareTo
	
	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.getName());
		// return salary.compareTo(o.getSalary());
		// return -salary.compareTo(o.getSalary());
	}
	// Esse método serve para comparar um obj com outro
	
	/*
	 * A definição do compareTo é quando você compara um obj com outro, o resultado será um número negativo, 0 ou número inteiro positivo
	 * se o obj or menor, igual, ou maior do que o objeto especificado
	 * 
	 * Exemplo:
	 * 
	 * System.out.println("maria".compareTo("alex"));
	 * System.out.println("alex".compareTo("maria"));
	 * System.out.println("maria".compareTo("maria"));
	 * 
	 * Output:
	 * 12
	 * -12
	 * 0
	 * 
	 * 
	 * Maria é maior em ordem alfabética. 
	 * 
	 * Maria com Alex é superior, portanto positivo
	 * Alex com Maria é inferior, portanto positivo
	 * Maria com Maria é igual, portanto 0
	 * */
	
}
