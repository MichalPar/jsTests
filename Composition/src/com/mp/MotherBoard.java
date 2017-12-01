package com.mp;

public class MotherBoard {
	private String brand;
	private int power;
	private Chip chip;
	
	public MotherBoard(String brand, int power, Chip chip) {
		super();
		this.brand = brand;
		this.power = power;
		this.setChip(chip);
	}

	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Chip getChip() {
		return chip;
	}

	public void setChip(Chip chip) {
		this.chip = chip;
	}
}
