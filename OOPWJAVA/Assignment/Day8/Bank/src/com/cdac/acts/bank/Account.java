package com.cdac.acts.bank;
import java.time.LocalDate;
public abstract class Account {
	
	protected int accountNumber;
	protected String accountName;
	protected double balance;
	protected LocalDate doj;
	
	private static int baseAccNo=1;
	
	public Account() {
		this.accountNumber = baseAccNo++;
		System.out.println("Account:Account");
	}
	
	public Account(String accountName,double balance) {
		this.accountNumber = baseAccNo++;
		this.accountName = accountName;
		this.balance = balance;
		this.doj = LocalDate.now();
	}
	
	public abstract double applyInterest();
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", balance=" + balance
				+ ", doj=" + doj + "]";
	}
	
	
	
	
}
