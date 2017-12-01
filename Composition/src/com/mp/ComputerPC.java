package com.mp;

public class ComputerPC {

	private MotherBoard motherBoard;
	private String producer;
	private Box box;
	private Monitor monitor;
	
	
	public ComputerPC(MotherBoard motherBoard, String producer, Box box, Monitor monitor) {
		super();
		this.setMotherBoard(motherBoard);
		this.setProducer(producer);
		this.setBox(box);
		this.setMonitor(monitor);
	}


	public MotherBoard getMotherBoard() {
		return motherBoard;
	}


	public void setMotherBoard(MotherBoard motherBoard) {
		this.motherBoard = motherBoard;
	}


	public String getProducer() {
		return producer;
	}


	public void setProducer(String producer) {
		this.producer = producer;
	}


	public Box getBox() {
		return box;
	}


	public void setBox(Box box) {
		this.box = box;
	}


	public Monitor getMonitor() {
		return monitor;
	}


	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
}





