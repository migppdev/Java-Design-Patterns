package notificationFactory.factory;

import notificationFactory.Notification;

public abstract class NotificationFactory {
	
	public abstract Notification createNotification();
	
	public void sendMessage(String message) {
		this.createNotification().send(message);
	}
	
}
