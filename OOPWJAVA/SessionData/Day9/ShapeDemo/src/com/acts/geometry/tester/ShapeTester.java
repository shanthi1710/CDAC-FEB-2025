package com.acts.geometry.tester;

import com.acts.geometry.Circle;
import com.acts.geometry.Rectangle;
import com.acts.geometry.Shape;

public class ShapeTester {

	public static void main(String[] args) {
		
		Shape s1 = new Circle(10.2);
		s1.draw();
		System.out.println("Area: " + s1.calcArea());
		s1 = new Rectangle(10.2, 20.22);
		s1.draw();
		System.out.println("Area: " + s1.calcArea());
		//TODO
		//Create menu driven program for adding shapes 
		//and displaying circles and rectangle
		
		
		Shape[] arr = new Shape[5];
		Circle c = new Circle();
		arr[0] = c;
		Rectangle r = new Rectangle();
		arr[1] = r;

	}

}
