package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		
	}
	
	public Individual(String name, Double annualRevenue, Double healthExpenditures) {
		super(name, annualRevenue);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public double annualTax() {
		double tax;
		if (getAnnualRevenue() < 20000.00) {
			tax = (getAnnualRevenue() * 0.15) - (healthExpenditures/2); 
		} else {
			tax = (getAnnualRevenue() * 0.25) - (healthExpenditures/2);
		}
		return tax;
	}
	
}
