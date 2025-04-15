package com.cdac.acts.bank;
import java.time.LocalDate;
import com.cdac.acts.impl.Depositable;
import com.cdac.acts.impl.Withdrwable;
public abstract class Account  implements Depositable,Withdrwable {
	@Override
    public double withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {  
            setBalance(getBalance() - amount);   
            return getBalance();   
        }
        return -1;  
    }

    @Override
    public double depoiste(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);   
            return getBalance();  
        }
        return -1;  
    }

    
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
	public void  setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", balance=" + balance
				+ ", doj=" + doj + "]";
	}
}
