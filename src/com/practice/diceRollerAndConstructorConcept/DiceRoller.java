package com.practice.diceRollerAndConstructorConcept;

import java.util.Random;

/*
 * 1. State: Number of Sides
 *           Current value
 * 2. Behavior: Roll          
 */
public class DiceRoller {

	public static void main(String[] args) {

		Die d12 = new Die(12,200); // 12-sides die
		Die d6 = new Die(6); // 6-sides die
		Die skullcrusher = new Die(20,200);

		System.out.printf("Rolling %d sided die: %d\n", d6.getsides(), d6.roll());
		System.out.printf("Rolling %d sided die: %d\n", d12.getsides(), d12.roll());
		System.out.printf("Rolling %d sided die: %d\n", skullcrusher.getsides(), skullcrusher.roll());

		System.out.println(d6.getvalue());
		/*
		 * System.out.println(d6.roll()); d6.setsides(20);
		 * System.out.println(d6.roll());
		 */

		/*
		 * Random generator = new Random(); generator.setSeed(200000);
		 * 
		 * int i = generator.nextInt(6); System.out.println(i);
		 * 
		 * i = generator.nextInt(6); System.out.println(i);
		 * 
		 * i = generator.nextInt(6); System.out.println(i);
		 */
	}

}
