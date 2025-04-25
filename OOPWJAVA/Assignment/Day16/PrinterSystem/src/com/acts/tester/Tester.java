package com.acts.tester;
import com.acts.utils.BinIOUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.acts.*;

public class Tester {
	private static Scanner sc = new Scanner(System.in);
	private static Map<Integer, Printer> pData = new HashMap<>();

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		int choice;
		do {
			System.out.println("************Choose from Below************");
			System.out.println("1) Add Printer Data\n" + 
								"2) Change Printer Price" + 
								"3) Print all Printers");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: addData(); break;
			case 2:changePrice(); break;
			case 3: printData(); break;
			case 4: onExit(); break;
			default: System.out.println("Invalid Input!");
			}
		}while(choice != 0);
	}

	private static void onExit() throws FileNotFoundException, IOException {
		BinIOUtils.saveData(pData, "D:/printerFile.dat");
		System.out.println("********Exit*******");
	}

	private static void addData() throws FileNotFoundException, IOException {
		System.out.print("Enter Serial No: ");
		Integer sn = sc.nextInt();
		System.out.print("Enter Model No: ");
		Integer mn = sc.nextInt();
		System.out.print("Enter Price: ");
		Double price = sc.nextDouble();
		System.out.print("Enter Type(Laser, Inkjet, Dotmatrix): ");
		String pt = sc.next().toUpperCase();
		PrinterType type = PrinterType.valueOf(pt);
		System.out.print("Enter Manufacturing Date: ");
		String dt = sc.next();
		LocalDate date = LocalDate.parse(dt);
		
		Printer p = new Printer(sn, mn, price, type, date);
		pData.put(sn, p);
		BinIOUtils.saveData(pData, "D:/printerFile.dat");
		
	}

	private static void printData() throws ClassNotFoundException, IOException {
		pData = BinIOUtils.readData("D:/printerFile.dat");
		System.out.println(pData);
		
	}

	private static void changePrice() throws FileNotFoundException, IOException {
		System.out.print("Enter Serial No: ");
		Integer sno = sc.nextInt();
		System.out.print("Enter the updated price: ");
		Double price = sc.nextDouble();
		pData.get(sno).setPrice(price);
		BinIOUtils.saveData(pData, "D:/printerFile.dat");
	}

}
