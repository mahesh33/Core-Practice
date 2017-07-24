package com.practice.arrylistandcollections;

public class Student {

	private String Name;
	private double GPA;

	public Student(String name, double gPA) {
		super();
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

/*	@Override
	public String toString() {
		return "Student [Name=" + Name + ", GPA=" + GPA + "]";
	}*/

}
