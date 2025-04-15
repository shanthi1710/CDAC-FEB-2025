package com.cdac.acts.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cdac.acts.Student;
//import java.util.List;

public class CollectionTester {

	public static void main(String[] args) {

//		ArrayList al = new ArrayList();
//		al.add(10);
//		al.add(10.30);
//		al.add("1DD");
//		System.out.println(al);
		
		
//		ArrayList<int> al = new ArrayList<int>();
//		al.add(10);
//		al.add(10.30);
//		al.add("1DD");
//		System.out.println(al);
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(10);
//		al.add(10.30);
//		al.add("1DD");
//		System.out.println(al);
		
		
//		//ArrayList<> al = new ArrayList<Integer>();
//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(10);
//		System.out.println(al);
		
//		ArrayList<Integer> arrayList = new ArrayList<>(10);
//		System.out.println(arrayList.size());
	
//		ArrayList<Integer> arrayList = new ArrayList<>();
//		arrayList.add(10);
//		arrayList.add(Integer.valueOf(20));
//		System.out.println(arrayList);
		
//		ArrayList<String> arrayList = new ArrayList<>();
//		arrayList.add("Hi");
//		arrayList.add("hello");
//		System.out.println(arrayList);
		
//		List<String> arrayList = new ArrayList<>();
//		arrayList.add("Hi");
//		arrayList.add("hello");
//		System.out.println(arrayList);
		
//		String [] arr = {"Raja", "Rani","Mani"};
//		System.out.println(Arrays.toString(arr));
//		
//		List<String> arrayList = Arrays.asList(arr);
//		System.out.println(arrayList);

		List<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student("Ravi", "DAC", 101));
		arrayList.add(new Student("Ravi1", "DAC", 102));
		arrayList.add(new Student("Ravi2", "DAC", 105));
		arrayList.add(new Student("Ravi3", "DAC", 103));
		System.out.println(arrayList);
	}

}
