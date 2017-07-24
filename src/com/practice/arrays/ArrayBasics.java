package com.practice.arrays;

public class ArrayBasics {
/**
 * Arrays contains a fixed number of variables of the type
 * they are referenced by name and index
 * 
 * Index -->          0     1     2      3
 *                  *----*-----*------*------*
 * Grade --->       | 77 |  84 |   80 |  96  |
 *                  *----*-----*------*------* 
 * Students -->     |Tom | Son |  Joe |  Bod |
 *                  *----*-----*------*------*
 */
	public static void main(String[] args) {

		int[] grades = new int[4];
		/*
		 * Declaring an empty array of size 4 and assigning values.
		 */
		grades[0] = 77;
		grades[1] = 88;
		grades[2] = 98;
		grades[3] = 44;

		// Making the array and assign the values all in one statement.
		String[] students = { "Tom", "Eder", "Joe", "Bob" };
		double sum = 0.0 ;
		double average;

		System.out.println("\n       " + "Students" + "       " + "Grade");
		System.out.println("   --  -----------  ---------");

		for (int i = 0; i < grades.length; i++) {
			System.out.println("    " + i + "  " + students[i] + "             " + grades[i]);
			sum += grades[i];
		}
		average = sum/grades.length;
		System.out.println("* Class Average " +average);
	}

}
