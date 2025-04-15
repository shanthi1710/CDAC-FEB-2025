package com.cdac.acts.Tester;
import com.cdac.acts.*;
public class Main {

	public static void main(String[] args) {
		NumberAdder num = new NumberAdder();
		IntegerAdder num1 = new IntegerAdder();
		Number res1 = num.add(5.5, 4.5);
		System.out.println("NumberAdder result: "+res1);
		
		Integer res2 = num1.add(9,4);
		System.out.println("NumberAdder result: "+res2);
	}
	

}
