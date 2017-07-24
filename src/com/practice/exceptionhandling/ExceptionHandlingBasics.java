package com.practice.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingBasics {

	public static void main(String[] args) {

		/*
		 * This example will throw an InputMismatchException when you enter a
		 * non-integer
		 */

		Scanner input = new Scanner(System.in);

		int i;

		System.out.println("Enter an integer:");

		try {
			i = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("You didn't enter an enteger");
		}

		finally {
			System.out.println("This happens whether the exception occurs or not");
		}

	}

}
