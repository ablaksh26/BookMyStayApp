package com.inventory;

public class Inventory {
	public int roomPrice;
	public int roomCount;
	
	public Inventory(int roomPrice, int roomCount) {
		this.roomPrice = roomPrice;
		this.roomCount = roomCount;
	}
	
	// Getting the Price
	public int getPrice() {
		return roomPrice;
	}
	
	// Setting the Price
	public void setPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}
	
	// Get the roomCount
	public int getCount() {
		return roomCount;
	}
	
	// Set the roomCount
	public void setCount(int roomCount) {
		this.roomCount = roomCount;
	}
}