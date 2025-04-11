package com.cdac.acts.bank;

public class DepositAccount extends Account {
	private static final double INTEREST_RATE = 0.08;
	
	public DepositAccount(String accountName,double balance){
		super(accountName,balance);
	}
	@Override
	public double applyInterest() {
		double interest = balance*INTEREST_RATE;
		balance += interest;
		return interest;
	}
	@Override
	public String toString() {
		return super.toString() + "\nAccount Type: Saving Account "+ "\nInterest Rate: "+(INTEREST_RATE * 100)+"%";
	}
}
