package com.ats.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadAssignment {
	public static void main(String []args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		String text = "";
		System.out.print("Enter File: ");
		String file = sc.next();
		try(BufferedReader br = new BufferedReader(new FileReader(file));
				PrintWriter pw = new PrintWriter(System.out)){	
			File file1 = new File(file);
			if(file1.exists()) {
				while((text = br.readLine()) != null) {
					pw.println(text);
				}
			}
			
		}
		sc.close();
	}
}
