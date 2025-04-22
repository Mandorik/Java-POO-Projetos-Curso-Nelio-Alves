package entities;

public class Company extends TaxPayer {

	private Integer employeeNumber;
	
	public Company() {
		
	}
	
	public Company(String name, Double annualRevenue, Integer employeeNumber) {
		super(name, annualRevenue);
		this.employeeNumber = employeeNumber;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public double annualTax() {
		double tax;
		if(employeeNumber > 10) {
			tax = getAnnualRevenue() * 0.14;
		} else {
			tax = getAnnualRevenue() * 0.16;
		}
		return tax;
	}
}
