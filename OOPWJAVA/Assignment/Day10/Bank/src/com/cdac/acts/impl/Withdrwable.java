package com.cdac.acts.impl;

import com.cdac.acts.bank.MinBalException;

public interface Withdrwable {
	double withdraw(double amount) throws MinBalException;;
}
