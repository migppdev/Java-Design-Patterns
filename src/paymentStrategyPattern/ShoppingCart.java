package paymentStrategyPattern;
import paymentStrategyPattern.exception.PaymentNotSelectedException;

public class ShoppingCart {
	
	private PaymentStrategy strategy;
	
	public void setStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void processPayment() throws PaymentNotSelectedException {
		if (this.strategy == null) {
			throw new PaymentNotSelectedException("A payment method has not been selected");
		}
		strategy.pay(2084);
	}
	
}
