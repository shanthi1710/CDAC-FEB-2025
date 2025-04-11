package com.acts;

public class EnumTester {
	public static void main(String[] args) {
		CourseEnum courseEnum = CourseEnum.PG_DAC;
		System.out.println(courseEnum);
		System.out.println(CourseEnum.PG_DAC);
		System.out.println(CourseEnum.PG_DAC.ordinal());
		System.out.println(CourseEnum.valueOf("PG_DAC"));
		
		CourseEnum2 courseEnum2 = CourseEnum2.PG_VLSI;
		System.out.println(courseEnum2);
		System.out.println(courseEnum2.PG_DAC);
		System.out.println(courseEnum2.PG_VLSI.getValue());
		System.out.println(CourseEnum.valueOf("PG_DAC"));
	}
}
