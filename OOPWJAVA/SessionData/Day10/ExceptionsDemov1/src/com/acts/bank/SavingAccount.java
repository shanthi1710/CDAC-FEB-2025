package com.acts.bank;

import java.io.IOException;

import com.acts.bank.exception.MinBalanceException;

public class SavingAccount extends Account{

	private double interestRate;

	public static final double MIN_BALANCE_SAVINGS = 5000.00;

	public SavingAccount(long accNo, String accName, double ir) {
		super(accNo, accName);
		this.interestRate = ir;
	}

	@Override
	public double withdraw(double amount) throws MinBalanceException {
		if (getBalance() < MIN_BALANCE_SAVINGS) {
//			MinBalanceException mbe = new MinBalanceException("Min balance in Saving account");
//			throw mbe;
			throw new MinBalanceException("Min balance in Saving account");
		}
		setBalance(getBalance() - amount);
		return getBalance();
	}

}
