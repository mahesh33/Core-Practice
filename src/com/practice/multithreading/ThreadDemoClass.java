package com.practice.multithreading;

import java.util.Random;

//Runnable interface contains run() method
public class ThreadDemoClass implements Runnable {

	String name;
	int time;
	Random generator = new Random();

	public ThreadDemoClass(String name) {

		this.name = name;
		time = generator.nextInt(999); // between 0-1
	}

	// This runs when you start thread

	public void run() {

		try {
			System.out.println(name + " is sleeping " + "for " + time);
			Thread.sleep(time);
			System.out.println(name + " is done!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
