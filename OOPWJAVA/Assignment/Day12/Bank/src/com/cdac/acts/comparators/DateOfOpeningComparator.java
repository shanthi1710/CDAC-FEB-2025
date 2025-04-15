package com.cdac.acts.comparators;
import java.util.Comparator;
import com.cdac.acts.Account;

public class DateOfOpeningComparator implements Comparator<Account>{
	public int compare(Account a1,Account a2) {
		return a1.getDateOfOpening().compareTo(a2.getDateOfOpening());
	}
}
