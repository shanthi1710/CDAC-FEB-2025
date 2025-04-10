package com.cdac.acts.tester;

import java.util.Arrays;
import java.util.Scanner;

import com.cdac.acts.Item;

public class ItemOrder {
	
	private static Scanner sc = new Scanner(System.in);
	 
	 static Item itemArr[] = {
		new Item(101,"Pencil",2,200),	
		new Item(102,"Pen", 10, 100),
		new Item(103,"Eraser", 5, 50),
		new Item(104,"Book",50, 20),
		new Item(105,"Sharperner", 10, 10)
	 };
	 
	 static Item curtArr[] = new Item[10];
	 static int cnt = 0;
	 
	 public static void main(String[] args) {
		 int choice;
		 
		 do {
			 display();
			 choice = sc.nextInt();
			 
			 switch(choice) {
			 	case 1:{
			 		displayItems();
			 		break;
			 	}
			 	case 2:{
			 		addItems();
			 		break;
			 	}
			 	case 3:{
			 		genBill();
			 		break;
			 	}
			 	case 4:{
			 		System.out.println("Exit...");
			 		break;
			 	}
			 	default:{
			 		System.out.println("you enter wrong choice..");
			 	}
			 }
		 }while(choice !=4);
	 }
	 public static void display() {
		 System.out.println("Choose from below!\n"
					+ "1) Display the Item\n"
					+ "2) Add Items to cart\n"
					+ "3) Generate Bill\n"
					+ "4) Exit.");
	 }
	 public static void addItems() {
			int code;
			
			do {
				System.out.print("Cart(enter 0 to exit!)"
						+ "\nEnter item code: ");
				code = sc.nextInt();
				boolean found = false;
				for (int i = 0; i < 5; i++) {
					
					if( code == itemArr[i].getItemCode()) {
						System.out.print("Enter the quantity: ");
						int qnty = sc.nextInt();
						if( qnty <= itemArr[i].getQuantity()) {
							String name = itemArr[i].getItemName();
							double price = itemArr[i].getPrice();
							curtArr[cnt] = new Item(code, name, price, qnty);
							cnt++;
							itemArr[i].setQuantity(itemArr[i].getQuantity() - qnty);
							found = true;
						}
						if(found != true) {
							System.out.println("Stocks not available!");
						}
					}
					
					}
			} while(code != 0);
			if(cnt != 0) {
				for (int i = 0; i < cnt; i++) {
					System.out.println(curtArr[i]);
				}
			} else {
				System.out.println("Empty Cart!");
			}
	 }
	 public static void displayItems() {
		 System.out.println(Arrays.toString(itemArr));
	 }
	 public static void genBill() {
		 if (cnt <= 10) {
				if(cnt != 0) {
					System.out.println("Your Cart!");
					//System.out.println(Arrays.toString(custArr));
					for (int i = 0; i < cnt; i++) {
						System.out.println(curtArr[i]);
					}
					double bill = 0.0;
					for (int i = 0; i < cnt; i++) {
						double total = curtArr[i].getPrice() * curtArr[i].getQuantity();
						bill += total;
					}
					System.out.println("YOUR GENERATED BILL : " + bill);
				} else {
					System.out.println("Empty Cart!");
				}} else {
					System.out.println("Full cart!!");
				}
	 }
}
