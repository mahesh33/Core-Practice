package com.practice.WhileAndDoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class MidTestLoopExampleGuessANumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Random generator = new Random();

		int number = generator.nextInt(10) + 1;

		int guess = 0;
		int attempt = 1;

		System.out.println("I'm thinking of a number between 1 and 10. What is it!!??");

		while (true) {
			System.out.println("Attempt " + attempt + " : Your Guess ==>");

			guess = input.nextInt();

			attempt++;

			if (guess > 10 || guess < 1) {
				System.out.println("Come on! That's not between 1 and 10!");
			}

			else if (guess != number) {
				System.out.println("Nope. That's not it!");
			}

			else {
				System.out.println("Finally! You guessed it. It was " + guess);
				break;
			}
		}
	}

}
