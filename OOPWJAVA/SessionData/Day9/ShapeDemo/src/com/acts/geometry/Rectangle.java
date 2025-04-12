package com.acts.geometry;

public class Rectangle  implements Shape{

	private double l;
	private double b;
	
	
	
	public Rectangle() {
		super();
	}

	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public double calcArea() {
		return l * b;
	}

	@Override
	public double calcPerimeter() {
		return 2 *( l + b);
	}

	@Override
	public String toString() {
		return "Rectangle [l=" + l + ", b=" + b + "]";
	}

}
