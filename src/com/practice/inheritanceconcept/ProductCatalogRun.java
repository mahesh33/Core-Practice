package com.practice.inheritanceconcept;

import java.util.ArrayList;

public class ProductCatalogRun {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<>();

		/*
		 * Books b = new Books("Moby Dick", 19.99, "12345", 1200); Pants pa =
		 * new Pants("Cool Jeans", 59.99, 34, 30); Product p1 = new Product(
		 * "Lead Pencil", 1.99);
		 * 
		 * products.add(b); products.add(pa); products.add(p1);
		 */

		products.add(new Books("Moby Dick", 19.99, "12345", 1200));
		products.add(new Pants("Cool Jeans", 59.99, 34, 30));
		products.add(new Product("Lead Pencil", 1.99));

		System.out.print("NAME" + "        " + "PRICE" + "        " + "TYPE");

		for (Product p : products) {
			System.out.print("\n" + p.getName() + "        " + p.getPrice() + "        " + p.getType());
		}
	}

}
