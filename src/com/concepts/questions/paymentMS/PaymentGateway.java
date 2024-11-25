package com.concepts.questions.paymentMS;

import java.time.LocalDateTime;
import java.util.UUID;

public class PaymentGateway {
	
	public static Transaction createTransaction(double amount, PaymentMethod paymentMethod) {
		
		String transactionId = UUID.randomUUID().toString();
		Transaction transaction = new Transaction(transactionId, amount, paymentMethod, LocalDateTime.now(), false);
		if(transaction.processPayment()) {
			System.out.println("Transaction Successful :: " + transactionId);
		}else {
			System.out.println("Transaction Failed :: " + transactionId);
		}
		
		return transaction;
	}
	
	public static void refundTransaction(Transaction transaction) {
        // Refund the transaction
        transaction.refund();
    }

}
