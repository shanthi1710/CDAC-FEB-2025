package com.cdac.acts.comparators;

import java.util.Comparator;
import com.cdac.acts.Account;

public class AccountNoDescComparator  implements Comparator<Account>{
	@Override
	public int compare(Account a1,Account a2) {
		return Integer.compare(a2.getAccNo(), a1.getAccNo());
	}
}
