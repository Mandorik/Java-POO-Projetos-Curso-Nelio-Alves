package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {

		return quantity * price;
	}

	// Atributo e parâmetro têm mesmo nome, para evitar redundância:
	// Usando o 'this'. Significa autorreferencia para o objeto
	public void addProducts(int quantity) {

		this.quantity += quantity; // Explícito que está acessando o atributo da classe e não o parâmetro

	}

	public void removeProducts(int quantity) {

		this.quantity -= quantity;
	}

	public String toString() { // Como a classe Product também é Object estou sobrepondo a operação toString padrão de Objects 
		// Aqui podemos implementar a nossa versão do toString
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: " + String.format("%.2f", totalValueInStock());
		
		
		// Toda classe em Java é uma subclasse da classe Object

		/*
		 * Object possui os seguintes métodos: getClass - retorna o tipo do objeto
		 * equals - compara se o objeto é igual a outro 
		 * hashCode - retorna um código
		 * hash do objeto toString - converte o objeto para string
		 */
		
	}
}

