package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		// Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um sumário do pedido conforme exemplo.
		// Nota, o instante do pédido deve ser o instante do sistema: new Date()
		
		/*
		 * Enter client data:
		 * Name: Alex Green
		 * Email: alex@gmail.com
		 * Birth date (DD/MM/YYYY): 15/03/1985
		 * Enter order data:
		 * Status: PROCESSING
		 * How many items to this order? 2
		 * Enter #1 item data:
		 * Product name: TV
		 * Product price: 1000.00
		 * Quantity: 1
		 * Enter #2 item data:
		 * Product name: Mouse
		 * Product price: 40.00
		 * Quantity: 2
		 * 
		 * ORDER SUMMARY:
		 * Order moment: 20/04/2018 11:25:09
		 * Order status: Processing
		 * Client: Alex Green (15/03/1985) - alex@gmail.com
		 * Order items:
		 * TV, $1000.00, Quantity: 1, Subtotal: $1000.00
		 * Mouse, $40.00, Quantity: 2, Subtotal: $ 80.00
		 * Total Price: $1080.00
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client's data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next()); // valueOf converte a String no valor definido no objeto OrderStatus
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.printf("Enter #%d item data:\n", i);
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			// 1o Instanciar o produto, 2o instanciar o OrderItem 3o adicionar esse OrderItem à Order
			Product product = new Product(productName, productPrice);
			OrderItem it = new OrderItem(quantity, productPrice, product);
			order.addItem(it);
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
		

	}

}
