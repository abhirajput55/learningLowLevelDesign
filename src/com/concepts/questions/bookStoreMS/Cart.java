package com.concepts.questions.bookStoreMS;

import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Cart {

	private Map<Book, Integer> cartItems;
	
	public Cart() {
		cartItems = new HashMap<Book, Integer>();
	}
	
	public void addBook(Book book, int quantity) {
		
		cartItems.put(book, cartItems.getOrDefault(book, 0) + quantity);
	}
	
	public void removeBook(Book book) {
		cartItems.remove(book);
	}
	
	public void updateQuantity(Book book, int quantity) {
		if(cartItems.containsKey(book)) {
			cartItems.put(book, quantity);
		}
	}
	
	public double calculateAmount(User user) {

		double sum = cartItems.entrySet().stream()
				.collect(Collectors.summarizingDouble(a -> a.getKey().getPrice() * a.getValue())).getSum();

		return sum;
	}
	
}
