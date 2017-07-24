package com.practice.Enumerations;

public enum Direction {

	North(0), South(180), East(90), West(270), NorthEast(45), SouthEast(135), SouthWest(225), NorthWest(315), Test(89, "TestPrint");

	private final int degrees;
	private final String name;

	Direction(int degrees) {
		System.out.println("Degrees = " + degrees);
		this.degrees = degrees;
		this.name = "";
	}
	
	Direction(int degrees, String name){
		System.out.println("Degrees = " + degrees);
		System.out.println("Name = " + name);
		this.degrees = degrees;
		this.name= name;
	}

	public int degrees() {
		return this.degrees;
	}

	public String getName() {
		return name;
	}
}
