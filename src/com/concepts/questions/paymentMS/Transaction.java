package com.concepts.questions.paymentMS;

import java.time.LocalDateTime;
import java.util.Date;

public class Transaction {
	
	private String transactionId;
	private double amount;
	private PaymentMethod paymentMethod;
	private LocalDateTime transactionDate;
	private boolean isSuccessful;
	
	public Transaction(String transactionId, double amount, PaymentMethod paymentMethod, LocalDateTime transactionDate, boolean isSuccessful) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.transactionDate = transactionDate;
		this.isSuccessful = isSuccessful;
	}
	
	public boolean processPayment() {
		
		isSuccessful = paymentMethod.processPayment(amount);
		
		return isSuccessful;
	}
	
	public void refund() {
		System.out.println("Refunding transaction: " + transactionId);
	}

}
