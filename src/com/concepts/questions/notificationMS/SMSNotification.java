package com.concepts.questions.notificationMS;

public class SMSNotification implements NotificationStrategy {

	@Override
	public void sendNotification(String message, String recipient) {
		
		System.out.println("Sending SMS Notification to :: " + recipient);
		
	}

}
