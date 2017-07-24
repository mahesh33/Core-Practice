package com.practice.inheritanceconcept;

public class Pants extends Product {

	/*
	 * Kammar: the part of the human body below the ribs and above the hips.
	 */
	private int waist;
	/*
	 * the seam in a pair of pants from the crotch to the bottom of the leg, or
	 * the length of this.
	 */
	private int inseam;

	public Pants(String name, double price, int waist, int inseam) {
		super(name, price);
		this.waist = waist;
		this.inseam = inseam;
	}

	public int getWaist() {
		return waist;
	}

	public void setWaist(int waist) {
		this.waist = waist;
	}

	public int getInseam() {
		return inseam;
	}

	public void setInseam(int inseam) {
		this.inseam = inseam;
	}

	@Override
	public String getType() {
		return "Pants";
	}

}
