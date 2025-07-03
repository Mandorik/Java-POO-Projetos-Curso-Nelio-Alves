package entities;

public class Product {
	
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	// Método que pega um produto e retorna um booleano
	public static boolean staticProductPredicate(Product p) {
		// Fará a mesma lógica de interface, mas sendo um método
		return p.getPrice() >= 100;
	}
	
	public boolean nonStaticProductPredicate() { // Por não ser static trabalha com o próprio Produto (da instância), não argumento
		return price >= 100; // Acessando o atributo deste objeto onde estou
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
}
