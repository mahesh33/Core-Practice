package com.practice.WalkInsideCubic;

public class Room {

	String name;

	private Room leftRoom;
	private Room topRoom;
	private Room rightRoom;
	private Room bottomRoom;

	/**
	 * 
	 * @param name
	 *            Give name when creating Room's constructor. So, that value
	 *            will get initialize to name property.
	 */
	Room(String name) {
		this.name = name;
	}

	public Room getLeftRoom() {
		return leftRoom;
	}

	public void setLeftRoom(Room leftRoom) {
		this.leftRoom = leftRoom;
	}

	public Room getTopRoom() {
		return topRoom;
	}

	public void setTopRoom(Room topRoom) {
		this.topRoom = topRoom;
	}

	public Room getRightRoom() {
		return rightRoom;
	}

	public void setRightRoom(Room rightRoom) {
		this.rightRoom = rightRoom;
	}

	public Room getBottomRoom() {
		return bottomRoom;
	}

	public void setBottomRoom(Room bottomRoom) {
		this.bottomRoom = bottomRoom;
	}

	public boolean isThereLeftRoom() {
		if (leftRoom == null) {
			return false;
		}
		return true;
	}

	public boolean isThereTopRoom() {
		if (topRoom == null) {
			return false;
		}
		return true;
	}

	public boolean isThereRightRoom() {
		if (rightRoom == null) {
			return false;
		}
		return true;
	}

	public boolean isThereBottomRoom() {
		if (bottomRoom == null) {
			return false;
		}
		return true;
	}

	String getName() {
		return name;
	}
}
