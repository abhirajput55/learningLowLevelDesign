package com.concepts.questions.bookStoreMS;

import java.util.List;

public class BookStore {

	private List<Book> books;
	private DiscountStrategy discountStrategy;
	
	public void addBookToStore(Book book) {
		books.add(book);
	}
	
	public void browseBooks(){
		
		books.stream().forEach(e -> {
			System.out.println(e);
		});
		
	}
	
	public Order purchaseBook(User user, Cart cart) {
		Order order = new Order(user, cart);
		return order.placeOrder();
	}
}
