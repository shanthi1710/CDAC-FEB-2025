package com.cdac.acts.impl;
import com.cdac.acts.Account;
public interface AccountProcessor<T extends Account>  {
	 void process(T account);
}
