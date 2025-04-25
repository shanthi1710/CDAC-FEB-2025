package com.cdac.acts;

import java.util.Comparator;

public class DateComparator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getDate().compareTo(o2.getDate());
	}

}
