package com.cdac.acts.bank;
import com.cdac.acts.impl.Maturable;
public class DepositAccount extends Account implements Maturable{
	
	
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
	
	@Override
    public double calculateMatutyAmount(double amount) {
        
        double interest = amount * 0.08;   
        return amount + interest;
    }
}
