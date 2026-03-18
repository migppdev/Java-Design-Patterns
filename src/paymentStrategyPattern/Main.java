package paymentStrategyPattern;

import paymentStrategyPattern.exception.PaymentNotSelectedException;

public class Main {
	public static void main(String[] args) {
		
		PaymentStrategy strategy = new WireTransferPayment();
		
		ShoppingCart shopCart = new ShoppingCart();
		shopCart.setStrategy(strategy);
		
		try {
			shopCart.processPayment();
		} catch (PaymentNotSelectedException e) {
			e.printStackTrace();
		}
	}
}
