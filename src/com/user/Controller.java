package com.user;

import com.main.Main;

// Controller Class for updating room count and room price.
public class Controller {
	
	// Increasing the Room Count.
	public static void increaseRoomCount(int noOfRooms,String roomType) {
		int oldCount = Main.map.get(roomType).getCount();
		Main.map.get(roomType).setCount(oldCount+noOfRooms);
	}
	// Decreasing the Room Count.
	public static void decreaseRoomCount(int noOfRooms,String roomType) {
		int oldCount = Main.map.get(roomType).getCount();
		Main.map.get(roomType).setCount(oldCount-noOfRooms);
	}
	// Updating the Price.
	public static void updatePrice(int price,String roomType) {
		Main.map.get(roomType).setPrice(price);
	}

}