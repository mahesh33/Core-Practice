package com.practice.dungeonhackrun;

import com.practice.diceRollerAndConstructorConcept.Die;
import com.practice.roleplaying.Actor;
import com.practice.roleplaying.Weapon;

public class DungeonHackRun {

	/**
	 * The beginnings of a super cool dungeon hack simulator
	 * 
	 * @param args
	 *            pre-defined arguments
	 */

	/*
	 * Roll 20 sided Die If(roll >= monster armor class) inflict damage on
	 * monster check if monster dead Else you miss
	 */
	public static void main(String[] args) {

		Weapon sword = new Weapon("Broad Sword", "slashes", 10);
		Weapon claw = new Weapon("Arm", "claws", 6);

		Actor player = new Actor("Conan the Barbarian", 5, 10, sword);
		Actor monster = new Actor("Grumpy Troll", 5, 6, claw);
		

		Die d20 = new Die(20);

		int roll = d20.roll();
		// Conan the Barbarian slashes his Board Sword at the Grumpy Troll
		// and...
		System.out.printf("%s %s his %s at the %s and ", player.name(), player.weapon().action(),
				player.weapon().name(), monster.name());

		if (roll >= monster.armorClass()) {
			// hit
			int damage = player.weapon().hitDamage();
			monster.takeDamage(damage);
			System.out.printf("hits for %d damage", damage);

			if (monster.isDead()) {
				System.out.printf(", killing it");
			}
			// ToDo
		} else {
			// miss
			System.out.printf("mises");
		}

		System.out.println("!!!");

	}

}
