package com.mp;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerPC myComputer = new ComputerPC(new MotherBoard("Samsung",230, new Chip("Bios")), "Asus", new Box(), new Monitor());
	//System.out.println(myComputer.getMotherBoard().getChip().getChipBrand());
	
	String [] rooms ={"ten"};
	String [] equipmentBasic={"Sofa","Table"};
	
	Equipment equipmentBasicObj = new Equipment(equipmentBasic, 4);
	House house = new House(2, new SingleRoom("Blue", rooms, true, equipmentBasicObj));	{
		System.out.println(house.getLivingRoom().getRoomName());
		System.out.println(equipmentBasicObj.getBed().getBedSize());
		System.out.println(equipmentBasicObj.getWindows());
		System.out.println(Util.number);
	}
		
	}

}
