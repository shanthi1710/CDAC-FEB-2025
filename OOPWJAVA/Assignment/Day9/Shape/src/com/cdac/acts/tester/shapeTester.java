package com.cdac.acts.tester;
import java.util.Scanner;
import com.cdac.acts.shapes.*;

public class shapeTester {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Shape shape = null;
        int choice;
        
        do {
            displayMenu();
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    shape = createRectangle();
                    break;
                case 2:
                    shape = createCircle();
                    break;
                case 3:
                    if(shape != null) {
                        System.out.println(shape);
                        if(shape instanceof Drawable) {
                            ((Drawable)shape).draw();
                        }
                    } else {
                        System.out.println("No shape created yet!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid choice...");
            }
        } while(choice != 4);
        sc.close();
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
        return new Rectangle(length, width);
    }
    
    private static Circle createCircle() {
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        return new Circle(radius);
    }
}