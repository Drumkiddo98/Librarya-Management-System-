package com.library;

public class Book {
	String bookName;
	String bookAuthor;
	String bookPrice;
	static int inc=1;
	int bookId;
	boolean availability=true;

	
	public Book(String bookName, String bookAuthor, String bookPrice, boolean availability) {
		bookId=inc++;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		
		this.availability = availability;
	}
	
	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	
}
