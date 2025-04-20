package com.acts.character.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileReadJava8Tester {

	public static void main(String[] args) {
		System.out.println("Enter full file name:");
		// This try to close Scanner automatically
		try (Scanner sc = new Scanner(System.in)) {
			
			String strFileName =  sc.nextLine();
			///Java App <- BR <- FR <- Text file
			try(BufferedReader br = new BufferedReader(
					new FileReader(strFileName))) {
				//Java 8 Stream: public Stream<String> lines()
				//get stream of Strings: Stream<String>
				br.lines() 
				.forEach(System.out::println);

			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("*****File read successfully*****");
		}
	}

}
