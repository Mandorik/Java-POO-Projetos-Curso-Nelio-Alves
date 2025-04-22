package entities;

public abstract class TaxPayer {

	private String name;
	private Double annualRevenue;
	
	public TaxPayer() {
		
	}
	
	public TaxPayer(String name, Double annualRevenue) {
		super();
		this.name = name;
		this.annualRevenue = annualRevenue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualRevenue() {
		return annualRevenue;
	}

	public void setAnnualRevenue(Double annualRevenue) {
		this.annualRevenue = annualRevenue;
	}
	
	public abstract double annualTax();
	
}

