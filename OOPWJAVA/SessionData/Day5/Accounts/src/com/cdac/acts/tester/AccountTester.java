package com.cdac.acts.tester;
import java.util.Scanner;
import com.cdac.acts.AccountClass;
public class AccountTester {
	private static Scanner sc = new Scanner(System.in);
	private static AccountClass [] account = new AccountClass[100];
	private static int cnt = 0;
	
	
	public static void main(String[] args) {
		
		int choice;
		do {
			displayMenu();
			System.out.printf("Please Enter your choice:-> ");
			choice = sc.nextInt();
			sc.nextLine();

			switch(choice) {
				case 1:{
					addAccount();
					break;
				}
				case 2:{
					displayBalance();
					break;
				}
				case 3:{
					withdrad();
					break;
				}
				case 4:{
					transfer();
					break;
				}
				case 5:{
					System.out.println("Exit...");
					break;
				}
				default:{
					System.out.println("Invalid Choice....");
					break;
				}
			}
			
		}while(choice !=5);
		
		sc.close();
	}
	
	private static void displayMenu() {
		System.out.println("*********** Account Management System *************");
		System.out.println("1. Add Acounts");
		System.out.println("2. Display Account Details"); 
		System.out.println("3. Withdraw");
		System.out.println("4. Transfer");
		System.out.println("5. Exit");
	}
	
	private static void addAccount() {
		if(cnt >= account.length) {
			System.out.println("Cannot add more accounts. limit reached.");
			return;
		}
		System.out.println("\n=========== Add New Account ============");
		System.out.println("Enter account holder name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter initial balance: ");
		double balance = sc.nextDouble();
		
		sc.nextLine();
		
		account[cnt++] = new AccountClass(name,balance); 
		
		System.out.println("Acount added successfully!");
	}
	
	private static void displayBalance() {
		System.out.println("\n Please Enter Account Number: ");
		int accNo = sc.nextInt();
		
		AccountClass account = findAccount(accNo);
		if(account != null) {
			System.out.println("\n=== Account Details ===");
            System.out.println(account);
		}else {
			System.out.println("Account not found.");
		}
	}
	
	private static void withdrad() {
		
	}
	private static void transfer() {
		
	}
	private static AccountClass findAccount(int accNo) {
		for(int i=0;i<cnt;i++) {
			if(account[i].getAccNo() == accNo) {
				
				return account[i];
				
			}
		}
		return null;
	}
	
}
