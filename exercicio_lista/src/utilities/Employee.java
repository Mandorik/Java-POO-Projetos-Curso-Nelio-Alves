package utilities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	
	
	public Employee() {
		
	}
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
	public void salaryIncrease(Double percentage) {
		salary = salary * (1 + (percentage/100.00));
	}
	
	// @Override vai te alertar caso esteja escrito errado o toString pois não existe aquele método no Java
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
	
}
