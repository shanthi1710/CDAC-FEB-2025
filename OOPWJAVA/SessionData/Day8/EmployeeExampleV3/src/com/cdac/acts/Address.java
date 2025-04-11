package com.cdac.acts;

public class Address {
	
	private String line1;
	private String line2;
	private String landmark;
	private String pin;
	
	public Address() {
	}

	public Address(String line1, String line2, String landmark, String pin) {
		this.line1 = line1;
		this.line2 = line2;
		this.landmark = landmark;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 
				+ ", line2=" + line2 
				+ ", landmark=" + landmark 
				+ ", pin=" + pin + "]";
	}

}
