package com.cdac.acts.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.cdac.acts.Account;
import com.cdac.acts.impl.AccountOperations;
import com.cdac.acts.impl.AccountPrinter;
import com.cdac.acts.impl.AccountProcessor;


public class Main implements AccountOperations{
	private static Scanner sc = new Scanner(System.in);
	private final List<Account>accounts=new ArrayList<>();
	
	@Override
	 public void addAccount(Account account) {
        accounts.add(account);
    }
	@Override
	public List<Account>getAllAccounts(){
		return accounts;
	}
	public List<Account>getUnmodifiableAccounts(){
		return Collections.unmodifiableList(accounts);
	}
	public <T extends Account> void processAccount(List<T>accounts,AccountProcessor<T> processor) {
		accounts.forEach(processor::process);
	}
	
	public static void main(String[] args) {
		 int choice = 0;
		 do {
			 display();
			 System.out.println("Enter your choice:-> ");
			 try {
				 choice=sc.nextInt();
				 sc.nextLine();
				 
				 switch(choice) {
				 	case 1:{
				 		addAccount();
				 		break;
				 	}
				 	case 2:{
				 		displayAllAccount();
				 		break;
				 	}
				 	case 3:{
				 		unmodifiable();
				 		break;
				 	}
				 	case 4:{
				 		break;
				 	}
				 	case 5:{
				 		upperBound();
				 		break;
				 	}
				 	case 6:{
				 		lowerBound();
				 		break;
				 	}
				 	case 7:{
				 		System.out.println("Exit...");
				 		System.exit(0);
				 		sc.close();
				 		break;
				 	}
				 	default:{
				 		System.out.println("Envalid choice...");
				 	}
				 
				 }
			 }catch(Exception e) {
				 System.out.println("Error: "+e.getMessage());
				 sc.nextLine();
			 }
			 
		 }while(choice !=7);
	}
	
	private static void display() {
		 System.out.println("\nMenu:");
         System.out.println("1. Add account");
         System.out.println("2. Print all accounts");
         System.out.println("3. Create unmodifiable from existing list");
         System.out.println("4. Use Upper bound");
         System.out.println("5. Use Lower bound");
         System.out.println("7. Exit");
	}
	
	private static void addAccount() {
		System.out.print("Enter account number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter account name: ");
        String accName = sc.nextLine();
        System.out.print("Enter opening date (YYYY-MM-DD): ");
     
        LocalDate date = LocalDate.parse(sc.nextLine());
        
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        
        try {
            Account acc = new Account(accNo, accName, date, balance);
            Main bankingSystem = new Main();
            bankingSystem.addAccount(acc);
            System.out.println("Account added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
	
	private static void displayAllAccount() {
		Main bankingSystem = new Main();
	    AccountPrinter printer = new AccountPrinter();
	    printer.printAccounts(bankingSystem.getAllAccounts());
	}
	
	private static void unmodifiable() {
		Main bankingSystem = new Main();
	    List<Account> unmodifiable = bankingSystem.getUnmodifiableAccounts();
	    System.out.println("Created unmodifiable list with " + unmodifiable.size() + " accounts");
	    try {
	        unmodifiable.add(new Account("999", "Test", LocalDate.now(), 2000));
	    } catch (UnsupportedOperationException e) {
	        System.out.println("Cannot modify unmodifiable list (expected behavior)");
	    }
	}
	
	private static void upperBound() {
		 Main bankingSystem = new Main();
		    if (!bankingSystem.getAllAccounts().isEmpty()) {
		        bankingSystem.processAccount(bankingSystem.getAllAccounts(), 
		            account -> System.out.println("Processing: " + account.getAccNo()));
		    } else {
		        System.out.println("No accounts to process");
		    }
	}
	
	private static void lowerBound() {
		  Main bankingSystem = new Main();
		    AccountPrinter printer = new AccountPrinter();
		    List<Object> objects = new ArrayList<>();
		    objects.addAll(bankingSystem.getAllAccounts());
		    printer.printAccounts(objects);
	}
}
