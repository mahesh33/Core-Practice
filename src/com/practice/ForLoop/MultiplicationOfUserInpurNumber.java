package com.practice.ForLoop;

import java.util.Scanner;

public class MultiplicationOfUserInpurNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int multiplyUpTo = 10;

		System.out.println("Enter the number that you want to multiply");

		int multiplyTo = input.nextInt();

		System.out.println("The result is printed below:::");

		for (int multiplyBy = 1; multiplyBy <= multiplyUpTo; multiplyBy++) {

			int result = multiplyBy * multiplyTo;
   
			 if(multiplyBy >= 10) {
				 System.out.printf("%d * %d =  %d\n", multiplyBy, multiplyTo, result); 
			 }
			 else
			System.out.printf("%d  * %d  = %d\n", multiplyBy, multiplyTo, result);
		}

		input.close();
	}

}
