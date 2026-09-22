package data;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class OrderDB {
	private Order [] ordersArray;
	

	
	public void loadOrders(String orderstxt) throws IOException {
		FileReader fr = new FileReader (orderstxt);
		BufferedReader br = new BufferedReader (fr);
		String line = br.readLine();
		int orderID = 0;
		String product = "";
		double total = 0.00;
		int index = 0;
		line = br.readLine();
		
		ordersArray = new Order [100];
		
			while ( line != null) {
		
				String [] split = line.split(",");
			
				orderID = Integer.parseInt(split[0]);
				product = split[2];
				total = Double.parseDouble(split[3]);
			
				Order order = new Order(orderID, product, total);
			
			
				ordersArray[index] = order;
				index++;
			
					
				line = br.readLine();
			
			}
		br.close();
	}
	
	public void showOrders() {
		int index;
		for (index = 0; index < ordersArray.length; index++) {
			Order order = ordersArray[index];
			order.getOrderID();
			order.getProduct();
			order.getTotalAmount();
			System.out.println(order.getOrderID() + "," + order.getProduct() + "," + 
			order.getTotalAmount());
		}
		
		
	}
}
