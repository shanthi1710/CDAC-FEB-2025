package com.cdac.acts;

public class StaticBlockTester {
	public static void main(String[] args) throws ClassNotFoundException {
		//Load class adn execute static block
		Class.forName("com.cdac.acts.A");
		
		//Load class run static block , run non-static block and create object
		//A a = new A();
		
		// C c = new C();
		 
	}
}
