package entities;

public class Product {

		private String name;
		private double price;
		private int quantity;
		
		// Geralmente pomos o Construtor depois dos atributos e antes dos métodos
		
		public Product() {
			// Aqui ele fica como o padrão, se tu ainda quiser mantê-lo
		}
		
		// public + nome da classe e aí parâmetros. Parecido com método comum mas sem tipo de retorno
		public Product(String name, double price, int quantity) { 	// Parâmetros não precisam de mesmo nome, convenção usar o mesmo
			this.name = name; // This = referência para o próprio objeto, no caso o atributo dele
			this.price = price; // Sem this. está referenciando o parâmetro
			this.quantity = quantity;
		}
		
		public Product(String name, double price) { // Construtor sobrecarregado
			this.name = name;
			this.price = price;
			// this.quantity = 0; Por padrão, em Java, quando não tem dado o int é 0 então é opcional
			// O próprio this AQUI seria opcional já que não tem um atributo como parâmetro
		}
		
		/*
		 * Palavra this
		 * 
		 * É uma referência para o próprio objeto
		 * 
		 * Usos comuns:
		 * Diferenciar atributos de variáveis locais
		 * Passar o próprio objeto como argumento na chamada de um método ou construtor
		 * */
		
		// #############################################################################################################################
		
		// Por convenção, getter e setter são postos após construtores
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		// Objeto Product a quantidade não pode ser alterada, por conta de regra de negócio, então só tem get
		
		// Assim, sem set, protege de alterações inconsistentes na quantidade dele. Vai ser mudada apenas pelos métodos
		// addProducts ou removeProducts
		
		public int getQuantity() {
			return quantity;
		}
		
		// #############################################################################################################################
		
		public double totalValueInStock() {
			return price * quantity;
		}
		
		public void addProducts(int quantity) {
			this.quantity += quantity;
		}
		
		public void removeProducts(int quantity) {
			this.quantity -= quantity;
		}
		
		public String toString() {
			return name
					+ ", $ "
					+ String.format("%.2f",  price)
					+ ", "
					+ quantity
					+ " units, Total: $ "
					+ String.format("%.2f", totalValueInStock());
		}
		
		/*
		 * Sobrecarga:
		 * 
		 * É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas
		 * de parâmetro.
		 * 
		 * Portanto, segunda proposta de melhoria, vamos criar um construtor opcional, o qual recebe apenas nome e preço
		 * do produto. A quantidade em estoque deste novo produto, por padrão, deverá ser então iniciada com valor zero.
		 * 
		 * Nota é possível também incluir um construtor padrão
		 * 
		 * OU SEJA disponibilizar mais de uma versão da mesma operação, a diferença é lista de parâmetros
		 * */
		
		
		
		/*
		 * Encapsulamento é um princípio que consiste em esconder detalhes de implementação de uma classe, expondo
		 * apenas operações seguras e que mantenham os objetos em um estado consistente.
		 * 
		 * Regra de ouro: O objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso
		 * 
		 * Regra geral básica: 
		 * Um objeto NÃO deve expor nenhum atributo (modificador de acesso private)
		 * 
		 * Os atributos devem ser acessados por meio de métodos get e set
		 * Padrão JavaBeans: https://en.wikipedia.org/wiki/JavaBeans
		 * */
		
		/*
		 * PADRÃO PARA IMPLEMENTAÇÃO DE GETTERS E SETTERS:
		 * 
		 * private String name;  // Private quer dizer que esse atributo não pode ser acessado por outras classes
		 * private double price;
		 * 
		 * public String getName(){
		 * 		return name;
		 * }
		 * 
		 * public void setName(String name){
		 * 		this.name = name;
		 * }
		 * 
		 * public double getPrice(){
		 * 		return price;
		 * }
		 * 
		 * public void setPrice(double price){
		 * 		this.price = price;
		 * }
		 * 
		 * */
}
