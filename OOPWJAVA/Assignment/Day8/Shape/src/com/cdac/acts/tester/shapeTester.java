package com.cdac.acts.tester;
import java.util.Scanner;
import com.cdac.acts.shapes.*;
public class shapeTester {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Shape shape =null;
		int choice;
		
		do {
			displayMenu();
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:{
				shape = createRectangle();
				break;
			}
			case 2:{
				shape = createCircle();
				break;
			}
			case 3:{
				if(shape != null) {
					System.out.print(shape);
					if(shape instanceof Circle) {
						Circle circle = (Circle)shape;
						circle.draw();
					}
				}
				break;
			}
			case 4:{
				System.out.println("Exiting....");
			}
			default:{
				System.out.println("your entered Invalid choice...");
			}
			}
		}while(choice!=4);
	}
	private static void displayMenu() {
		 System.out.println("\n===== Shape Menu =====");
	     System.out.println("1. Create Rectangle");
	     System.out.println("2. Create Circle");
	     System.out.println("3. Display Shape Details");
	     System.out.println("4. Exit");
	}
	private static Rectangle createRectangle() {
		System.out.println("Enter length: ");
		double length = sc.nextDouble();
		System.out.println("Enter width: ");
		double width = sc.nextDouble();
		return new Rectangle(length,width);
	}
	private static Circle createCircle() {
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		return new Circle(radius);
	}
	
	

}
