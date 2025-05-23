package entities;

public class SavingsAccount extends Account {
	
	private double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	};
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	// Usamos @Override pois, se acaso haja um erro na declaração do método (escrevemos o nome errado por exemplo) ele acusará erro
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}
