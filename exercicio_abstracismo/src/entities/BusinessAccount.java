package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;
	
	public BusinessAccount() {
		// Inclusive aqui também é possível invocar o construtor super sem argumentos:
		// super();
		// Pois vai que há uma lógica implementada no construtor padrão dela que precisa ser utilizado aqui também
	}

	// Na hora de instanciar um BusinessAccount com os argumentos, será interessante trazer todos os dados de Account + o que tem no BusinessAccount
	// Na hora de gerar automático, selecionar qual o construtor super a ser invocado
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // Chama o construtor da superclasse (Account) com o super
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan (double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0; // Dava erro que o balance não é visível (quando era private)
			// Isso pois balance é private, só pode ser acessado pela própria classe, ninguém mais
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount); // Invoca o withdraw da superclasse usando a palavra super, usando a regra da superclasse
		balance -= 2.0; // Aí então remove outros 2
	}
	
}
