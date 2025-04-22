package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// EXERCÍCIO DE FIXAÇÃO
		
		/*
		 * Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular
		 * da conta e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
		 * incial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depoistar no momento de abrir sua conta,
		 * o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
		 * 
		 * Importante: uma vez que a conta bancária for aberta o número da conta nunca poderá ser alterado. Já o nome do titular
		 * pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo).
		 * 
		 * Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso.
		 * O saldo só aumenta por meio de depóstiso, e só diminui por meio de saques. Para cada saque realizado o banco cobre
		 * uma taxa de $ 5.00.
		 * 
		 * Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa
		 * 
		 * Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado
		 * o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados
		 * da conta após cada operação
		 * 
		 * EXAMPLE 1:
		 * 
		 * Enter account number: 8532
		 * Enter account holder: Alex Green
		 * Is there an initial deposit? (y/n) y
		 * Enter initial deposit value: 500.00
		 * 
		 * Account data:
		 * Account 8532, Holder: Alex Green, Balance; $ 500.00
		 * 
		 * Enter a deposit value: 200.00
		 * Updated account data:
		 * Account 8532, Holder: Alex Green, Balance: $ 700.00
		 * 
		 * Enter a withdrawal value: 300.00
		 * Update account data:
		 * Account 8532, Holder: Alex Green, Balance: $ 395.00
		 * 
		 * EXAMPLE 2:
		 * 
		 * Enter account number: 7801
		 * Enter account holder: Maria Brown
		 * Is there an initial deposit? (y/n) n
		 * 
		 * Account data:
		 * Account 7801, Holder: Maria Brown, Balance: $ 0.00
		 * 
		 * Enter a deposit value: 200.00
		 * Updated account data:
		 * Account 7801, Holder: Maria Brown, Balance $ 200.00
		 * 
		 * Enter a withdrawal value: 198.00
		 * Updated account data:
		 * Account 7801, Holder: Maria Brown, Balance $ -3.00
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		Account account; // Por isso 
		
		System.out.print("Enter the account number: ");
		int number = sc.nextInt();
		System.out.print("Enter the account holder's name: ");
		sc.nextLine(); // Já que o próximo scan é a linha toda, precisamos que seja consumida a quebra de linha que ficou pendente
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit value? (y/n) ");
		char depositExists = sc.next().charAt(0);
		
		if (depositExists == 'y'|| depositExists == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
			// Se instanciar aqui dentro, dados ficam presos dentro do if. Por tanto declaramos fora e aí instanciamos dentro [SOBRECARGA]
		}
		else {
			account = new Account(number, holder); // SOBRECARGA
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit value:");
		double amount = sc.nextDouble();
		System.out.println("Updated amount:");
		account.deposit(amount);
		System.out.println(account);
		System.out.println();
		
		System.out.println("Enter a withdrawal amount:");
		amount = sc.nextDouble();
		account.withdrawal(amount);
		System.out.println(account);
		
		
		sc.close();
		
	}

}
