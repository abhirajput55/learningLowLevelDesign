package com.concepts.questions.bookStoreMS;

public class PremiumUser extends User {

	public PremiumUser(String userId, String membershipType) {
		super(userId, membershipType);
	}

	@Override
	public double applyDiscount(double price) {
		
		return price * 0.25;
	}

}
