package com.practice.SwitchStatementAndIfElseLadder;

import java.util.Scanner;

public class DisplayMonthAndDay {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Month [1-12]: ");
		System.out.println("!!!! Remember if you pass more then the value above then won't get expeted output !!!!");
		int month = input.nextInt();

		System.out.println("Enter Day of Month [1-31]: ");
		int day = input.nextInt();

		System.out.printf("That's the %s of %s", getDayName(day), getMonthName(month));

		input.close();
	}

	/**
	 * This method give you the expected month you as per your input
	 * 
	 * @param month
	 *            Gives the month
	 * @return
	 */
	public static String getMonthName(int month) {

		String result = "";

		switch (month) {

		case 1:
			result = "January";
			break;

		case 2:
			result = "February";

		case 3:
			result = "March";
			break;

		case 4:
			result = "April";
			break;

		case 5:
			result = "May";
			break;

		case 6:
			result = "June";
			break;

		case 7:
			result = "July";
			break;

		case 8:
			result = "August";
			break;

		case 9:
			result = "September";
			break;

		case 10:
			result = "October";
			break;

		case 11:
			result = "November";
			break;

		case 12:
			result = "December";
			break;
		}
		return result;
	}

	/**
	 * This method gives the day as per the user input
	 * 
	 * @param day
	 *            Gives the day of the month
	 * @return
	 */
	public static String getDayName(int day) {

		String result = "";

		if (day != 11 && day % 10 == 1) { // ??? how come 20 if 21 is passed
			result = day + "st";
		}

		else if (day != 12 && day % 10 == 2) {
			result = day + "nd";
		}

		else if (day != 13 && day % 10 == 3) {
			result = day + "rd";
		}

		else {
			result = day + "th";
		}

		return result;
	}

}
