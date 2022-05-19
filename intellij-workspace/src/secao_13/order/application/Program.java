package secao_13.order.application;

import java.util.Date;

import secao_13.order.entities.Order;
import secao_13.order.enums.OrderStatus;

public class Program {

	public static void run() {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
