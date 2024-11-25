package com.concepts.questions.notificationMS;

public class NotificationContext {
	
	private NotificationStrategy notificationStrategy;
	
	public NotificationContext(NotificationStrategy notificationStrategy) {
		this.notificationStrategy = notificationStrategy;
	}
	
	public void sendNotification(String message, String recipient) {
		notificationStrategy.sendNotification(message, recipient);
	}

}
