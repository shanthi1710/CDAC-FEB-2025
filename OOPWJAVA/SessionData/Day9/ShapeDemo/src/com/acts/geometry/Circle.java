package com.acts.geometry;

public class Circle implements Shape {

	private double radius;
	
	
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return PI * radius * radius;
	}

	@Override
	public double calcPerimeter() {
		return 2 * PI * radius;
	}
	
	@Override
	public void draw() {
		System.out.println("Circle: draw");
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	

}
