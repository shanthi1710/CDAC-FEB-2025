package com.acts.character.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileCopierTester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter Source File Name:");
			String srcFileName = sc.nextLine();
			System.out.println("Enter Destination File Name:");
			String destFileName = sc.nextLine();

			try (//Java App <-BR <-FR <- Text File
					BufferedReader br = new BufferedReader(
							new FileReader(srcFileName));
					// Java App -> PW : Buffered Stream -> FW : Node stream--> Text File
					PrintWriter pw = new PrintWriter(
							new FileWriter(destFileName, true))) {
				//true for append

				String text;
				while((text = br.readLine()) != null) {
					pw.println(text);
				}
				
				//Java 8 Stream: public Stream<String> lines()
//				br.lines() 
//				.forEach(pw::println);

			}catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("*****File Copied successfully.*****");

		}

	}
}
