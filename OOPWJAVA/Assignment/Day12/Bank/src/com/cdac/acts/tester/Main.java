package com.cdac.acts.tester;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.cdac.acts.Account;
import com.cdac.acts.comparators.AccNameComparator;
import com.cdac.acts.comparators.AccountNoDescComparator;
import com.cdac.acts.comparators.BalanceDescComparator;
import com.cdac.acts.comparators.DateOfOpeningComparator;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	private static List<Account>accounts= new ArrayList<>();
	
	public static void main(String[] args) {
		 int choice;
		 
		 do {
			 display();
			 System.out.println("Enter your choice:-> ");
			 choice = sc.nextInt();
			 
			 switch(choice) {
			 	case 1:{
			 		addAccount();
			 		break;
			 	}
			 	case 2:{
			 		printAllAcounts();
			 		break;
			 	}
			 	case 3:{
			 		sortByAccountNoDesc();
			 		break;
			 	}
			 	case 4:{
			 		sortByAccName();
			 		break;
			 	}
			 	case 5:{
			 		sortByDateOfOpening();
			 		break;
			 	}
			 	case 6:{
			 		sortByBalanceDesc();
			 		break;
			 	}
			 	case 7:{
			 		System.out.println("Exit");
			 		System.exit(0);
			 		sc.close();
			 		break;
			 	}
			 }
		 }while(choice!=7);

	}
	
	private static void display() {
		System.out.println("\nMenu:");
        System.out.println("1. Add account");
        System.out.println("2. Print all accounts");
        System.out.println("3. Sort by account no desc");
        System.out.println("4. Sort by accName");
        System.out.println("5. Sort by Date of opening");
        System.out.println("6. Sort by balance desc");
        System.out.println("7. Exit");
	}
	
	private static void addAccount() {
		System.out.println("\nEnter Account details: ");
		
		System.out.println("Enter account no: ");
		int accNo = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder name: ");
		String accName = sc.nextLine();
		
		LocalDate dateOfOpeining = null;
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		while(dateOfOpeining == null) {
			try {
				System.out.print("Date of Opening (DD/MM/YYYY): ");
				String dateInput =sc.nextLine();
				dateOfOpeining = LocalDate.parse(dateInput,dateFormatter);
				
				if(dateOfOpeining.isAfter(LocalDate.now())) {
					System.out.println("Date cannot be in the future. Please try again.");
					dateOfOpeining = null;
				}
				
			}catch(Exception e) {
				System.out.println("Invalid date format. Please use DD/MM/YYYY format.");
			}
		}	
		double balance = 0;
		while(balance<500) {
			try {
				System.out.println("Enter balance: ");
				balance = sc.nextDouble();
				if(balance<500) {
					 System.out.println("Balance must be more than 500. Please try again.");
				}
			}catch(Exception e) {
				System.out.println("Invalid amount. Please enter a valid number");
				sc.nextLine();
			}
		}
		
		Account account = new Account(accNo,accName,dateOfOpeining,balance);
		accounts.add(account);
		System.out.println("Account added sucessfully!");
	}
	
	private static void printAllAcounts() {
		if(accounts.isEmpty()) {
			System.out.println("No Account available.");
			return;
		}
		
		System.out.println("\nAll Acounts");
		for(Account x:accounts) {
			System.out.println(x);
		}
		
		
	}
	
	private static void sortByAccountNoDesc() {
		Collections.sort(accounts,new AccountNoDescComparator());
		System.out.println("\nAccounts sorted by account number (descending):");
		printAllAcounts();
	}
	
	private static void sortByAccName() {
		Collections.sort(accounts,new AccNameComparator());
		System.out.println("\nAccounts sorted by account name:");
		printAllAcounts();
	}
	
	private static void sortByDateOfOpening() {
		Collections.sort(accounts,new DateOfOpeningComparator());
		System.out.println("\nAccounts sorted by date of opening:");
		printAllAcounts();
        
	}
	private static void sortByBalanceDesc() {
		Collections.sort(accounts,new BalanceDescComparator());
		System.out.println("\nAccounts sorted by balance (descending):");
        printAllAcounts();
	}
}
