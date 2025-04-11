package com.cdac.acts.tester;
import com.cdac.acts.bank.CurrentAccount;
import com.cdac.acts.bank.SavingAccount;
import com.cdac.acts.bank.DepositAccount;
import com.cdac.acts.bank.Account;

import java.util.Scanner;
public class BankTester {
	private static Account[] accounts = new Account[10];
	private static int cnt = 0;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	int choice;
	do {
		display();
		System.out.println("Enter your choice:->");
		choice= sc.nextInt();
		switch(choice) {
			case 1:{
				createAccount();
				break;
			}
			case 2:{
				applyInterestToAll();
				break;
			}
			case 3:{
				
				displayAllAccount();
				break;
			}
			case 4:{
				System.out.println("Exit..");
				break;
			}
			default:{
				System.out.println("Invalid choice ...");
			}
		}
	}while(choice != 4);
		
	}
	public static void display() {
		 	System.out.println("\n===== Banking System Menu =====");
	        System.out.println("1. Create New Account");
	        System.out.println("2. Apply Interest to All Accounts");
	        System.out.println("3. Display All Accounts");
	        System.out.println("4. Exit");
	}
	public static void createAccount() {
		if(cnt>= accounts.length) {
			System.out.println("Maximun account limit reached");
			return;
		}
		System.out.println("\n=== Create New Account ===");
		System.out.println("1. Saving Account");
		System.out.println("2. Current Account");
		System.out.println("3. Deposit Account");
		System.out.println("Select account type:->");
		int type = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter initial balance: ");
		double balance = sc.nextDouble();
		
		switch(type) {
			case 1:{
				accounts[cnt++] = new SavingAccount(name,balance);
				break;
			}
			case 2:{
				accounts[cnt++] = new CurrentAccount(name,balance);
				break;
			}
			case 3:{
				accounts[cnt++] = new DepositAccount(name,balance);
				break;
			}
			default:{
				System.out.println("Invalid account type!");
			}
		}
		System.out.println("Account created successfully!");
				
	}
	public static void applyInterestToAll() {
		if(cnt == 0) {
	        System.out.println("No accounts to apply interest!");
	        return;
	    }
	    
	    for(int i = 0; i < cnt; i++) {
	        double interest = accounts[i].applyInterest();
	        System.out.printf("Applied interest ₹%.2f to account %d\n",
	                        interest, accounts[i].getAccountNumber());
	    }
	    System.out.println("Interest applied to all accounts!");
	}

	public static void displayAllAccount() {
		if(cnt ==0) {
			System.out.println("No account to display...");
			return;
		}
		System.out.println("\n=== All Accounts ===");
		for(int i=0;i<cnt;i++) {
			System.out.println(accounts[i]);
			System.out.println("------------------------------------");
		}
	}

}
