package entities;

public class Account {

	private int number; // Não pode ser modificado, portanto sem setter
	private String holder;
	private double balance; // Só pode mudar com deposito ou saque, portanto não pode ter setter
	
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); // O balance começa 0, através do depósito inicial ele vai ter essa quantia 
		
		/*
		 * Dessa forma o construtor é protegido de mudanças no futuro, caso a regra de depósito inicial mude futuramente,
		 * tenha uma taxa por exemplo, será necessário apenas mudar o método deposit()
		 * */
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdrawal(double amount) {
		balance -= (amount + 5.00); // Tem taxa de 5 reais
	}
	
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
	
	}
	
