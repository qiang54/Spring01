package com.test.demo1;

public class Car {

	private String cname;
	private Double price;
	
	public Car(String cname, Double price) {
		super();
		this.cname = cname;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [cname=" + cname + ", price=" + price + "]";
	}
	
	
}
