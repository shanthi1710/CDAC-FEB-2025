package com.cdac.acts.bank;

public class SavingAccount extends Account{
	private static final double INTEREST_RATE = 0.03;
	
	public SavingAccount(String accountName, double balance){
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
