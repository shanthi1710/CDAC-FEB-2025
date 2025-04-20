package com.acts.jvm;

import java.sql.Date;

public class ClassLoaderTester {
	
	public static void main(String[] args) {
		System.out.println("Printing Classloaders");
		System.out.println("App class loader for ClassLoaderTester "+ ClassLoaderTester.class.getClassLoader());
		System.out.println("Parent class loader of ClassLoaderTester "+ ClassLoaderTester.class.getClassLoader().getParent());
		//Below line will print null ( as Bootstrap Class Loader is used)
		//null represents BootStrap class loader
		System.out.println("Super class loader of ClassLoaderTester "+ ClassLoaderTester.class.getClassLoader().getParent().getParent());
		
		System.out.println("\n\nChecking class loaders");
		//Date is not in base module as it in ext i.e java.sql
		System.out.println("java.sql.Date loaded by "+Date.class.getClassLoader());
		System.out.println("java.lang.String loaded by "+ String.class.getClassLoader());
	}
	

}
