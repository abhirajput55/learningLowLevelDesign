package com.concepts.questions.paymentMS;

public abstract class PaymentMethod {
	
	private String paymentMethodId;
	
	public PaymentMethod(String paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}
	
	public abstract boolean processPayment(double amount);

}
