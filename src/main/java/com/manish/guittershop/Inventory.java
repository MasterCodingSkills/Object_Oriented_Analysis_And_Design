package com.manish.guittershop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.manish.guittershop.enums.Builder;
import com.manish.guittershop.enums.Type;
import com.manish.guittershop.enums.Wood;

public class Inventory {
	private List<Guitar> guitars;
	
	public Inventory() {
		guitars = new LinkedList<>();
	}
	
	public void addGuitar(String serialNumber, Builder builder, String model, Type type, Wood backWood, Wood topWood,
			Double price) {
		Guitar guitar = new Guitar(serialNumber ,price, 
				new GuitarSpecifications(builder, model, type, backWood, topWood));
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber) {
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			if(guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
	
	public List<Guitar> search(GuitarSpecifications searchGuitar) {
		List<Guitar> matchingGuitars = new ArrayList<>();
		
		for(Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			GuitarSpecifications guitarSpecifications = guitar.getGuitarSpecifications();
			
			if(!searchGuitar.getBuilder().equals(guitarSpecifications.getBuilder())) {
				continue;
			}
			
			String model = searchGuitar.getModel();
			if(model != null && !model.equals("") && !model.equalsIgnoreCase(guitarSpecifications.getModel())) {
				continue;
			}
			
			if(!searchGuitar.getType().equals(guitarSpecifications.getType())) {
				continue;
			}
			
			if(!searchGuitar.getBackWood().equals(guitarSpecifications.getBackWood())) {
				continue;
			} 
			
			if(!searchGuitar.getTopWood().equals(guitarSpecifications.getTopWood())) {
				continue;
			} 
			
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
	
}