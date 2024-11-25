package com.concepts.questions.paymentMS;

public class PaymentSystemExample {
	
	
//	Scenario:
//	You need to design an online payment system that supports multiple payment methods, such as credit cards, debit cards, and PayPal. The system should handle transactions, refunds, and generate receipts.

//	Questions:

//	What are the main entities in the system?
//	How would you handle different payment methods?
//	How would you implement transaction processing and refunds?
//	Follow-up:

//	How would you ensure the system is secure and prevents fraud?
	
    public static void main(String[] args) {
        // Create payment methods
        PaymentMethod creditCard = new CreditCardPayment("creditCard", "1234567890123456", "12/23", "123");
        PaymentMethod paypal = new PayPalPayment("paypal", "user123@paypal.com");

        // Create and process a credit card payment
        Transaction transaction1 = PaymentGateway.createTransaction(150.00, creditCard);

        // Create and process a PayPal payment
        Transaction transaction2 = PaymentGateway.createTransaction(250.00, paypal);

        // Refund the first transaction
        PaymentGateway.refundTransaction(transaction1);
    }
}

