package notificationFactory.factory;

import notificationFactory.EmailNotification;
import notificationFactory.Notification;

public class EmailNotificationFactory extends NotificationFactory {
	
	@Override
	public Notification createNotification() {
		return new EmailNotification();
	}

}
