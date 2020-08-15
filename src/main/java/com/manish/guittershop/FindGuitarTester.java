package com.manish.guittershop;

import com.manish.guittershop.enums.Builder;
import com.manish.guittershop.enums.Type;
import com.manish.guittershop.enums.Wood;

public class FindGuitarTester {
	
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		System.out.println(searchGuitter(inventory));
	}

	public static String searchGuitter(Inventory inventory) {
		
		Guitar whatErinLikes = new Guitar("",Builder.FENDER,"Stratocaster",Type.ELECTRIC,Wood.ALDER,Wood.ALDER,0.0);
		Guitar guitar = inventory.search(whatErinLikes);
		if(guitar != null) {
			return "Erin, you might like this "+
					guitar.getBuilder() + " " + guitar.getModel() + " " +
					guitar.getType() + " guitar:\n   "+
					guitar.getBackWood() + "back and sides, \n   "+
					guitar.getTopWood() + " top.\nYou can have it for only $"+
					guitar.getPrice() + "!";
		} else {
			return "Sorry Erin, we have nothing for you.!";
		}
		
	}
	
	public static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("",Builder.FENDER,"Stratocaster",Type.ELECTRIC,Wood.ALDER,Wood.ALDER,5.0);
		inventory.addGuitar("",Builder.GIBSON,"Stratocaster",Type.ACOUSTIC,Wood.BRAZILIAN_ROSEWOOD,Wood.ALDER,0.0);
		inventory.addGuitar("",Builder.COLLINGS,"Stratocaster",Type.ELECTRIC,Wood.INDIAN_ROSEWOOD,Wood.CEDAR,0.0);
	}
	
	
}