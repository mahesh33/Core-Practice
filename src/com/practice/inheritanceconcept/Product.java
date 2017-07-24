package com.practice.inheritanceconcept;
/**
 * 
 * @author Mahesh
 *
 */
public class Product {

	private String name;
	private double price;

	/**
	 * 
	 * @param name pass the product name
	 * @param price pass the product price
	 */
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return "Product";
	}
}
