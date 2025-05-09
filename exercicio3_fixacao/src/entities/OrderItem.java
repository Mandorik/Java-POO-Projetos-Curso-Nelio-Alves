package entities;

public class OrderItem {

	private Integer quantity;
	private Double price; // Repete para fins de histórico, pois se o valor do produto mudar, o OrderItem daquela ordem àquele momento terá esse preço
	
	// Composição entre um objeto e outro, vou dizer que o OrderItem contém referência a um objeto Product 
	private Product product;
	
	public OrderItem() {
		
	}
	
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) { 
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return getProduct().getProductName() + ", $" + String.format("%.2f", price) + ", Quantity: " + quantity + ", Subtotal: $" + String.format("%.2f", subTotal());
	}
}
