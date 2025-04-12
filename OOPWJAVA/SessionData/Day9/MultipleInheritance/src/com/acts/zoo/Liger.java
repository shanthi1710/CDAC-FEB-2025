package com.acts.zoo;

public class Liger implements Lion, Tiger {


	@Override
	public void sleep() {
		System.out.println("Liger Sleeping");
		
	}

	@Override
	public void roar() {
		System.out.println("Liger Roaring");
		
	}

	@Override
	public void walk() {
		System.out.println("Liger walking");
	}


}
