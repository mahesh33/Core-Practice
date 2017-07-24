package com.practice.arrylistandcollections;

import java.util.ArrayList;

public class ArrayListBasics {

	public static void main(String[] args) {

		ArrayList<Integer> grades = new ArrayList<>();

		grades.add(90);
		grades.add(85);
		grades.add(70);

		for (int i = 0; i < grades.size(); i++) {
			// gradeds[i] == grades.get(i)
			System.out.println("Grade: " + i + " = " + grades.get(i));
		}
		
		System.out.println();
		
		grades.remove(1);
		System.out.println("After removing element at index 1");
		for(Integer i : grades){
			System.out.println(i);
		}
		
	}

}
