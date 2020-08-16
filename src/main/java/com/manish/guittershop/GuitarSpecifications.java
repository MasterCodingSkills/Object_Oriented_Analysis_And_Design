package com.manish.guittershop;

import com.manish.guittershop.enums.Builder;
import com.manish.guittershop.enums.Type;
import com.manish.guittershop.enums.Wood;

public class GuitarSpecifications {
	
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private int numberOfStrings;
	
	public GuitarSpecifications(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numberOfStrings) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numberOfStrings = numberOfStrings;
	}
	
	public Builder getBuilder() {
		return builder;
	}
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}
	
	public int getNumberOfStrings() {
		return numberOfStrings;
	}

	public void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}

	public boolean matches(GuitarSpecifications searchGuitar) {
		
		if(!searchGuitar.getBuilder().equals(this.getBuilder())) {
			return false;
		}
		
		String model = searchGuitar.getModel();
		if(model != null && !model.equals("") && !model.equalsIgnoreCase(this.getModel())) {
			return false;
		}
		
		if(!searchGuitar.getType().equals(this.getType())) {
			return false;
		}
		
		if(!searchGuitar.getBackWood().equals(this.getBackWood())) {
			return false;
		} 
		
		if(!searchGuitar.getTopWood().equals(this.getTopWood())) {
			return false;
		} 
		
		if(searchGuitar.getNumberOfStrings() != this.numberOfStrings) {
			return false;
		}
		
		return true;
	}
	
}
