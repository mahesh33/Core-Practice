package com.practice.MultioleInheritance;

public class Account {

	String costumerName;
	int accountNumber;

	public Account(String costumerName, int accountNumber) {
		//super();
		this.costumerName = costumerName;
		this.accountNumber = accountNumber;

	}

	void display() {
		System.out.println("The name of costumer is: " + costumerName + " and account number is: " + accountNumber);
	}
	
	void show(){
		System.out.println("Let's check");
	}

}
