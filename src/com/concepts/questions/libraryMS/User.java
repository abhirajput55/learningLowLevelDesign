package com.concepts.questions.libraryMS;

import java.util.List;

public class User {

	private int userId;
	private String email;
	private List<Book> borrowedBooks;
	
	public void borrowBook(Book book) {
		borrowedBooks.add(book);
		book.setAvailable(false);
	}
	
	public void returnBook(Book book) {
		borrowedBooks.remove(book);
		book.setAvailable(true);
	}
	
	public List<Book> borrowedBooks(){
		return borrowedBooks;
	}
}
