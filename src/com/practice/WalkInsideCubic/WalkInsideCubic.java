package com.practice.WalkInsideCubic;

import java.util.Scanner;

public class WalkInsideCubic {

	public static void main(String[] args) throws InvalidInput {

		Scanner input = new Scanner(System.in);

		Cubic cubicObj = new Cubic();

		Room currentRoom = cubicObj.getentryRoom();

		/*
		 * System.out.println(currentRoom.getName());
		 * System.out.println(currentRoom.getRightRoom().getName());
		 */

		boolean insideCubic = true;
		while (insideCubic) {
			System.out.println("\n      !!!!!!!!!!! Choose your options from below !!!!!!!!!!!");
			System.out.println();
			System.out.println("   1) Where am I");
			System.out.println("   2) Is there any room on mine left?");
			System.out.println("   3) Is there any room on mine top?");
			System.out.println("   4) Is there any room on mine right?");
			System.out.println("   5) Is there any room on mine bottom?");
			System.out.println("  [*] Press any other key to leave home");

			// int userInput = Integer.parseInt(input.nextLine());
			int userChoice;
			try {
				userChoice = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				userChoice = 7;
			}

			if (userChoice == 1) {
				System.out.println(currentRoom.getName());
			}

			else if (userChoice == 2) {
				if (currentRoom.isThereLeftRoom()) {
					System.out.println("Yes there is " + currentRoom.getLeftRoom().getName() + " on your left..."
							+ " Do you want to inside?");
					System.out.println("Press YES to go inside or press any other key.");
					String userDecision = input.nextLine();

					if (userDecision.equalsIgnoreCase("Yes")) {
						currentRoom = currentRoom.getLeftRoom();
						System.out.println("Welcome to " + currentRoom.getName() + " and have a good time!!");
					}

				} else {
					System.out.println("Sorry!! there is not any room on your left.");
				}
			}

			else if (userChoice == 3) {
				if (currentRoom.isThereRightRoom()) {
					System.out.println("Yes there is " + currentRoom.getRightRoom().getName() + " on your right..."
							+ " Do you want to inside?");
					System.out.println("Press YES to go inside or press any other key.");
					String userDecision = input.nextLine();

					if (userDecision.equalsIgnoreCase("Yes")) {
						currentRoom = currentRoom.getRightRoom();
						System.out.println("Welcome to " + currentRoom.getName() + " and have a good time!!");
					}
				} else {
					System.out.println("Sorry!! there is not any room on your right.");
				}
			}

			else if (userChoice == 4) {
				if (currentRoom.isThereTopRoom()) {
					System.out.println("Yes there is " + currentRoom.getTopRoom().getName() + " on your top..."
							+ " Do you want to inside?");
					System.out.println("Press YES to go inside or press any other key.");
					String userDecision = input.nextLine();

					if (userDecision.equalsIgnoreCase("Yes")) {
						currentRoom = currentRoom.getTopRoom();
						System.out.println("Welcome to " + currentRoom.getName() + " and have a good time!!");
					}
				} else {
					System.out.println("Sorry!! there is not any room on your top.");
				}
			}

			else if (userChoice == 5) {
				if (currentRoom.isThereBottomRoom()) {
					System.out.println("Yes there is " + currentRoom.getBottomRoom().getName() + " on your bottom..."
							+ " Do you want to inside?");
					System.out.println("Press YES to go inside or press any other key.");
					String userDecision = input.nextLine();

					if (userDecision.equalsIgnoreCase("Yes")) {
						currentRoom = currentRoom.getBottomRoom();
						System.out.println("Welcome to " + currentRoom.getName() + " and have a good time!!");
					}
				} else {
					System.out.println("Sorry!! there is not any room on your bottom.");
				}
			}

			else {
				if (currentRoom.getName().equals("officeRoom")) {
					System.out.println("You are out of Cubic successfully!!!!!!");
					insideCubic = false;
				} else {
					System.out.println("You can only go outside Cubic through officeRoom....so, go to officeRoom");
				}
			}
		}

	}
}
