/*
 * Dice roller class. Every role hack needs one
 */
package com.practice.roleplaying;

import java.util.Random;

/**
 * Simulates dice rolls. Every role playing game needs this.
 * 
 * @author mahes
 *
 */

public final class Die {

	private int _sides;
	private int _value;
	private Random _generator;

	/**
	 * Creates a new die
	 * 
	 * @param sides
	 *            number of sides on the die
	 */

	public Die(int sides) {
		this._sides = sides;
		this._generator = new Random(); // ??????
		this.roll(); // roll it so it gets a value ??????????
	}

	/**
	 * Creates a new die with specific random number seed (makes it easier to
	 * test)
	 * 
	 * @param sides
	 *            number of sides on the die
	 * @param seed
	 *            specify random number seed
	 */
	public Die(int sides, int seed) {
		this._sides = sides;
		this._generator = new Random(seed); // ???????
		this.roll(); // ???????
	}

	/**
	 * Get the number of sides on the die
	 * 
	 * @return number of sides as int
	 */
	public int getSides() { // ?????
		return _sides;
	}

	/**
	 * Change the number of sides on the die
	 * 
	 * @param sides
	 *            number of sides to change to
	 * @return new number of sides
	 */
	

	/**
	 * Roll the die
	 * 
	 * @return return the rolled value
	 */
	public int roll() {
		_value = _generator.nextInt(_sides) + 1;
		return _value;
	}

	/**
	 * Inspect the current value of the rolled die (without a re-roll)
	 * 
	 * @return the current face value of the die
	 */
	public int getValue() {
		return _value;
	}
}
