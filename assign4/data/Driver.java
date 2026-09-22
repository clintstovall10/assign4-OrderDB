package data;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		OrderDB orders = new OrderDB();
		orders.loadOrders("orders.txt");
		orders.showOrders();
		
		
		
	}

}
