package com.concepts.questions.notificationMS;

public class PushNotification implements NotificationStrategy {

	@Override
	public void sendNotification(String message, String recipient) {
		
		System.out.println("Sending Push Notification to :: " + recipient);
		
	}

}
