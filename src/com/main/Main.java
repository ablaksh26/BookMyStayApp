package com.main;

import java.util.*;
import com.user.Controller;
import com.inventory.Inventory;

/*
 * 
 * @author: Abhilaksh
 * @version: UC1
 * 
 * */


public class Main {
	
	public static HashMap<String,Inventory> map = new HashMap<>();

	public static void main(String[] args) {
		
		map.put("Single",new Inventory(10000,50));
		map.put("Double",new Inventory(30000,30));
		map.put("Suite",new Inventory(50000,20));
		
		for(String s : map.keySet()) {
			System.out.println(s + " " + map.get(s).roomCount + " " + map.get(s).roomPrice);
		}
		
		Controller.increaseRoomCount(2, "Single");
		Controller.updatePrice(35000, "Double");
		
		for(String s : map.keySet()) {
			System.out.println(s + " " + map.get(s).roomCount + " " + map.get(s).roomPrice);
		}
		

	}

}