package paymentStrategyPattern;

public class PaypalPayment implements PaymentStrategy {
	@Override
	public void pay(double amount) {
		System.out.printf("[+] PayPal transaction: %.2f EUR", amount);
	}
}
