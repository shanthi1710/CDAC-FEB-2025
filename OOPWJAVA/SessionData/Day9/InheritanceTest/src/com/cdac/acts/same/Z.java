package com.cdac.acts.same;

public class Z implements Same1, Same2 {

	@Override
	public void method() {
		System.out.println("Z::Method");
	}
	

	@Override
	public void methodSame2() {
		System.out.println("Z::methodSame2");
		
	}

	@Override
	public void methodSame1() {
		System.out.println("Z::methodSame2");
		
	}
	
	public static void main(String[] args) {
		Z z = new Z();
		z.method();
	}

}
