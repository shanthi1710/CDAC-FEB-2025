package com.acts.character.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadKBTester {

	public static void main(String[] args) {
		//System.in -> read in program
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}