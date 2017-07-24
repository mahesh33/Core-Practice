package com.practice.WhileAndDoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class PostTestLoopExampleGuessANumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Random generator = new Random();

		int number = generator.nextInt(10);

		int guess = 0;
		int attempt = 1;

		System.out.println("I'm thinking of a number between 1 and 10. What is it!!??");

		do {
			System.out.println("Attempt " + attempt + " : Your Guess ==>");

			guess = input.nextInt();

			attempt++;
		}

		while (guess != number);
		System.out.println("Finally! You guessed it. It was " + guess);
	}

}
