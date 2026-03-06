package com.main;

import java.util.*;

import com.user.Search;
import com.inventory.Inventory;
/*
 * 
 * @author: Abhilaksh
 * @version: UC2
 * 
 * 
 * */

public class Main {
	
	public static HashMap<String,Inventory> map = new HashMap<>();

	public static void main(String[] args) {
		
		map.put("Single",new Inventory(2000,5));
		map.put("Double",new Inventory(3000,3));
		map.put("Suite",new Inventory(4000,0));
		
		Search.searchRoom("Suite");

	}

}