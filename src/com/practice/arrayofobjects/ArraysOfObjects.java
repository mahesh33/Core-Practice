package com.practice.arrayofobjects;

import java.util.Scanner;

public class ArraysOfObjects {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		/*
		 * A bank of 5 students name grads
		 * Student [] grads = new Student[5];
		 * then assign
		 * grads[0] = new Student("Larry", 99);
		 * or explicitly define it.
		 * Student [] students = { new Student("Tom",77), new Students("Ed", 84),
		 *  new Student("Joe",80), new Student("Bob",96) };
		 */
		String name;
		int grade;
		Student[] students = new Student[4];

		for (int i = 0; i < students.length; i++) {

			System.out.printf("Enter GRADE for student ==> ", i);

			grade = input.nextInt();

			System.out.printf("Enter NAME for student ==> ", i);
			
			name = input.nextLine();

			students[i] = new Student(name, grade);

		}

		System.out.printf("\n       " + "Students" + "       " + "Grade");

		System.out.printf("\n   --  -----------  ---------" + "\n");

		for (int i = 0; i < students.length; i++) {

			System.out.println("    " + i + "  " + students[i].getName() + "             " +  students[i].getGrade());;

		}

	}
}
