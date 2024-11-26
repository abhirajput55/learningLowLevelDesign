package com.concepts.questions.bookStoreMS;

public class DiscountStrategyImpl implements DiscountStrategy {

	@Override
	public double applyDiscount(double price, MembershipType membershipType) {
		
		return price * membershipType.getDiscount();
	}

}
