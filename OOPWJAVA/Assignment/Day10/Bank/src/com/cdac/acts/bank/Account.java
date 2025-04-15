package com.cdac.acts.bank;
import java.time.LocalDate;
import com.cdac.acts.impl.Depositable;
import com.cdac.acts.impl.Withdrwable;
public abstract class Account  implements Depositable,Withdrwable {
	 protected static final double MINIMUM_BALANCE = 1000.00;
	@Override
	public double withdraw(double amount) throws IllegalArgumentException {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive");
            }
            
            double newBalance = getBalance() - amount;
            
            if (newBalance < MINIMUM_BALANCE) {
                throw new RuntimeException(String.format(
                    "Cannot withdraw ₹%.2f. Minimum balance ₹%.2f required",
                    amount, MINIMUM_BALANCE));
            }
            
            setBalance(newBalance);
            return getBalance();
        } catch (RuntimeException e) {
            System.err.println("Error: " + e.getMessage());
            return -1;
        }
    }

    @Override
    public double depoiste(double amount) {
    	try {
            if(amount <= 0) {
                throw new IllegalArgumentException("Deposit amount must be positive");
            }
            setBalance(getBalance() + amount);   
            return getBalance();
        } catch (IllegalArgumentException e) {
            System.err.println("Deposit error: " + e.getMessage());
            return -1;
        }  
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
