package com.concepts.questions.bookStoreMS;

public abstract class User {

	private String userId;
	private MembershipType membershipType;
	
	
	public User(String userId, MembershipType membershipType) {
		this.userId = userId;
		this.membershipType = membershipType;
	}
	
	public MembershipType getMembershipType() {
		return membershipType;
	}
	
	public abstract double applyDiscount(double price);
}
