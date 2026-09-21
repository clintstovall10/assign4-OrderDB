package data;

public class Order {
	
	private int orderID;
	private String product;
	private double totalAmount;
	
	public Order (int orderID, String product, double totalAmount) {
		this.orderID = orderID;
		this.product = product;
		this.totalAmount = totalAmount;
		
	}
	public int getOrderID() {
		return orderID;
	}
	public String getProduct() {
		return product;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
		
	
	
	
}



