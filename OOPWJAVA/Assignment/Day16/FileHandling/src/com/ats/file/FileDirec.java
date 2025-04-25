package com.ats.file;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileDirec {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("File Name: ");
			String str = sc.next();
		
		
		
		File file = new File(str);
		if(file.exists()) {
		if(file.isDirectory()) {
			System.out.println("It is a directory!");
		//System.out.println(file.listFiles());
            List<File> list = Arrays.asList(file.listFiles());
            for(File f: list) {
            	System.out.println(f);
            }
			//System.out.println(Arrays.toString(file.list()));
			} else {
			System.out.println("Is not a directory");
		}} else {
			System.out.println("File doesnt exsist!");
		}
		}
	}
}
