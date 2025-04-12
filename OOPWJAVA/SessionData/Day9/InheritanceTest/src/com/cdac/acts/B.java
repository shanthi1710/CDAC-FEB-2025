package com.cdac.acts;

public class B extends A implements I1 {

	@Override
	public void methodA1() {
		System.out.println("B::methodA1");
	}
	@Override
	public void methodI1() {
		System.out.println("B::methodI1");
	}
	
	public static void main(String[] args) {
		
	}
	
}
