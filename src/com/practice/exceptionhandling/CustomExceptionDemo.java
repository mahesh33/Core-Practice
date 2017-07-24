package com.practice.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionDemo {

	public static void main(String[] args) throws IntegerOutOfRangeException {

		/*
		 * This example will throw an InputMismatchException when you enter a
		 * non-integer
		 */

		Scanner input = new Scanner(System.in);

		int x = 1;
		int i;

		System.out.println("Enter an integer between 1 and 10");

		do {
		
				i = input.nextInt();
				x = 2;
				// System.out.println("You'v entered: " +i);
				if (i < 0 || i > 10) {
					throw new IntegerOutOfRangeException("hello");
				}
			/* catch (InputMismatchException e) {
				System.out.println("You didn't enter an enteger");
			} catch (IntegerOutOfRangeException e) {
				// System.out.println("Your input value is not in the specified
				// range");
			}*/
		} while (x == 1);

		
		/*
		 * finally{ System.out.println(
		 * "This happens whether the exception occurs or not"); }
		 */
		 

	}

}
