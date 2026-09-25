package data;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class OrderDB {
	
	private Order [] ordersArray;
	
	//counts the number of orders 
	
	private int orderNumbers = 0;
	

	
	public void loadOrders(String orderstxt) throws IOException {
		//add my readers
		FileReader fr = new FileReader (orderstxt);
		BufferedReader br = new BufferedReader (fr);
		
		//read the first line
		String line = br.readLine();
		
		//declare and initialize my variables 
		int orderID = 0;
		String product = "";
		double total = 0.00;
		
		//read the next line because we don't want the header
		line = br.readLine();
		
		//initialize the size of my array
		ordersArray = new Order [100];
		
			while ( line != null) {
				//each line into its on array element by using comma as a delimiter
				String [] split = line.split(",");
				
				//I knew what elements I wanted to extract from each line of orders and converted
				//string elements into either int or double
				orderID = Integer.parseInt(split[0]);
				product = split[2];
				total = Double.parseDouble(split[3]);
			
				//called the order class and passed each variable into it, to store each orders values
				Order order = new Order(orderID, product, total);

				ordersArray[orderNumbers] = order;
				orderNumbers++;
			
				line = br.readLine();
			
			}
			
		br.close();
	}
	
	public void showOrders() {
		
		int index;
		System.out.printf("%-8s %-30s %10s%n", "Order ID", "Product", "Total Amt");
		System.out.printf("%-8s %-30s %10s%n", "--------", "-------", "---------");
		
		//for loop to iterate through each line of orders and call the order class to get values at each line
		for (index = 0; index < orderNumbers; index++) {
			Order order = ordersArray[index];
			order.getOrderID();
			order.getProduct();
			order.getTotalAmount();
			System.out.printf("%-8d %-30s %10.2f%n", order.getOrderID(), order.getProduct(), order.getTotalAmount());
		}
		
		
	}
}
