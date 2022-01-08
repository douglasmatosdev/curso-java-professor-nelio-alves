package secao_13.exercices.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import secao_13.exercices.entities.Client;
import secao_13.exercices.entities.Order;
import secao_13.exercices.entities.OrderItem;
import secao_13.exercices.entities.Product;
import secao_13.exercices.enums.OrderStatus;

public class Program {

	public static void run() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data: ");

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.next();

		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		System.out.println("Enter order data: ");

		System.out.print("Status: ");
		String status = sc.next();

		Client client = new Client(name, email, birthDate);
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data: ");

			System.out.print("Product name: ");
			String productName = sc.next();

			System.out.print("Product price: ");
			double price = sc.nextDouble();

			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();

			Product product = new Product(productName, price);
			OrderItem orderItem = new OrderItem(quantity, price, product);

			order.addItem(orderItem);
		}
		
		System.out.println();

		System.out.println("ORDER SUMMARY: ");
		System.out.println("Order moment: " + order.getMoment());
		System.out.println("Order status: " + order.getStatus());
		System.out.println(client);
		System.out.println("Order items: ");
		
		for (OrderItem item : order.getOrderItem()) {
			System.out.println(item);
		}

		System.out.printf("Total price: $%.2f", order.total());

		sc.close();
	}

}
