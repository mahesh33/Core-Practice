package com.practice.arraylistandcollectionsremoveandswap;

import java.util.ArrayList;

public class StudentDetailsRemoveAndSwap {

	public static void main(String[] args) {

		// ArrayList are dynamic collections of objects (reference types only)
		ArrayList<Student> stud = new ArrayList<>();

		// Let's add some students
		stud.add(new Student("Bob", 2.9));
		stud.add(new Student("Dave", 3.2));
		stud.add(new Student("Sally", 4.0));

		// Let's print Student details
		printStudents(stud);

		// Let's remove a student from position 0
		Student tmp = stud.remove(0);

		// Let's print it again
		printStudents(stud);

		// Let's add the same student again
		stud.add(tmp);

		/*
		 * Now, let's see it again The student which was at index 0 i.e(tmp)
		 * previously going to be add at the last index now.
		 */
		printStudents(stud);

		/*
		 * We can add to collection at any time Let's add a new student at the
		 * end
		 */
		stud.add(new Student("Bill", 3.7));

		// Let's see the output
		printStudents(stud);

		// ** Finally, let's Swap Sally(i) and Bob(2)
		// Place Sally in tmp
		tmp = stud.get(1);

		// Put Bob in Sally's position
		stud.set(1, stud.get(2));
		printStudents(stud);

		// Put tmp(Sally) in Bob's position
		stud.set(2, tmp);
		printStudents(stud);
	}

	private static void printStudents(ArrayList<Student> stud) {

		System.out.print("Student \t GPA \n--------------------- \n");

		for (int i = 0; i < stud.size(); i++) {
			System.out.println(stud.get(i).getName() + "\t\t " + stud.get(i).getGPA());
		}
		System.out.println();
	}

}
