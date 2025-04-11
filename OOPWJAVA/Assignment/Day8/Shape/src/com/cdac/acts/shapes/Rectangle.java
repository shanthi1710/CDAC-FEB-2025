package com.cdac.acts.shapes;

public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return length * width;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2 * (length + width);
	}
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width 
				+", Area="+String.format("%.2f",calculateArea())
				+", Perimeter="+ String.format("%.2f",calculatePerimeter())+ "]";
	}
	
	
}
