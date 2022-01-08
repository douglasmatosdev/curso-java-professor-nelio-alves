package secao_13.exercices.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import secao_13.exercices.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	
	private OrderStatus status;
	
	private List<OrderItem> orderItem = new ArrayList<>();
	
	private Client client;
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public String getMoment() {
		return sdf.format(moment);
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		orderItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		
		for (OrderItem item : orderItem) {
			sum += item.getPrice() * item.getQuantity();
		}
		
		return sum;
	}

	@Override
	public String toString() {
		return "Order [moment=" + moment + ", status=" + status + ", client=" + client + "]";
	}

	
}
