package com.cdac.acts.tester;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.cdac.acts.printerType.PrinterEnum;
import com.cdac.acts.Printer;

public class Main {
	private static final String fileName = "D:/printer.dat";
	private static HashMap<String,Printer>printers=new HashMap<>();
	
	public static void main(String[] args) {
			loadPrintersFromFile();
			Scanner sc = new Scanner(System.in);
			int choice;
			do {
				display();
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				sc.nextLine();
				switch(choice) {
					case 1:{
						addPrinter(sc);
						break;
					}
					case 2:{
						updatePrinterPrice(sc);
						break;
					}
					case 3:{
						printAllPrinters();
						break;
					}
					case 4:{
						savePrintersToFile();
						System.out.println("Exit...");
						System.exit(0);
						sc.close();
						break;
					 
					}
					default:{
						System.out.println("you Entered Invalid choice....");
					}
					
				}
			}while(choice != 4);
		
	}
	private static void display() {
		System.out.println("\nPrinter Management System");
        System.out.println("1. Add Printer");
        System.out.println("2. Update Printer Price");
        System.out.println("3. Print all Printers");
        System.out.println("4. Exit");
	}
	private static void addPrinter(Scanner sc) {
		 System.out.println("\nAdd New Printer");
	     System.out.print("Enter Serial No: ");
	     String serialNo = sc.nextLine();
	     
	     if (printers.containsKey(serialNo)) {
	    	 System.out.println("Printer with this serial number already exists.");
	    	 return;
	     }
	     System.out.print("Enter Model No: ");
	     String modelNo = sc.nextLine();

	     System.out.print("Enter Price: ");
	     double price = sc.nextDouble();
	     sc.nextLine();
	     
	     System.out.println("Available Printer Types:");
	     for (PrinterEnum type : PrinterEnum.values()) {
	    	 System.out.println(type.ordinal() + 1 + ". " + type);
	     }
	     System.out.print("Select Printer Type (1-" + PrinterEnum.values().length + "): ");
	     int typeChoice = sc.nextInt();
	     PrinterEnum printerType = PrinterEnum.values()[typeChoice - 1];
	     sc.nextLine();
	     
	     System.out.print("Enter Manufacturing Date (YYYY-MM-DD): ");
	     String dateStr = sc.nextLine();
	     LocalDate manufacturingDate = LocalDate.parse(dateStr);
	     
	     Printer printer = new Printer(serialNo, modelNo, price, printerType, manufacturingDate);
	     printers.put(serialNo, printer);
	     System.out.println("Printer added successfully.");
	}
	
	private static void updatePrinterPrice(Scanner sc) {
		 System.out.println("\nUpdate Printer Price");
		 System.out.print("Enter Serial No of the printer to update: ");
		 String serialNo = sc.nextLine();

		 Printer printer = printers.get(serialNo);
		 if (printer == null) {
			 System.out.println("Printer with serial no " + serialNo + " not found.");
			 return;
		 }
		 System.out.println("Current price: " + printer.getPrice());
	     System.out.print("Enter new price: ");
	     double newPrice = sc.nextDouble();
	     sc.nextLine();  

	     printer.setPrice(newPrice);
	     System.out.println("Price updated successfully.");
	}
	private static void printAllPrinters() {
		System.out.println("\nList of All Printers");
        if (printers.isEmpty()) {
            System.out.println("No printers found.");
            return;
        }

        for (Printer printer : printers.values()) {
            System.out.println(printer);
        }
	}
	 @SuppressWarnings("unchecked")
	    private static void loadPrintersFromFile() {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
	            Object obj = ois.readObject();
	            if (obj instanceof HashMap) {
	                System.out.println("Printers loaded from file successfully.");
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("No existing printer data found. Starting with empty list.");
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Error loading printers from file: " + e.getMessage());
	        }
	    }
	private static void savePrintersToFile() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(printers);
            System.out.println("Printers saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error saving printers to file: " + e.getMessage());
        }
		
	}
}
