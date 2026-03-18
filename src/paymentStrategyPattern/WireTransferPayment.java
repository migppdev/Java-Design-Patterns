package paymentStrategyPattern;

public class WireTransferPayment implements PaymentStrategy {
	@Override
	public void pay(double amount) {
		System.out.printf("[+] Wire transfer transaction: %.2f EUR", amount);
	}
}
