import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter client data: ");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Birth date (DD/MM/YYYY: ");
        String birthDate = scanner.nextLine();

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = scanner.nextLine();

        Client client = new Client(name, email, sdf.parse(birthDate));
        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + "  item data:");

            System.out.print("Product name: ");
            String productName = scanner.next();

            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();

            System.out.print("Quantity: ");
            int productQuantity = scanner.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);

            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment: " + order.getMoment());
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + order.getClient().getName() + " (" + order.getClient().getBirthDate() + ") - " + order.getClient().getEmail());
        System.out.println("Order items: ");

        double sum = 0.0;
        for (OrderItem oi : order.getOrderItems()) {
            System.out.println(oi.toString());
            sum += oi.subTotal();
        }
        System.out.printf("Total price: $%.2f%n", sum);

        scanner.close();
    }
}