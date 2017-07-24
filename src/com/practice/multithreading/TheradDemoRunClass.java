package com.practice.multithreading;

public class TheradDemoRunClass {

	public static void main(String[] args) {

		Thread t1 = new Thread(new ThreadDemoClass("One"));
		Thread t2 = new Thread(new ThreadDemoClass("Two"));
		Thread t3 = new Thread(new ThreadDemoClass("Three"));

		t1.start();
		t2.start();
		t3.start();
	}

}
