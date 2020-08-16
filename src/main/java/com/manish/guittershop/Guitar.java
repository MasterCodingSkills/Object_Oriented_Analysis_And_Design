package com.manish.guittershop;

public class Guitar {
	private String serialNumber;
	private Double price;
	private GuitarSpecifications guitarSpecifications;
	
	public Guitar(String serialNumber,Double price,GuitarSpecifications guitarSpecifications) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpecifications = guitarSpecifications;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public GuitarSpecifications getGuitarSpecifications() {
		return guitarSpecifications;
	}

	public void setGuitarSpecifications(GuitarSpecifications guitarSpecifications) {
		this.guitarSpecifications = guitarSpecifications;
	}
	
}