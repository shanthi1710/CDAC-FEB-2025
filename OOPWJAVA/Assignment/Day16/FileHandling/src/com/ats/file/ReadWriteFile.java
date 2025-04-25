package com.ats.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWriteFile {
	
	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in);){
			System.out.println("Enter source file");
			String srFile = sc.next(); 
			System.out.println("Enter destination file");
			String dsFile = sc.next(); 
			
			try(BufferedReader br = new BufferedReader (new FileReader(srFile));
					PrintWriter pw = new PrintWriter(
							new java.io.FileWriter(dsFile, true))){
				String text;
				while((text = br.readLine()) != null) {
					pw.println(text);
					}
				}
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Operation Succesfull!");

}
}

	


