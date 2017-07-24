package com.practice.MethodsConcept;

import java.util.Scanner;

public class MethodBasics {

	public static void main(String[] args) {

		int length, width;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the length of the rectangle:");
		length = input.nextInt();

		System.out.println("Enter the width of the rectangel");
		width = input.nextInt();

		// System.out.println(MethodBasics.rectangleArea(length, width));
		// System.out.println(MethodBasics.rectanglePerimeter(length, width));

		int area = rectangleArea(length, width);
		int perimeter = rectanglePerimeter(length, width);

		System.out.printf("The area of rectangle is: %d; and perimeter is: %d", area, perimeter);
	}

	public static int rectangleArea(int someLength, int someWidth) {
		return someLength * someWidth;
	}

	public static int rectanglePerimeter(int l, int w) {
		return 2 * (l + w);
	}
}
