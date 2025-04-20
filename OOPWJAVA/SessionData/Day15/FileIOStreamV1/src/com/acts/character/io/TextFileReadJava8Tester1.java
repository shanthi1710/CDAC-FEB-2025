package com.acts.character.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileReadJava8Tester1 {

	public static void main(String[] args) {
		System.out.println("Enter file name along with path to read data");
		// This try to close Scanner automatically
		try (Scanner sc = new Scanner(System.in)) { 
			String fileName = sc.nextLine();
			//Java App <- BR <- FR <-Text File
			try (BufferedReader br = new BufferedReader(
					new FileReader(fileName))) {
				//Getting Stream of Strings: Stream<String>
				br.lines() 
				.filter(s -> s.length() > 20)
				.map(String :: toLowerCase)
				.forEach(System.out::println);

			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("*****File read successfuly*****");

		}
	}

}
