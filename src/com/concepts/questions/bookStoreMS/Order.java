package com.concepts.questions.bookStoreMS;

import java.time.LocalDateTime;

public class Order {

	
	private User user;
	private Cart cart;
	private LocalDateTime orderDate;
	private boolean isCompleted;
	private double totalAmount;
	private double totalAmountAfterDisc;
	
	public Order(User user, Cart cart) {
		this.user = user;
		this.cart = cart;
	}
	
	public Order(User user, Cart cart, LocalDateTime orderDate, boolean isCompleted, double totalAmount, double totalAmountAfterDisc) {
		this.user = user;
		this.cart = cart;
		this.orderDate = orderDate;
		this.isCompleted = isCompleted;
		this.totalAmount = totalAmount;
		this.totalAmountAfterDisc = totalAmountAfterDisc;
	}
	
	public Order placeOrder() {
		double sum = cart.calculateAmount(user);
		return new Order (user, cart, LocalDateTime.now(), true, sum, user.applyDiscount(sum));
	}
	
}
