package notificationFactory;

import notificationFactory.factory.EmailNotificationFactory;
import notificationFactory.factory.NotificationFactory;
import notificationFactory.factory.PushNotificationFactory;
import notificationFactory.factory.SMSNotificationFactory;


public class MainNotification {
	public static void main(String[] args) {
		
		
		NotificationFactory factory = new SMSNotificationFactory();
		NotificationFactory factory2 = new PushNotificationFactory();
		NotificationFactory factory3 = new EmailNotificationFactory();

		factory.sendMessage("lorem ipsum dolor sit amet");
		factory2.sendMessage("lorem ipsum dolor sit amet");
		factory3.sendMessage("lorem ipsum dolor sit amet");
		
	}
}
