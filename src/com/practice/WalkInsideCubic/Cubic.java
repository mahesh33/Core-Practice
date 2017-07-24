package com.practice.WalkInsideCubic;

public class Cubic {

	Room entryRoom;

	Room hallwayRoom;
	Room cafeteriaRoom;
	Room UIClassRoom;
	Room coreJavaClassRoom;
	Room advancedClassRoom;
	Room restRoom;
	Room officeRoom;
	
	Cubic() {
		hallwayRoom = new Room("hallwayRoom");
		cafeteriaRoom = new Room("cafeteriaRoom");
		UIClassRoom = new Room("UIClassRoom");
		coreJavaClassRoom = new Room("coreJavaClassRoom");
		advancedClassRoom = new Room("advancedClassRoom");
		restRoom = new Room("restRoom");
		officeRoom = new Room("officeRoom");

		hallwayRoom.setRightRoom(cafeteriaRoom);
		hallwayRoom.setTopRoom(advancedClassRoom);

		cafeteriaRoom.setRightRoom(UIClassRoom);
		cafeteriaRoom.setTopRoom(coreJavaClassRoom);

		UIClassRoom.setLeftRoom(cafeteriaRoom);
		
		coreJavaClassRoom.setLeftRoom(advancedClassRoom);

		advancedClassRoom.setLeftRoom(restRoom);

		restRoom.setLeftRoom(officeRoom);
		
		officeRoom.setRightRoom(restRoom);
	}

	Room getentryRoom() {
		return hallwayRoom;
	}
}
