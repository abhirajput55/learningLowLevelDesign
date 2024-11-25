package com.concepts.questions.libraryMS;

import java.util.List;
import java.util.stream.Collectors;

public class Library {

	private List<Book> books;
	private List<User> users;
	
	
	public boolean borrowBook(Book book, User user) {
		if(book.isAvailable()) {
			user.borrowBook(book);
			return true;
		}
		return false;
	}
	
	public void returnBook(Book book, User user) {
		user.returnBook(book);
	}
	
	public Book searchBookByTitle(String title) {
		return books.stream().filter(b -> b.getBookName().equalsIgnoreCase(title)).findFirst().orElse(null);
	}
	
	public Book searchBookByISBN(int isbn) {
		return books.stream().filter(b -> b.getIsbn() == isbn).findFirst().orElse(null);
	}
	
	public List<Book> searchBookByAuthor(String author) {
		return books.stream().filter(b -> b.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
	}
}
