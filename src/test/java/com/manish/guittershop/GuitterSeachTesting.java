package com.manish.guittershop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GuitterSeachTesting {
	
	@Test
	public void testSearchGuitterPositive() {
		 String expected = "Erin, you might like this Fender Stratocaster electric guitar:\n   " + 
		 		"Alderback and sides, \n   " + 
		 		"Alder top.\n" + 
		 		"You can have it for only $5.0!\n\n"+
		 		"Erin, you might like this Fender Stratocaster electric guitar:\n   " + 
		 		"Alderback and sides, \n   " + 
		 		"Alder top.\n" + 
		 		"You can have it for only $10.0!\n\n";
		 
		 Inventory inventory = new Inventory();
		 FindGuitarTester.initializeInventory(inventory);
		 
	     assertEquals(expected,FindGuitarTester.searchGuitter(inventory));
	}
	
	@Test
	public void testSearchGuitarNegitive() {
		String expected = "Sorry Erin, we have nothing for you.!";
		
		Inventory inventory = new Inventory();
		assertEquals(expected,FindGuitarTester.searchGuitter(inventory));
	}
}
