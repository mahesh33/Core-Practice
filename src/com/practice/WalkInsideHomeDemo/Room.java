package com.practice.WalkInsideHomeDemo;

/*
 * This class is a blueprint for Rooms that i'm going to built in other class name House.
 */
public class Room {

	private String name; // To get name of room

	private Room leftRoom;
	private Room topRoom;
	private Room rightRoom;
	private Room bottomRoom;

	Room(String name) {
		this.name = name;
	}

	Room getleftRoom() {
		return leftRoom;
	}

	void setleftRoom(Room name) {
		this.leftRoom = name;
	}

	Room gettopRoom() {
		return topRoom;
	}

	void settopRoom(Room name) {
		this.topRoom = name;
	}

	Room getrightRoom() {
		return rightRoom;
	}

	void setrightRoom(Room name) {
		this.rightRoom = name;
	}

	Room getbottomRoom() {
		return bottomRoom;
	}

	void setBottomRoom(Room bottomRoom) {
		this.bottomRoom = bottomRoom;
	}

	public boolean isThereLeftRoom() {

		if (leftRoom == null) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isThereTopRoom() {

		if (topRoom == null) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isThereRightRoom() {

		if (rightRoom == null) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isThereBottomRoom() {

		if (bottomRoom == null) {
			return false;
		} else {
			return true;
		}
	}
	
	String getname(){
		return name;
	}
}
