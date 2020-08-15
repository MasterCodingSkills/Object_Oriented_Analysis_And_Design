package com.manish.guittershop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GuitterSeachTesting {
	
	@Test
	public void testSearchGuitter() {
		 String expected = "Erin, you might like this Fender Stratocaster electric guitar:\n   " + 
		 		"Alderback and sides, \n   " + 
		 		"Alder top.\n" + 
		 		"You can have it for only $5.0!";
		 
		 Inventory inventory = new Inventory();
		 FindGuitarTester.initializeInventory(inventory);
		 
	     assertEquals(expected,FindGuitarTester.searchGuitter(inventory));
	}
}
