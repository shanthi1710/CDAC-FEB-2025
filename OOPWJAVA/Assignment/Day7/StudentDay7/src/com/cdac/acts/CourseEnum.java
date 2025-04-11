package com.cdac.acts;

public enum CourseEnum {
	
	PG_DAC("Diploma in Advanced Computing"),
	PG_DESD("Diploma in ESD"),
	PG_VLSI("Diploma in VLSI");
	
	private String value;
	
	private CourseEnum(String value) {
		
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
}
