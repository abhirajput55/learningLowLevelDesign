package com.concepts.questions.notificationMS;

public class EmailNotification implements NotificationStrategy {

	@Override
	public void sendNotification(String message, String recipient) {
		
		System.out.println("Sending Email Notification to :: " + recipient);
		
	}

}
