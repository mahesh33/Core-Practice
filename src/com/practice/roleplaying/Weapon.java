/*
 * The vehicle by which a character attacks
 */
package com.practice.roleplaying;

/**
 * Vehicle used by the character or actor
 * 
 * @author mahes
 *
 */
public class Weapon {

	private String _name; // Short sword
	private String _action; // Slashes
	private int _maxDamage; // 6
	private int _criticalHit; // 19
	private Die _die;

	/**
	 * Creates a new weapon
	 * 
	 * @param name
	 *            name of the weapon ex. "Machine Gun", "Broad Sword", "Arm"
	 * @param action
	 *            the verb which describes the weapon ex. "shoots", "slashes",
	 *            "Claws"
	 * @param maxDamage
	 *            the maximum amount of damage the weapon does ex. 9, 7
	 */
	public Weapon(String name, String action, int maxDamage) {
		this._name = name;
		this._action = action;
		this._maxDamage = maxDamage;
		this._die = new Die(_maxDamage); // ??????
	}

	/**
	 * Get the name of the weapon ex. "Short Sword"
	 * 
	 * @return name of weapon
	 */
	public String name() {
		return _name;
	}

	/**
	 * Get the action of the weapon ex. "Slashes"
	 * 
	 * @return
	 */
	public String action() {
		return _action;
	}

	/**
	 * Get the maximum amount of damage the weapon can do
	 * 
	 * @return
	 */
	public int maxDamage() {
		return _maxDamage;
	}

	public int hitDamage() {
		return _die.roll();
	}

}
