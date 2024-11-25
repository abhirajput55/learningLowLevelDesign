package com.concepts.questions.paymentMS;

public class CreditCardPayment extends PaymentMethod {
	
	private String cardNo;
	private String expiryDate;
	private String cvv;
	
	public CreditCardPayment(String paymentMethodId, String cardNo, String expiryDate, String cvv) {
		super(paymentMethodId);
		this.cardNo = cardNo;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}

	@Override
	public boolean processPayment(double amount) {
		
		System.out.println("Processing Credit Card payment of amount :: " + amount);
		
		return true;
	}

}
