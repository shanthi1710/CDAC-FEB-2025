package com.acts;

public enum CourseEnum2 {
	PG_DAC("Diploma in Advanced Computing"),
	PG_DESD("Diploma in ESD"),
	PG_VLSI("Diploma in VLSI");
	
	private String value;
	private CourseEnum2(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}
