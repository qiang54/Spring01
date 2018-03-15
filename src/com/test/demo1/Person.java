package com.test.demo1;

public class Person {

	private String pname;
	private Car myCar;

	
	public Person(String pname, Car myCar) {
		this.pname = pname;
		this.myCar = myCar;
	}


	@Override
	public String toString() {
		return "Person [pname=" + pname + ", myCar=" + myCar + "]";
	}
	
	
}
