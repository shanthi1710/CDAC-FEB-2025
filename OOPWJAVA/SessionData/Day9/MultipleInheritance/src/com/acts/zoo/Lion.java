package com.acts.zoo;

public interface Lion extends Animal {

	void roar();
	
	default void walk() {
		System.out.println("Lion walking");
	}
}
