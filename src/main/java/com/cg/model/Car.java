package com.cg.model;

public class Car {
	private String name;
	private int price;
	
	public Car() {}
	
	
	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "car [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}
