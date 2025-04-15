package com.cdac.acts.shapes;

public class Circle extends Shape implements Drawable{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("Drawing Circle with radius: "+radius);
	}
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	@Override
	public double calculatePerimeter() {
		 return 2 * Math.PI * radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius 
				+ ", calculateArea()=" + String.format("%.2f",calculateArea()) 
				+ ", calculatePerimeter()="+ String.format("%.2f", calculatePerimeter()) + "]";
	}
	
	
}
