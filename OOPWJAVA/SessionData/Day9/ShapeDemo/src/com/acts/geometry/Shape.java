package com.acts.geometry;

public interface Shape {
	double PI = 3.142;
	double calcArea();
	double calcPerimeter();
	default void draw() {
		System.out.println("Shape: draw");
	}
}
