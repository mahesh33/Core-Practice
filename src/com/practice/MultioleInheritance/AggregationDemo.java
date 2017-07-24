package com.practice.MultioleInheritance;

public class AggregationDemo {

	String ename;
	int eid;
	int ebonus;
	LetsDo a;
	
	public AggregationDemo(String ename, int eid, int ebonus, LetsDo data) {
		this.ename = ename;
		this.eid = eid;
		this.ebonus = ebonus;
		this.a = data;
		System.out.println(ename);
	}
	void display(){
		System.out.println(ename + eid + ebonus );
	}
	
	
	
}

class LetsDo{
	
	int salary;
	String company;
	
	public LetsDo(int salary, String company) {
		this.salary = salary;
		this.company = company;
		System.out.println(salary);
		System.out.println(company);
	}
	
	
	
	
}
