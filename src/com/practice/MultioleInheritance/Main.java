package com.practice.MultioleInheritance;

public class Main {

	public static void main(String[] args) {

		/*AccountDetails acc = new AccountDetails("mahesh", 2345, 1000, 1500, 500, 1000);

		acc.display();*/

//	Account ac = new SavingAccount("anup", 46474, 800, 200);

		Account ac1 = new AccountDetails("Hari", 8989, 4000, 2000, 2000, 500);
	
//		SavingAccount acp;
//		acp = (SavingAccount) ac;
//		
//		acp.display();
		
	AccountDetails ad;
	ad = (AccountDetails) ac1;
	
	ad.display();
		
		
		
		
//		LetsDo ld = new LetsDo(222, "rrr");

/*		 AggregationDemo abc = new AggregationDemo("hhhh", 123, 900, new
		 LetsDo(100,"fff"));
		 
		// abc.display();
*/	}

}
