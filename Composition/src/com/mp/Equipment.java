package com.mp;

public class Equipment {
	private String [] equipment;
	private int numberOfWindows;
	private Bed bedDefault;
	
	public Equipment(String[] equipment, int numberOfWindows) {
		super();
		this.equipment = equipment;
		this.numberOfWindows = numberOfWindows;
		bedDefault = new Bed(14.34);
	}
	
	public String []  getEquipment(){
		return equipment;
	}
	public int getWindows(){
		return numberOfWindows;
	}
	public Bed getBed() {
		return bedDefault;
	}
	public void setBed(Bed bed) {
		this.bedDefault = bed;
	}

}
