package com.practice.Enumerations;

/*
 * This concept is confusing
 */
public class EnumerationRun {

	public static void main(String[] args) {

		Direction d = Direction.North;
		
//		String direction;
//		direction = "North";
//		direction = "South";
//		direction = "ABCD"; this should not be accepted, but while using string datatype this will be accepted. so we have to use enum.

		Direction dir = Direction.NorthWest;

		d = dir;

		System.out.printf("%s is at %d degrees", d, d.degrees());
		// System.out.println(Direction.East);
	}

}
