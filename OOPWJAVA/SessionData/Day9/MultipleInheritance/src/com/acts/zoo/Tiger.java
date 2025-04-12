package com.acts.zoo;

public interface Tiger extends Animal {
	void sleep();
	default void walk() {
		System.out.println("Tiger walking");
	}
}
