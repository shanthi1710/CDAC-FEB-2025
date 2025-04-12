package com.acts.wrapper.tester;


public class WrapperTester {

	public static void main(String[] args) {
		//class hierarchy for  Wrapper classes
		//java.lang.Object <---  java.lang.Number <--- java.lang.Integer/Byte/Double/Float/Long/Short/AtomicInteger/AtomicLong/BigDecimal/BigInteger
		//Boxing and un boxing

		int i = 199;
		// Deprecated method for boxing from int to Integer
		Integer iw = new Integer(i);
	
		//Boxing (int -> Integer )
		Integer iw1 = Integer.valueOf(1234);
			
		//un boxing (Integer -> int) using intValue()
		int i1 = iw1.intValue();
		
		//Auto boxing (int -> Integer ) javac change it to  iw2 = Integer.valueOf(143);
		Integer iw2 = 143;
		
		//Auto un boxing (Integer--->int) javac change it to  i2 = iw2.intValue();
		int i2 = iw2;
		
		//Widening int -> double
		double d1 = i2;
		//Auto boxing with double->Double
		Double dw1 = 100.30;
		
		//Auto Boxing and Up casting from Float to Number. float -> Float -> Number
		Number number1 = 150.250F;
		System.out.println("Class :"+ number1.getClass().getName());
		
		//Auto Boxing and Up casting from Double to Number. double ---> Double --> Number 
		Number number2 = 270.56;
		System.out.println("Class :"+ number2.getClass().getName());
		
		//byte -> Byte -> Number -> Object
		//Object can refer to any data type. Up casting
		byte b = 90;
		Object objecRef  = b;
		System.out.println(objecRef.getClass());
		objecRef = true;
		objecRef = "fghgf";
		objecRef = 'c';
		
		
		
		//int ->Integer->Number-> Object
		Object o = 10;
		System.out.println(o.getClass());
	}

}
