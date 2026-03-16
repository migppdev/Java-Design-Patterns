package notificationFactory.factory;

import notificationFactory.Notification;
import notificationFactory.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory{
	
	@Override
	public Notification createNotification() {
		return new SMSNotification();
	}
	
}
