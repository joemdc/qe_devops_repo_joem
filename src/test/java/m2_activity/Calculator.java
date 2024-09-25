package m2_activity;

public class Calculator {

	private double itemPrice = 50.0;
	private double deliveryCharge;
	
	
	public void compute(int count) {
		double orderPrice = itemPrice * count;
		if (orderPrice > 1000) {
			deliveryCharge = 0;
		} else {
			deliveryCharge = 250;
		}
		double totalAmountDue = orderPrice + deliveryCharge;
		System.out.println("Order Price: P" + orderPrice);
		System.out.println("Delivery Charge: P" + deliveryCharge);
		System.out.println("TOTAL: P" + totalAmountDue + "\n");
	}
	
}
