package com.cdac.acts.tester;

import java.util.Arrays;

import com.cdac.acts.Student;

public class StudentTester {

	public static void main(String[] args) {

		Student s = new Student(123, "Kriti", 1241542);
		//s.printData();
		System.out.println(s);
		
		Student arr[] = new Student[5];
		arr[0] = new Student(123123, "Ganesh", 4232340);
		System.out.println(arr[0]);
		
		
		int arr1[] = new int []{1, 2, 3,4};
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		Student arr2[] = new Student[] {new Student(), new Student(), 
				new Student(2312321, "Kareena", 12121)};
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
	}

}
