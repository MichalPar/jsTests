package com.mp;

public class SingleRoom {

	private String roomName;
	private String [] furnitures;
	private boolean isRoomFree;
	private Equipment equipment;
	private int test = Util.number;
	
	public SingleRoom(String roomName, String[] furnitures, boolean isRoomFree, Equipment equipment) {
		super();
		this.roomName = roomName;
		this.furnitures = furnitures;
		this.isRoomFree = isRoomFree;
		this.equipment=equipment;
	}
	
	public String getRoomName() {
		equipment.getBed().getBedSize();
		equipment.getWindows();
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String [] getFurnitures() {
		return furnitures;
	}
	public void setFurnitures(String [] furnitures) {
		this.furnitures = furnitures;
	}
	public boolean isRoomFree() {
		return isRoomFree;
	}
	public void setRoomFree(boolean isRoomFree) {
		this.isRoomFree = isRoomFree;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	
	
}
