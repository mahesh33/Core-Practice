package com.practice.arraylistandcollectionsremoveandswap;

/**
 * Student Class. used in the StudentDetailsRemoveAndSwap
 * 
 * @author mahes
 *
 */
public class Student {

	private String Name;
	private double GPA;

	public Student(String name, double gPA) {
		Name = name;
		GPA = gPA;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
	

}
