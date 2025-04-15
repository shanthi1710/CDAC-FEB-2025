package com.cdac.acts.impl;

import com.cdac.acts.Account;
import java.util.List;

public interface AccountOperations {
	void addAccount(Account account);
	List<Account>getAllAccounts();
}
