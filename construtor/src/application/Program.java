package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// CONSTRUTOR
		
		/*
		 * É uma operação especial da classe, que executa no momento da instanciação do objeto
		 * [comando new OBJETO]
		 * 
		 * Usos comuns:
		 * Iniciar valores dos atributos
		 * Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência)
		 * 
		 * Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
		 * 
		 * Product p = new Product();
		 * [O Product() no caso é um construtor padrão, em outras palavras, mesmo que não especifique um construtor customizado
		 * a classe tem um construtor padrão imbutido nela]
		 * 
		 * É possível especificar mais um construtor na mesma carga (sobrecarga)
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		// Product product = new Product(); agora o construtor padrão acusava erro, então como precisa de parâmetros só instanciamos depois dos
		// inputs do usuário
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine(); // Agora usamos uma variável auxiliar temporária para receber o input
		System.out.println("Price: ");
		double price = sc.nextDouble(); // Aqui igualmente
		// System.out.println("Quantity in stock: ");
		// int quantity = sc.nextInt(); // Aqui igualmente
		
		// Product product = new Product(name, price, quantity); // Parametriza as variáveis auxiliares!		
		
		Product product = new Product(name, price);
		
		// Digamos que queremos mudar o nome do produto, agora com private temos que agir

		product.setName("Computador");
		
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(1200.00);
		
		System.out.println("Updated price: " + product.getPrice());
		
		// Construtor serve pra proteger o programador de fazer besteira criando um produto sem nome e preço e deixando num estado inconsistente
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
		
		
		// PROPOSTA DE MELHORIA:
		
		/*
		 * Quando executamos o comando abaixo, instanciamos um produto "product" com seus atributos "vazios"
		 * 
		 * product = new Product()
		 * 
		 * Na memória o name = null   price = 0.0  quantity = 0
		 * 
		 * Entretanto, faz setnido um produto que não tem nome? Faz sentido um produto sem preço?
		 * 
		 * Com o intuito de evitar a existência de produtos sem nome e sem preço, é possível fazer
		 * com que seja "obrigatória" a iniciação desses valores?
		 * 
		 * Sim através de construtor
		 * */
		
	}

}
