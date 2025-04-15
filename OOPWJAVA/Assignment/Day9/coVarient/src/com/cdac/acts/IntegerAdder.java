package com.cdac.acts;

public class IntegerAdder extends NumberAdder{
	public Integer add(Number a,Number b) {
		return a.intValue()+b.intValue();
	}
}
