package com.cdac.acts;

public class fruit {
	private String name;
	private String color;
	private double price;
	private int qty;
	
	public fruit() {
		System.out.println("Default constructor");
	}

	public fruit(String name, String color, double price, int qty) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "fruit [name=" + name + ", color=" + color + ", price=" + price + ", qty=" + qty + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
	    return qty;
	}

	public void setQuantity(int qty) {
	    this.qty = qty;
	}
}
