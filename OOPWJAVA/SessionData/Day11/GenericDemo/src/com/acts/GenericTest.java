package com.acts;

public class GenericTest {
	public static void main(String[] args) {
		GenericType<Integer> type =  new GenericType<>(10);
		type.setNum1(100);
		System.out.println(type);
		
		GenericType<Double> type1 =  new GenericType<>(10.20);
		System.out.println(type1);
		
		
		GenericType<String> type2 =  new GenericType<>("Hello");
		System.out.println(type2);
		type2.setNum1("Did you do practice?");
		System.out.println(type2);
		
	}

}
