package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		// Classes abstratas
		
		// São classes que não podem ser instanciadas
		// É uma forma de garantir herança total: somente subclasses não abstratas podem sser instanciadas, mas nunca 
		// a superclasse abstrata
		
		// Exemplo
		
		/*
		 * Suponha que em um negócio relacionado a banco, apenas contas poupança e contas para empresas são permitidas.
		 * Não existe conta comum
		 * 
		 * Para garantir que contas comum não possam ser instanciadas, basta acrescentarmos a palavra "abstract" na declaração
		 * da classe
		 * 
		 * public abstract class Account*/

		
		// Ao adicionar abstract agora dá erro! Não pode instanciar, pois é abstrata
		// Account acc1 = new Account(1001, "Alex", 1000.0);
		// Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		// Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		
		
		// Se a classe Account não pode ser instanciada, por que simplesmente não criar somente SavingsAccoutn e BusinessAccount?
		
		// Resposta:
		// Reuso
		// Polimorfismo: a superclasse genérica nos permite travar de forma fácil e uniforme todos os tipos de conta, inclusive com 
		// polimorfismo se for o caso (como fizemos nos últimos exercícios). Por exemplo, você pode colocar todos os tipos de contas
		// em uma mesma coleção
		
		// Demo: suponha que você queira:
		// Totalizar o salto de todas as contas
		// Depositar 10.00 em todas as contas
		
		// Fica muito mais fácil com uma classe genérica
		
		// Usando o upcasting é possível inserir SavingsAccount bem como BusinessAccount
		List<Account> list = new ArrayList<>(); // O tipo é justamente o tipo genérico
		
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

		double sum = 0.0;
		
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f\n", sum);
		System.out.println();
		
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		
		for (Account acc: list) {
			System.out.printf("Conta: %s\n", acc.getHolder());
			System.out.printf("Saldo: %.2f\n", acc.getBalance());
			System.out.println();
		}
		
	}


}
