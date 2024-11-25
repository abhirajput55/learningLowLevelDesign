package com.concepts.questions.notificationMS;

public class NotificationService {
	
	public void sendNotifications(User user, String message) {
		
		for(NotificationPreference np : user.getNotificationPreferences()) {
			if(np.isEnabled()) {
				NotificationContext notificationContext = np.getNotificationContext();
				notificationContext.sendNotification(message, user.getName());
			}
		}
	}

}
