package com.concepts.questions.bookStoreMS;

public class VIPUser extends User {

	public VIPUser(String userId, String membershipType) {
		super(userId, membershipType);
	}

	@Override
	public double applyDiscount(double price) {
		
		return price * 0.50;
	}

	
}
