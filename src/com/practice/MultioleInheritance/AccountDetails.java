package com.practice.MultioleInheritance;

public class AccountDetails extends SavingAccount {

	int deposits;
	int withdrawals;

	public AccountDetails(String costumerName, int accountNumber, int minimumBalance, int savingBalance, int deposits,
			int withdrawals) {
		super("Arjun", 346758, 1000, 5000);
		this.deposits = deposits;
		this.withdrawals = withdrawals;

	}

	void display() {
		System.out.println("The amount deposited is::: " + deposits+ " and" + "\n"+ "The amount withdrawn is:::" + withdrawals);
	}

}
