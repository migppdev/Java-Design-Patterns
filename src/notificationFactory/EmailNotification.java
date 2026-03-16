package notificationFactory;

public class EmailNotification implements Notification {
	public EmailNotification() {
	}
	
	@Override
	public void send(String message) {
		
		System.out.println("Sending email: " + message);
				
	}
	
	
}
