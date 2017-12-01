package com.mp;

public class House {
	
	private int numberOfRooms;
	private SingleRoom livingRoom;
	
	public House(int numberOfRooms, SingleRoom livingRoom) {
		super();
		this.numberOfRooms = numberOfRooms;
		this.livingRoom = livingRoom;
	}
	
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public SingleRoom getLivingRoom() {
		return livingRoom;
	}
	public void setLivingRoom(SingleRoom livingRoom) {
		this.livingRoom = livingRoom;
	}
	

}
