package com.acts.character.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TextFileWriteTester {

	public static void main(String[] args) {
		String data = "";
		String fileName = "abc.txt";

		// Java App <- BufferedReader <- InputStreamReader <- System.in 
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // Keyboard
				PrintWriter pw = new PrintWriter(new FileWriter(fileName, true), true)) {// File
			//Java App -> PW : Buffered -> FW : Low level/Node stream -> File
			System.out.println("Please enter text:");
			data = br.readLine();
			while(!data.equals("exit")) {
				pw.println(data);
				System.out.println("Please enter text:");
				data = br.readLine();
			}
			System.out.println("*******Data writtern to file*****");

		} catch (IOException e) {
			//e.printStackTrace();
			System.err.println(e);
		}
		System.out.println("*****Graceful execution of main*****");
	}
}