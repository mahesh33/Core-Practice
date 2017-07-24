package com.practice.arrylistandcollections;

import java.util.ArrayList;

/**
 * This Student Class is used in ArrayListStudentDetails
 * 
 * @author mahes
 *
 */
public class ArrayListStudentDetails {

	public static void main(String[] args) {

		/*
		 * ArrayList are dynamic collections of objects (reference types only)
		 * 
		 * Let's create an arraylist of type Student
		 */
		ArrayList<Student> stud = new ArrayList<>();

		// Let's add some elements or students in ArrayList: stud
		stud.add(new Student("Bob", 2.9));
		stud.add(new Student("Dave", 3.2));
		stud.add(new Student("Sally", 4.0));
		stud.add(new Student("Alice", 3.15));

		// Let's access as a collection
		System.out.print("Student \t GPA \n--------------------- \n");

		for (Student s : stud) {
			System.out.println(s.getName() + "\t\t " + s.getGPA());
		}
		
/*	
 * 		for(int i=0; i<stud.size(); i++){
			System.out.println(stud.get(i));
		}
*/

		/* # It can be used to print the students with the help of 
		 * toString() method mentioned in the student class.
		 * for (Student s : stud) { System.out.println(s); }
		 */

	}

}
