package com.cdac;

public enum DeptEnum {
	HR("Human Resource Department"),
	IT("Information Technologies Department");
	
private String str;
	
	private DeptEnum(String str) {
		this.str = str;
		
	}
	
	public String getValue() {
		return str;
	}
}




