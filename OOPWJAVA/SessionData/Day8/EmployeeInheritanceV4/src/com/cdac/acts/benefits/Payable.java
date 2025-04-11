package com.cdac.acts.benefits;
//Interface with set of behavior
//Interface with only one abstract method is called as Function Interface
//SAM type -> Single Abstract Method
//@FunctionalInterface
public interface Payable {
	//Vars are public static final by default
	//int EMP_ID_START = 100;
	//Methods are public by default
	//def can be optional 
	double calculateSalary();
	default double getBonus() {
		return 0.0;
	}
}
