package com.practice.diceRollerAndConstructorConcept;

import java.util.Random;

/*
 * 1. roll()--> It going to roll the die
 * 2. getSides()--> Number of side in the die(eg:6/12)
 * 3. getValue()--> To get the value of the side
 * 4. setSides(int sides)--> To set the sides
 */
public class Die {
	/*
	 * The variables are marked private so that a user of this class cannot
	 * access these values directly.
	 */
	private int sides; // -->Stores the number of sides on the die i.e 6
	private int value; // -->Stores the current value of the die
	private Random generator;

	/*
	 * Constructor: A special method called when an object of the class is
	 * created.
	 */

	public Die(int sides) {
		this.sides = sides;
		generator = new Random();
		this.value = this.roll(); 

	}
	/**
	 * heloo
	 * @param sides heloo
	 * @param seed
	 */
	public Die(int sides, int seed) {
		this.sides = sides;
		this.generator = new Random(seed);
	}

	public int roll() {
		/*
		 * If we use +1 then it'll give value between 1-6 otherwise it'll give
		 * values between 0-5
		 */
		this.value = this.generator.nextInt(sides) + 1;
		return this.value;
	}

	public int getvalue() {
		return this.value;
	}
	
	public int getsides(){
		return this.sides;
	}
	
	public void setsides(int sides){
		this.sides = sides;
	}
}
