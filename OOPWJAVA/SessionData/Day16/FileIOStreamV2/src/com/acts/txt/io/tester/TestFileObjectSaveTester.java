package com.acts.txt.io.tester;

import static com.acts.txt.io.util.DataUtils.getBooksSet;

import java.io.IOException;
import java.util.Scanner;

import com.acts.txt.io.util.FileIOUtils;


public class TestFileObjectSaveTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name:");
			String fileName = sc.nextLine();
			FileIOUtils.saveBooksData(getBooksSet(), fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("*****File written successfully*****");
	}
}
