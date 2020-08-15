package com.manish.guittershop;

public class FindGuitarTester {
	
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar whatErinLikes = new Guitar("","fender","Stratocaster","electric","Alder","Alder",0.0);
		Guitar guitar = inventory.search(whatErinLikes);
		if(guitar != null) {
			System.out.println("Erin, you might like this "+
					guitar.getBuilder() + " " + guitar.getModel() + " " +
					guitar.getType() + " guitar:\n   "+
					guitar.getBackWood() + "back and sides, \n   "+
					guitar.getTopWood() + " top.\nYou can have it for only $"+
					guitar.getPrice() + "!");
		} else {
			System.out.println("Sorry Erin, we have nothing for you.!");
		}
	}
	
	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("","fender","Stratocaster","electric","Alder","Alder",0.0);
		inventory.addGuitar("","kumvar","kingStone","electric","Older","Alder",0.0);
		inventory.addGuitar("","Saanu","HandMade","Non-Electric","Younger","Older",0.0);
	}
}