package cdac;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Scource file name: ");
			String srcFileName = sc.nextLine();
			System.out.println("Enter Destination file name: ");
			String desFileName = sc.nextLine();
			
			try(BufferedReader br = new BufferedReader(new FileReader(srcFileName));
					PrintWriter pw = new PrintWriter(new FileWriter( desFileName,true ))){
				String text;
				while((text=br.readLine())!=null) {
					pw.println(text);
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("*****File Copied successfully.*****");
		}
	}

}
