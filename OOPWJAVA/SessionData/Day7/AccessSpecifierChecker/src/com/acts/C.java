package com.acts;

public class C  extends B{
	private String cPri;
	protected String cPro;
	String cDef;
	public String cPub;
	
	public void cMethod() {
		B b = new B();
		System.out.println(b.bPub);
		System.out.println(b.bPri);
		System.out.println(b.bPro);
		System.out.println(b.bDef);
	}
}
