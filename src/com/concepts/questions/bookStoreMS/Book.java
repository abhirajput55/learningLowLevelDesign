package com.concepts.questions.bookStoreMS;

public class Book {
	
	private String title;
	private String author;
	private double price;
	private BookCategory category;
	private int stock;
	
	public Book(String title, String author, double price, BookCategory category, int stock) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
		this.stock = stock;
	}
	
	public int getStock() {
		return stock;
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", category=" + category
				+ ", stock=" + stock + "]";
	}

}
