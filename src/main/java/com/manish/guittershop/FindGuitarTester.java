package com.manish.guittershop;

public class FindGuitarTester {
	
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		System.out.println(searchGuitter(inventory));
	}

	public static String searchGuitter(Inventory inventory) {
		
		Guitar whatErinLikes = new Guitar("","fender","Stratocaster","electric","Alder","Alder",0.0);
		Guitar guitar = inventory.search(whatErinLikes);
		if(guitar != null) {
			return "Erin, you might like this "+
					guitar.getBuilder() + " " + guitar.getModel() + " " +
					guitar.getType() + " guitar:\n   "+
					guitar.getBackWood() + "back and sides, \n   "+
					guitar.getTopWood() + " top.\nYou can have it for only $"+
					guitar.getPrice() + "!Bug";
		} else {
			return "Sorry Erin, we have nothing for you.!";
		}
		
	}
	
	public static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("","fender","Stratocaster","electric","Alder","Alder",5.0);
		inventory.addGuitar("","kumvar","kingStone","electric","Older","Alder",8.0);
		inventory.addGuitar("","Saanu","HandMade","Non-Electric","Younger","Older",10.0);
	}
	
	
}