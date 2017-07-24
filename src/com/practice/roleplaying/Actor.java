/*
 * A character can be a player or a monster
 */
package com.practice.roleplaying;

/**
 * A player or character in the role-playing universe
 * 
 * @author mahes
 *
 */
public class Actor {

	private String _name;
	private int _health;
	private int _armorClass;
	private Weapon _weapon;

	/**
	 * Create a new Actor (player or monster) lets try
	 * 
	 * @param name
	 *            name of character ex. "Goblin", "Conan the Barbarian",
	 *            "Grumpy Troll"
	 * @param health
	 *            number of health points ex. 5
	 * @param armorClass
	 *            armor class ex. 4
	 * @param weapon
	 *            weapon the character uses
	 */

	public Actor(String name, int health, int armorClass, Weapon weapon) {
		this._name = name;
		this._health = health;
		this._armorClass = armorClass;
		this._weapon = weapon;
	}

	/**
	 * Get the character name
	 * 
	 * @return
	 */

	public String name() {
		return _name;
	}

	/**
	 * Get the current health status
	 * 
	 * @return
	 */
	public int health() {
		return _health;
	}

	/**
	 * Get the current armor class
	 * 
	 * @return
	 */

	public int armorClass() {
		return _armorClass;
	}

	/**
	 * Get the current weapon
	 * 
	 * @return
	 */
	public Weapon weapon() {
		return this._weapon;
	}

	/**
	 * Detects if the character is dead (health <=0)
	 * 
	 * @return
	 */
	public boolean isDead() {
		return (this._health <= 0);
	}

	/**
	 * Applies damage to the character
	 * 
	 * @param amount
	 *            the amount of damage to apply
	 * @return
	 */
	public int takeDamage(int amount) {
		this._health = this._health - amount;
		return this._health;
	}
}
