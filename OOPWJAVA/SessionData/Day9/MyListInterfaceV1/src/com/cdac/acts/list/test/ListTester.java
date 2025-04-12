package com.cdac.acts.list.test;

import java.util.Scanner;

import com.cdac.acts.list.MyList;
import com.cdac.acts.list.impl.FixedList;
import com.cdac.acts.list.impl.GrowableList;

public class ListTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//		MyList fixedList  = new FixedList();
		//		
		//		for( int i = 0;  i <= 10; i++) {
		//		System.out.println("Please eneter element");
		//		int ele = sc.nextInt();
		//		fixedList.insert(ele);
		//		}


		MyList growableList  = new GrowableList();

		for( int i = 0;  i <= 10; i++) {
			System.out.println("Please eneter element");
			int ele = sc.nextInt();
			growableList.insert(ele);
		}
		sc.close();
	}

}
