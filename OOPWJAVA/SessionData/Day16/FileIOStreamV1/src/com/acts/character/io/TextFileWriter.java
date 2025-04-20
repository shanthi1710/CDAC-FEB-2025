package com.acts.character.io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileWriter {

	public static void main(String[] args) {
		String text = "";
		String fileName = "D:/abc.txt";

		//Java App -> PW : -> File
		//Java App -> PW : Buffered Writer -> FW : Node stream -> File
		try(Scanner sc = new Scanner(System.in);
				FileWriter fw = new FileWriter(fileName, true);
		/* PrintWriter pw = new PrintWriter(fileName); */
			) {
			System.out.println("Please enter text:");
			text = sc.next();
			while(!text.equals("exit")) {
				//pw.println(text);
				fw.write(text);
				System.out.println("Pleases enter text:");
				text = sc.next();
			}
			System.out.println("*******Data writtern to file*****");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		System.out.println("*****Graceful execution of main*****");
	}
}