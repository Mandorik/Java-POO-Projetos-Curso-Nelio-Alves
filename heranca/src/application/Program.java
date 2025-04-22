package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// É um tipo de associação que permite que uma classe herde TODOS os dados e comportamentos de outra
		
		// Definições importantes:
		
		// Vantagens:
		// - Reuso
		// - Polimorfismo
		
		// Sintaxe
		// class A extends B
		// classe A herda tudo da B
		
		// Exemplo:
		
		// Suponha um negócio de banco que possui uma conta comum e uma conta para empresas, sendo que a conta para empresa possui todos os membros da conta comum, mais um 
		// limite de empréstimo e uma operação de realizar empréstimo
		
		// Herança permite o reuso e atributos e métodos (dados e comportamento) 

		
		// Agora, com BusinessAccount extendendo Account, é possível criar um objeto desse tipo e usar os setters e getters de Account
		// Assim, tendo todos os atributos e métodos de Account
		
		
		// ###############################################################################################
		
		// MODIFICADOR DE ACESSO PROTECTED
		
		// Agora falando de herança, entenderemos melhor
		
		// Protected pode ser acessada em outra classe do mesmo pacote ou outro pacote mas subclasse
		
		// Exemplo prático para entendimento:
		
		// Suponha que, para realizar um empréstimo, é descontada uma taxa no valor de 10.0
		
		// Isso resulta em um erro:
		
		// public void loan (double amount){
		//		if (amount <= loanAmount){
		//			balance += amount - 10.0
		// 		}
		// }

		// Definições importantes:
		
		// Herança é relação "é-um" - se eu defino que a BusinessAccount tem tudo de Account, ela é uma Account porém com algo mais
		
		// Generalização/especialização - todo tipo de Account (comum ou Business) é Account. Ou seja Acoount é generalização, tipo mais genérico. Business é especialização
		
		// Supercalsse (classe base) / subclasse (classe derivada) - Superclasse é Account e a BusinessAccount, que deriva, é subclasse
		
		// Herança / extensão - já que BusinessAccount estende, ela tem tudo e acrescenta, está estendendo a classe Account
		
		// Herança é uma associação entre classes (e não entre objetos) - quando se tem composição entre 2 classes, na hora de instanciar, também vai ter dois objetos. Na herança não
		// quando estanciar o BusinessAccount vai ter um objeto só e esse objeto vai ter todos os membros de duas classes
		
		// Upcasting
		
		// Casting da subclasse para superclasse
		// Uso comum: polimorfismo
		
		// Downcasting
		
		// Casting da superclasse para subclasse
		// Palavra instanceOf
		// Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)
		
		// Exemplo:
		// Agora temos uma nova conta, SavingsAccount. Ela vai herdar os membros da conta comum, + interestDate e updateBalance();
		
		
		Account acc = new Account(1001, "Alex Green", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		// Pegar um objeto do tipo BusinessAccount e atribuí-lo a uma variável do tipo Account
		
		Account acc1 = bacc;
		
		acc1.getBalance();	// Por que não dá erro? Pois aprendemos que na aula de herança é uma relação "é-um", ou seja, uma BusinessAccount é uma Account, assim dá pra atribuir sem problemas
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		// Processo inversno
		
		BusinessAccount acc4 = (BusinessAccount) acc2; // Aqui dá erro mesmo ela sendo instanciada como BusinessAccount o tipo dela é Account. Assim o compilador reclama, não sabe se a conversão é segura
		// A conversão não é natural. Pra forçar tem que ter um casting manual
		acc4.loan(100.0);
		
		// acc2.loan() dá erro, não pode pois não teve casting, ela é um Account. Teria então que fazer downcasting
		
		// BusinessAccount acc5 = (BusinessAccount) acc3;
		// acc3 é do tipo Account, só que ela é instanciada como SavingsAccount e não BusinessAccount. Só que o compilador não alerta, só vai dar problema quando executar a ação
		
		// Como evitar esse tipo de erro? Pra ver se o objeto é realmente do tipo BusinessAccount, se for aí sim fazemos downcasting
		// Através do instanceOf
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
			
		}
		
		// Sobreposição ou sobrescrita
		
		// É a implementação de um método de uma superclasse na subclasse
					
		/*
		* Útil para declarar um comportamento específico de saque quando a conta for do tipo SavingsAccount.
		* Exemplo, superclasse Account. Tem o método withdraw, é possível reimplementar o método withdraw na SavingsAccount.
		* Isso através da Sobreposição
		* */
		
		
		// É fortemente recomendável usar a anotação @Override em um método sobrescrito
		// Facilita a leitura e compreensão do código
		// Avisamos ao compilador (boa prática) - assim ele pode verificar se a assinatura do método está certa
		
		
		// EXEMPLO:
		
		// Suponha que a operação de saque possui uma taxa no valor de 5.0. Entretanto, se a conta for do tipo poupança, não tem taxa
		
		// Como resolver isso?
		
		// Sobrescrevendo o método withdraw na subclasse SavingsAccount
		
		Account acc6 = new Account(1006, "Alex", 1000.0);
		
		acc6.withdraw(200);
		
		System.out.println("Regular Account acc6: " + acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1007, "John", 1000.00, 0.01);
		
		acc7.withdraw(200);
		
		System.out.println("SavingsAccount acc7: " + acc7.getBalance());
		
		// Palavra SUPER
		
		// É possível chamar a implementação da superclasse usando a palavra super
		
		// EXEMPLO:
		
		// Suponha que, na classe BusinessAccount, a regra para saque seja realizar o saque normalmente da superclasse mais 2.0.
		
		Account acc8 = new BusinessAccount(1008, "Steve", 1000.0, 500.0);
		
		acc8.withdraw(200);
		
		System.out.println("BusinessAccount acc8: " + acc8.getBalance());
		
		// Classes e métodos final
		
		// Palavra-chave final
		
		// Classe: evita que a classe seja herdada
		
		// public final class SavingsAccount {}
		
		// Método: evita que o método seja sobreposto
		
		// Exemplo - Classe Final
		
		// Suponha que você queira evitar que sejam criadas subclasses de SavingsAccount
		
		// Exemplo - Método Final
		
		// Suponha que você não queira que o método Withdraw de SavingsAccount seja sobreposto
		
		// Pra quê?
		
		/*
		 * Segurança: dependendo das regras do negócio, às vezes é desejável garantir que uma classe não seja herdada, ou que
		 * um método não seja sobreposto
		 * Geralmente convém acrescentar final em métodos sobrepostos, pois sobreposições múltiplas podem ser 
		 * uma porta de entrada de inconsistências
		 * */
		
		/*
		 * Performance: atributos de tipo de uma classe final são analisados de forma mais rápida em tempo de execução
		 * Exemplo clássico: String
		 * */
		
		// POLIMORFISMO
		
		/*
		 * Em Programação Orientada a Objetos, polimorfismo é um recurso que permite que variáveis de um mesmo tipo mais genérico
		 * possam apontar para objetos de tipos específicos diferentes, tendo assim comportamentos diferentes conforme cada
		 * tipo específico
		 * 
		 * Account x = new Account(1020, "Alex");
		 * Account y = new SavingsAccount(1023, "Maria", 0.01);
		 * 
		 * x.withdraw(50.0);
		 * y.withdraw(50.0);
		 * 
		 * O y será sujeito ao withdraw do SavingsAccount e não do Account
		 * */
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println("Account x's balance: " + x.getBalance());
		System.out.println("Account y's balance: " + y.getBalance());
		
		/*
		 * Importante Entender
		 * 
		 * A associação do tipo específico com o tipo genérico é feita em tempo de execução (upcasting)
		 * 
		 * O compilador não sabe para qual tipo específico a chamado do método Withdraw está sendo feita (ele só sabe
		 * que são duas variáveis do tipo Account):
		 * 
		 * Account x = new Account(1020, "Alex", 1000.0);
		 * Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		 * 
		 * x.withdraw(50.0);
		 * y.withdraw(50.0);
		 * */
		
	}

}
