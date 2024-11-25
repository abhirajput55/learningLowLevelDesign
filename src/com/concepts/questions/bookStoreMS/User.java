package com.concepts.questions.bookStoreMS;

public abstract class User {

	private String userId;
	private String membershipType;
	
	
	public User(String userId, String membershipType) {
		this.userId = userId;
		this.membershipType = membershipType;
	}
	
	public String getMembershipType() {
		return membershipType;
	}
	
	public abstract double applyDiscount(double price);
}
