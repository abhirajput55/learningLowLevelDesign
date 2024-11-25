package com.concepts.questions.bookStoreMS;

public class BasicUser extends User {

	public BasicUser(String userId, String membershipType) {
		super(userId, membershipType);
	}

	@Override
	public double applyDiscount(double price) {
		
		return price;
	}
}
