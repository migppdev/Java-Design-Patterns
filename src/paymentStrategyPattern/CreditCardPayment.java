package paymentStrategyPattern;

public class CreditCardPayment implements PaymentStrategy {
	@Override
	public void pay(double amount) {
		System.out.printf("[+] Credit card transaction: %.2f EUR", amount);
	}
}
