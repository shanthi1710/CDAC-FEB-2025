package com.cdac.acts;

public class DeadAndUnreachableCode {
	public static void main(String ... args) {
		int a = 20;
		//Dead code
		a = a;
		if(true) {
			System.out.println("Inside if");
		} else {
		System.out.println("inside else");
		}
		
		while(true) {
			System.out.println("Inside while");
		} 
		//Unreachable
	//	System.out.println("Inside if");
		
	}
}
