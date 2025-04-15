package com.cdac.acts.impl;

import com.cdac.acts.Account;
import java.util.List;

public class AccountPrinter {
	 public void printAccounts(List<? super Account> accounts) {
	        System.out.println("\nAll Accounts:");
	        accounts.forEach(System.out::println);
	 }
}