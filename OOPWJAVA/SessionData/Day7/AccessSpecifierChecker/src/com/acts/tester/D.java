package com.acts.tester;

import com.acts.B;

public class D  extends B{
	private String dPri;
	protected String dPro;
	String dDef;
	public String dPub;
	
	public void dMethod() {
		
		System.out.println(bPri);
		System.out.println(bPro);
		System.out.println(bDef);
		System.out.println(bPub);
		
		B b = new B();
		System.out.println(b.bPub);
		System.out.println(b.bPri);
		System.out.println(b.bPro);
		System.out.println(b.bDef);
	}
}
