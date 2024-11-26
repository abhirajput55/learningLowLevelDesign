package com.concepts.questions.bookStoreMS;

public interface DiscountStrategy {

	public double applyDiscount(double price, MembershipType membershipType);
}
