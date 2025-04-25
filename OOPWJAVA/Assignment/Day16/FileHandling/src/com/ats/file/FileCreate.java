package com.ats.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {

	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter File: ");
			String str = sc.next();
			
		File file = new File(str);
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("**************File Created****************");
		} else {
			System.out.println("**************File Exists****************");
		}

	}
	}
}
