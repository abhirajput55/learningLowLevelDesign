package com.concepts.questions.notificationMS;

import java.util.List;

public class User {

	private String userId;
	
	private String name;
	
	private List<NotificationPreference> notificationPreferences;
	
	public User(String userId, String name, List<NotificationPreference> notificationPreferences) {
		this.userId = userId;
		this.name = name;
		this.notificationPreferences = notificationPreferences;
	}
	
	public List<NotificationPreference> getNotificationPreferences() {
		return notificationPreferences;
	}
	
	public String getName() {
		return name;
	}
}
