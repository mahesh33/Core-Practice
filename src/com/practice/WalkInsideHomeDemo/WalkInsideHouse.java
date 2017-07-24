package com.practice.WalkInsideHomeDemo;

import java.util.Scanner;

public class WalkInsideHouse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		House h = new House();

		Room currentRoom = h.getentryRoom();

		// System.out.println(currentRoom.getname());

		boolean insideHouse = true;
		while (insideHouse) {
			System.out.println("Choose the options below:::::");
			System.out.println();
			System.out.println("   1) Where am I");
			System.out.println("   2) Is there any room on mine left?");
			System.out.println("   3) Is there any room on mine top?");
			System.out.println("   4) Is there any room on mine right?");
			System.out.println("   5) Is there any room on mine bottom?");
			System.out.println("   Press any other key to leave home");

			int userInput = Integer.parseInt(input.nextLine());

			if (userInput == 1) {
				System.out.println("You are in " + currentRoom.getname());
			}

			else if (userInput == 2) {
				if (currentRoom.isThereLeftRoom()) {
					System.out.println("Yes there is " + currentRoom.getleftRoom().getname()
							+ " on your left...Do you want to go inside?");
					System.out.println("Press Y to go inside or press any other key to cancle");
					String goInside = input.nextLine();
					if(goInside.equalsIgnoreCase("y")){
						currentRoom = currentRoom.getleftRoom();
					
					}
				} else {
					System.out.println("No there is not any room on your left.");
				}
			}

			else if (userInput == 3) {
				if (currentRoom.isThereTopRoom()) {
					System.out.println("Yes there is " + currentRoom.gettopRoom().getname()
							+ " on your top...Do you want to go inside?");
					System.out.println("Press Y to go inside or press any other key to cancle");
					String goInside = input.nextLine();
					if(goInside.equalsIgnoreCase("y")){
						currentRoom = currentRoom.gettopRoom();
						System.out.println("Welcome to " +currentRoom.getname() +" and have a good time!!");
					
					}
					
				} else {
					System.out.println("No there is not any room on your top.");
				}
			}

			else if (userInput == 4) {
				if (currentRoom.isThereRightRoom()) {
					System.out.println("Yes there is " + currentRoom.getrightRoom().getname()
							+ " on your right...Do you want to go inside?");
					System.out.println("Press Y to go inside or press any other key to cancle");
					
					String goInside = input.nextLine();
					if(goInside.equalsIgnoreCase("y")){
						currentRoom = currentRoom.getrightRoom();
					
					}
					
				} else {
					System.out.println("No there is not any room on your right.");
				}
			}

			else if (userInput == 5) {
				if (currentRoom.isThereBottomRoom()) {
					System.out.println("Yes there is " + currentRoom.getbottomRoom().getname()
							+ " on your bottom...Do you want to go inside?");
					System.out.println("Press Y to go inside or press any other key to cancle");
					
					String goInside = input.nextLine();
					if(goInside.equalsIgnoreCase("y")){
						currentRoom = currentRoom.getbottomRoom();
					
					}
					
				} else {
					System.out.println("No there is not any room on your bottom.");
				}
			} else {
				if (currentRoom.getname().equals("livingRoom")) {
					System.out.println("Your are out of the house ...successfully!!!!");
					insideHouse = false;
				}

				else {
					System.out.println("You can only go outside the house through livingRoom....so, go to livinRoom");
				}
			}
		}
	}

}
