package com.concepts.questions.notificationMS;

import java.util.Arrays;

public class NotificationSystemExample {
	
//	Scenario:
//	Design a notification system where users can receive different types of notifications (e.g., email, SMS, push notifications). The system should support sending notifications in a timely manner and tracking their delivery status.

//	Questions:
//	How would you design the classes for different notification types (e.g., Email, SMS)?
//	What patterns or principles would you use to make this system extensible for new notification types?
//	How would you handle retries if a notification fails?
	
//	Follow-up:
//	How would you implement asynchronous sending of notifications?
	
	
    public static void main(String[] args) {
        // Create some notification preferences
        NotificationPreference emailPref = new NotificationPreference(new NotificationContext(new EmailNotification()), true);
        NotificationPreference smsPref = new NotificationPreference(new NotificationContext(new SMSNotification()), false);
        NotificationPreference pushPref = new NotificationPreference(new NotificationContext(new PushNotification()), true);

        // Create a user with specific notification preferences
        User user = new User("1", "John Doe", Arrays.asList(emailPref, smsPref, pushPref));

        // Create the notification service
        NotificationService notificationService = new NotificationService();

        // Send a notification to the user
        String message = "This is a notification message!";
        notificationService.sendNotifications(user, message);
    }
}

