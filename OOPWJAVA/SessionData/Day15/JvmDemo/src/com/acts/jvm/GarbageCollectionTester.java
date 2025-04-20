package com.acts.jvm;

public class GarbageCollectionTester {
	public static void main(String[] args) {
		Student student1 = new Student(123, "Deepak");
		for( int i =1 ; i< 50000; i++) {
		new Student(124, "Imran");
		System.out.println(i);
		}

		Student student2 = new Student(124, "Imran");
		Student student3 = student2;
		student1 = null; 
		// requesting GC
		System.out.println("1st GC");
		Runtime.getRuntime().gc();
		

		student2 = null; 

		// requesting GC
		System.out.println("2nd GC");
		System.gc();
		

		student3 = null;
		// requesting GC
		System.out.println("3rd GC");
		System.gc();

	}

}
