package com.acts.bank.tester;

import com.acts.bank.Account;
import com.acts.bank.SavingAccount;
import com.acts.bank.exception.MinBalanceException;

public class AccountTester {
	public static void main(String[] args) {
		Account account = new SavingAccount(123456, "Deepak", 2.5);
		System.out.println(account.getBalance());
		account.deposit(2000);
		System.out.println(account.getBalance());
		try {
			account.withdraw(500000000);
		} catch (MinBalanceException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(account.getBalance());
		
		 new SavingAccount(123456, "Deepak", 2.5);
		
	}

}
