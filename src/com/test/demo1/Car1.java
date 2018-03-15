package com.test.demo1;

public class Car1 {
	private String cname;
	private Double price;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car1 [cname=" + cname + ", price=" + price + "]";
	}
}
