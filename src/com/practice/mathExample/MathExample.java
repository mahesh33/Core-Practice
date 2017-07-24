package com.practice.mathExample;

import java.util.Scanner;

public class MathExample {

	public static void main(String[] args) {
		// Circumference and area of a circle
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the circle radius:");

		double radius = input.nextDouble();

		// Circumference = 2 * PI * radius
		double circumference = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;

		System.out.printf("Circumference of circle is: %f; Area of circle is: %f\n", circumference, area);
	}

}
