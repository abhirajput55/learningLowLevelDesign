package com.concepts.questions.bookStoreMS;

public enum MembershipType {

	BASIC(0.0), PREMIUM(0.25), VIP(0.50);
	
	private double discount;
	
	MembershipType(double discount) {
		this.discount = discount;
	}
	
	public double getDiscount() {
		return discount;
	}
}
