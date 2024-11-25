package com.concepts.questions.notificationMS;

public class NotificationPreference {

	private NotificationContext notificationContext;
	
	private boolean isEnabled;
	
	public NotificationPreference(NotificationContext notificationContext, boolean isEnabled) {
		this.notificationContext = notificationContext;
		this.isEnabled = isEnabled;
	}
	
	public NotificationContext getNotificationContext() {
		return notificationContext;
	}
	
	public boolean isEnabled() {
		return isEnabled;
	}
}
