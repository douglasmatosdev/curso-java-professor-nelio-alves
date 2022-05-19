package secao_09.application;
import java.util.Locale;
import java.util.Scanner;

import secao_09.entities.Product;


public class Program {
	public static void run() {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
//		System.out.print("Quantity in stock: ");
//		int quantity = sc.nextInt();
		
		Product product = new Product(name, price);
		
		// Testing getters and setters
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());
		
		
		System.out.println();
		System.out.println("Productdata: " + product);
		
		System.out.println();		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();		
		System.out.println("Updated data: " + product);
		
		System.out.println();		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}