package com.user;

import java.util.*;

import com.inventory.Amenities;
import com.inventory.Inventory;
import com.main.Main;

public class Search {
	static HashMap<String,Inventory> map = Main.map;
	
	public static boolean searchRoom(String roomType) {
		if(map.get(roomType).roomCount==0) {
			System.out.println("Room not available");
			return false;
		}
		
		else if(map.get(roomType).roomCount > 1) System.out.println(map.get(roomType).roomCount+ " " + roomType +  " Rooms Available");
		
		else System.out.println(map.get(roomType).roomCount+ " " + roomType +  " Room Available");
		System.out.println();
		
		if(roomType == "Single") System.out.println(Amenities.singleRoom);
		else if(roomType == "Double") System.out.println(Amenities.doubleRoom);
		else if(roomType == "Suite") System.out.println(Amenities.suiteRoom);
		
		return true;
	}
}