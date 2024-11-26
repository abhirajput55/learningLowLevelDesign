package com.concepts.questions.bookStoreMS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnlineBookStoreExample {
	
	public static void main(String[] args) {
		
		Book book1 = new Book("Book1", "Author1", 648, BookCategory.CATEGORY1, 4);
		Book book2 = new Book("Book2", "Author2", 679, BookCategory.CATEGORY1, 7);
		Book book3 = new Book("Book3", "Author3", 327, BookCategory.CATEGORY2, 3);
		Book book4 = new Book("Book4", "Author4", 876, BookCategory.CATEGORY3, 2);
		
		List<Book> list = new ArrayList<Book>(Arrays.asList(book1, book2, book3, book4));
		
		Cart cart = new Cart();
		cart.addBook(book1, 2);
		cart.addBook(book2, 4);
		cart.addBook(book4, 2);
		
	}

}
