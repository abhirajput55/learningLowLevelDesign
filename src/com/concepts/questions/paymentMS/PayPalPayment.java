package com.concepts.questions.paymentMS;

public class PayPalPayment extends PaymentMethod {
	
	String paypalId;
	
	public PayPalPayment(String paymentMethodId, String paypalId) {
		super(paymentMethodId);
		this.paypalId = paypalId;
	}

	@Override
	public boolean processPayment(double amount) {
		
		System.out.println("Processing PayPal payment of amount :: " + amount);
		
		return true;
	}

}
