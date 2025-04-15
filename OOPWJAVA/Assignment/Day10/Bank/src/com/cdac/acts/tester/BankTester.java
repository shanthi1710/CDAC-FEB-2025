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
				depositAmount();
				break;
			}
			case 3:{
				withdrawAmount();
				break;
			}
			case 4:{
				applyInterestToAll();
				break;
			}
			case 5:{
				calculateMaturity();
				break;
			}
			case 6:{
				
				displayAllAccount();
				break;
			}
			case 7:{
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
	        System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
	        System.out.println("4. Apply Interest to All Accounts");
	        System.out.println("5. Calculate Maturity Amount (Deposit Accounts)");
	        System.out.println("6. Display All Accounts");
	        System.out.println("7. Exit");
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
	private static void calculateMaturity() {
		System.out.println("\nEnter Deposit Account number:->");
		int accNo = sc.nextInt();
		System.out.println("Enter principal amount: ");
		double amount = sc.nextDouble();
		sc.nextLine();
		
		Account account = findAccount(accNo);
		if(account != null && account instanceof DepositAccount ) {
			DepositAccount dep = (DepositAccount)account;
			double maturityAmount = dep.calculateMatutyAmount(amount);
			System.out.printf("Maturity amount for %.2f after n1 year :%.2f\n",amount,maturityAmount);
		}else {
			System.out.println("Account not found or not a Deposit Account!");
		}
	}
	private static void depositAmount() {
		System.out.print("\nEnter account number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        Account account = findAccount(accNo);
        if (account != null) {
            double newBalance = account.depoiste(amount);
            if (newBalance != -1) {
                System.out.printf("Deposit successful! New balance: %.2f\n", newBalance);
            } else {
                System.out.println("Invalid deposit amount!");
            }
        } else {
            System.out.println("Account not found!");
        }
	}
	private static void withdrawAmount() {
		 System.out.print("\nEnter account number: ");
	        int accNo = sc.nextInt();
	        System.out.print("Enter amount to withdraw: ");
	        double amount = sc.nextDouble();
	        sc.nextLine();

	        Account account = findAccount(accNo);
	        if (account != null) {
	            double newBalance = account.withdraw(amount);
	            if (newBalance != -1) {
	                System.out.printf("Withdrawal successful! New balance: %.2f\n", newBalance);
	            } else {
	                System.out.println("Invalid withdrawal amount or insufficient balance!");
	            }
	        } else {
	            System.out.println("Account not found!");
	        }
	}
	private static Account findAccount(int accNo) {
		for(int i=0;i<cnt;i++)
		{
			if(accounts[i].getAccountNumber()==accNo) {
				return accounts[i];
			}
		}
		return null;
	}
	
	

}
