package com.cdac.acts;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class AccountTester {
	private static Scanner sc = new Scanner(System.in);
	private static List<Account> accountList = new CopyOnWriteArrayList<Account>();
	

	public static void main(String[] args) throws AccountNotFoundException, MinBalException {
		int choice;
		do {
		System.out.println("*******MENU*******");
		System.out.println("1.Add account");
		System.out.println("2.Print all account");
		System.out.println("3.Details for specific account");
		System.out.println("4.Fund transfer");
		System.out.println("5.Remove account");
		System.out.println("6.Apply Interest");
		System.out.println("7.Sort by Account no(ascending)");
		System.out.println("8.Sort by Account account opening date");
		System.out.println("0.Exit");
		
		
		System.out.println("Enter choice");
		choice = sc.nextInt();
		switch(choice) {
		case 1: addAccount();break;
		case 2: printAllAccount();break;
		case 3: detailsforspecificaccount();break;
		case 4: fundTransfer();break;
		case 5: removeAccount();break;
		case 6: applyInterest();break;
		case 7: sortByAccNo();break;
		case 8: sortAccBtOpeningDate();break;
		case 0: System.out.println("Exist");break;
		default: System.out.println("Invalid Input");
		}
		}while(choice != 0);
		
	
	}


	

	private static void sortByAccNo() {
		Collections.sort(accountList);
		printAllAccount();
	}




	private static void sortAccBtOpeningDate() {
		Collections.sort(accountList, new DateComparator());
		printAllAccount();
	}




	private static void applyInterest() {
		for(Account a: accountList) {
			System.out.println(a);
			System.out.println("Interest(3%): " + a.getBalance() * 1.03);
		}
		
	}




	private static void removeAccount() throws AccountNotFoundException {
		System.out.println("Enter your account number");
		Integer giverAccNo = sc.nextInt();
		Boolean found = false;
		for(Account a: accountList) {
			if(giverAccNo == a.getAccNo()) {
				accountList.remove(a);
				found = true;
			}
		}
		if(false == found) {
			throw new AccountNotFoundException("Account not found!");
		}
	}




	private static void fundTransfer() throws AccountNotFoundException, MinBalException {
		System.out.println("Enter your account number");
		Integer giverAccNo = sc.nextInt();
		Boolean found = false;
		for(Account a: accountList) {
			if(giverAccNo == a.getAccNo()) {
				System.out.println("Enter reciever's account number");
				Integer recieverAccNo = sc.nextInt();
				for(Account b: accountList) {
					if(recieverAccNo == b.getAccNo()) {
						System.out.println("Enter amount you want to transfer");
						Double amt = sc.nextDouble();
						if(a.getBalance() - amt > 1000) {
							a.setBalance(a.getBalance() - amt);
							b.setBalance(b.getBalance() + amt);
							found = true;
						} 
					} 
				}
			} 
		}
		if(found != true) {
			throw new AccountNotFoundException("Account not Found!");
		}
		
		
		
		
		
	}

	


	private static void detailsforspecificaccount() throws AccountNotFoundException {
		System.out.println("Enter your account number");
		Integer acc = sc.nextInt();
		for(Account a: accountList) {
			if(acc == a.getAccNo()) {
				System.out.println(a);
			}
		}
		
	}



	private static void printAllAccount() {
		for(Account a: accountList) {
			System.out.println(a);
		}	
		}


	private static void addAccount() {
		System.out.println("Enter Account Details");
		sc.nextLine();
		System.out.println("Emter Account holder name");
		String name = sc.nextLine();
		System.out.println("Emter Account balance");
		Double balance = sc.nextDouble();
		System.out.println("Emter Account opening date");
		String date = sc.next();
		LocalDate accOpeningDate = LocalDate.parse(date);
		accountList.add(new Account(name, accOpeningDate, balance));
	}
	

}
