package data;

public class Driver {

	public static void main(String[] args) {
		
		OrderDB orders = new OrderDB();
		orders.loadOrders("orders.txt");
		orders.showOrders();
		
		
		
	}

}
