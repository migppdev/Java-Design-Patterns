package notificationFactory.factory;

import notificationFactory.Notification;
import notificationFactory.PushNotification;

public class PushNotificationFactory extends NotificationFactory {
	
	@Override
	public Notification createNotification() {
		return new PushNotification();
	}
}
