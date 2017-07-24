package com.practice.MultioleInheritance;

public class SavingAccount extends Account {

	int minimumBalance;
	int savingBalance;

	public SavingAccount(String costumerName, int accountNumber, int minimumBalance, int savingBalance) {
		super("Arjun", 346758);
		this.minimumBalance = minimumBalance;
		this.savingBalance = savingBalance;
	}

	void display() {
		System.out.println(
				"The miminum balance available is::: " + minimumBalance + " and saving balance is::: " + savingBalance);
	}

}
