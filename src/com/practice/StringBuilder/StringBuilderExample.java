package com.practice.StringBuilder;

public class StringBuilderExample {

	public static void main(String[] args) {

		String forward = "This is a test";

		StringBuilder sb = new StringBuilder();
		sb.append(forward);

		// StringBuilder reversesb = sb.reverse();
		//
		// String a = sb.toString();

		String reverse = sb.reverse().toString();

		System.out.println(forward);

		// System.out.println(a);

		System.out.println(reverse);
	}

}
