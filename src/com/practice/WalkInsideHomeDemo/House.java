package com.practice.WalkInsideHomeDemo;

/*
 * Creating house i.e creating all rooms.
 */
public class House {

	private Room livingRoom;
	private Room tvRoom;
	private Room storeRoom;
	private Room bathRoom;
	private Room babyRoom;
	private Room bedRoom;

	Room entryRoom;

	House() {
		livingRoom = new Room("livingRoom");
		tvRoom = new Room("tvRoom");
		storeRoom = new Room("storeRoom");
		bathRoom = new Room("bathRoom");
		babyRoom = new Room("babyRoom");
		bedRoom = new Room("bedRoom");
	
	
	livingRoom.setleftRoom(tvRoom);
	livingRoom.settopRoom(bathRoom);
	livingRoom.setrightRoom(bedRoom);
	
	tvRoom.settopRoom(storeRoom);
	tvRoom.setrightRoom(livingRoom);
	
	storeRoom.setrightRoom(bathRoom);
	storeRoom.setBottomRoom(tvRoom);
	
	bathRoom.setleftRoom(storeRoom);
	bathRoom.setrightRoom(babyRoom);
	bathRoom.setBottomRoom(livingRoom);
	
	babyRoom.setleftRoom(bathRoom);
	babyRoom.setBottomRoom(bedRoom);
	
	bedRoom.setleftRoom(livingRoom);
	bedRoom.settopRoom(babyRoom);
	}
	 Room getentryRoom(){
		return livingRoom;
	}
}
