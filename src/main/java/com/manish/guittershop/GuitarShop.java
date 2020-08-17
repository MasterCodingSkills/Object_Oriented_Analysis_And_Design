package com.manish.guittershop;

import java.util.List;

import com.manish.guittershop.enums.Builder;
import com.manish.guittershop.enums.Type;
import com.manish.guittershop.enums.Wood;

public class GuitarShop {
	
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		System.out.println(searchGuitter(inventory));
	}

	public static String searchGuitter(Inventory inventory) {
		
		GuitarSpecifications whatErinLikes = new GuitarSpecifications(Builder.FENDER,"Stratocaster",Type.ELECTRIC,Wood.ALDER,Wood.ALDER,6);
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		
		if(!matchingGuitars.isEmpty()) {
			
			String result = "";
			for(Guitar guitar : matchingGuitars) {
				GuitarSpecifications guitarSpecifications = guitar.getGuitarSpecifications();
				result += "Erin, you might like this "+
						guitarSpecifications.getBuilder() + " " + guitarSpecifications.getModel() + " " +
						guitarSpecifications.getNumberOfStrings()+"-String " +
						guitarSpecifications.getType() + " guitar:\n   "+
						guitarSpecifications.getBackWood() + "back and sides, \n   "+
						guitarSpecifications.getTopWood() + " top.\nYou can have it for only $"+
						guitar.getPrice() + "!\n\n";
			}
			return result;
			
		} else {
			return "Sorry Erin, we have nothing for you.!";
		}
		
	}
	
	public static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("",Builder.FENDER,"Stratocaster",Type.ELECTRIC,Wood.ALDER,Wood.ALDER,5.0,6);
		inventory.addGuitar("",Builder.GIBSON,"Stratocaster",Type.ACOUSTIC,Wood.BRAZILIAN_ROSEWOOD,Wood.ALDER,0.0,12);
		inventory.addGuitar("",Builder.COLLINGS,"Stratocaster",Type.ELECTRIC,Wood.INDIAN_ROSEWOOD,Wood.CEDAR,0.0,12);
		inventory.addGuitar("",Builder.FENDER,"Stratocaster",Type.ELECTRIC,Wood.ALDER,Wood.ALDER,10.0,6);
	}
	
	
}