package com.acts.zoo;

public interface Animal {
	default void walk() {
		System.out.println("Animal walking");
	}
}
