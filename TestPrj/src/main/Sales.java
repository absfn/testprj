package main;

public class Sales {
	
	private static double amount=0;
	
	
	public void main () {
		
		sold_items("rice", 10);
		System.out.println("total amount sold="+amount);
	}
	public double sold_items (String item_name, double price) {
	    amount=amount+price;
	    
		return amount;
	}
	

}
