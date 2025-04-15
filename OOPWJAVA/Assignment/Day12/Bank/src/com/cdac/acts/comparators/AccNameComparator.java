package com.cdac.acts.comparators;

import java.util.Comparator;
import com.cdac.acts.Account;

public class AccNameComparator implements Comparator<Account>{
	@Override
	public int compare(Account a1,Account a2) {
		return a1.getAccName().compareTo(a2.getAccName());
	}
	
}
