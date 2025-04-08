package com.cdac.acts;

public class AccountClass {
	private int accNo;
	private String name;
	private double balance;
	private static int baseAccNo=100;
	
	public AccountClass() {
		this.accNo = baseAccNo++;
		this.name = "";
		this.balance = 0.0;
	}

	public AccountClass(String name, double balance) {
		this.accNo = baseAccNo++;
		this.name = name;
		this.balance = balance;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public double getBal() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposit successful. New balance: " + balance);
		}else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	public void withdraw(double amount) {
		if(amount >0 && amount<=balance) {
			balance -= amount;
			System.out.println("Withdraw successful. New balance: " + balance);
		}else {
			System.out.println("Invalid withdraw amount or Insufficient balance. ");
		}
	}
	
	public void transfer(AccountClass recipient,double amount){
		if(amount >0 && amount<= balance) {
			this.balance -= amount;
			recipient.balance += amount;
			System.out.println("Transfer successfuly.");
			System.out.println("new balance: "+balance);
		}else {
			System.out.println("Insufficient balance.");
		}
	}

	@Override
	public String toString() {
		return "AccountClass [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
}
