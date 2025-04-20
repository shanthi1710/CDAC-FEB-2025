package com.acts.character.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadKBTester {

	public static void main(String[] args) {
		//System.in -> read in program
		try(BufferedReader br = new 
				BufferedReader(new InputStreamReader(System.in));){
			System.out.println("Please enter roll No.");
			String str = br.readLine();
			int rollNo = Integer.parseInt(str);
			System.out.println(rollNo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}