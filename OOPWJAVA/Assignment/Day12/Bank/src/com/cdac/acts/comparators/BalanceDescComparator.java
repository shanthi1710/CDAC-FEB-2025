package com.cdac.acts.comparators;

import java.util.Comparator;
import com.cdac.acts.Account;

public class BalanceDescComparator implements Comparator<Account> {
    @Override
    public int compare(Account a1, Account a2) {
        return Double.compare(a2.getBalance(), a1.getBalance());
    }
}