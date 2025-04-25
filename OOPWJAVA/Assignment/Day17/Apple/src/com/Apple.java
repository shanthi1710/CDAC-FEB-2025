package com;

public class Apple {
	private int weight;
	private String color;
	private String taste;
	
	public Apple(int weight, String color, String taste) {
		super();
		this.weight = weight;
		this.color = color;
		this.taste = taste;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getColor() {
		return color;
	}
	public String getTaste() {
        return taste;
	}
	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + ", taste=" + taste + "]";
	}
	
}
