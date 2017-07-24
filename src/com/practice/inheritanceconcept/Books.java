package com.practice.inheritanceconcept;

public class Books extends Product {

	private String isbn; // International Standard Book Number
	private int pages;

	public Books(String name, double price, String isbn, int pages) {
		super(name, price);
		this.isbn = isbn;
		this.pages = pages;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String getType() {
		return "Books";
	}

}
