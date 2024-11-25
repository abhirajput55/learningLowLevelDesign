package com.concepts.questions.bookStoreMS;

public class Book {
	
	private String title;
	private String author;
	private double price;
	private String category;
	private int stock;
	
	public Book(String title, String author, double price, String category, int stock) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
		this.stock = stock;
	}
	
	public int getStock() {
		return stock;
	}

}
