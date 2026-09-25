package data;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		//create OrderDB object
		OrderDB orders = new OrderDB();
		//pass orders.txt into loadOrders
		orders.loadOrders("orders.txt");
		//display contents
		orders.showOrders();
		
	}

}
