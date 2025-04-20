package com.acts.character.io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class TextFileTester {

	public static void main(String[] args) {

		File file = new File("D:/MyText.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("File created successfully");
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
		
//		if(file.isDirectory()) {
//			//String[] names = file.list();
//			//System.out.println(Arrays.toString(names));
//			String [] arr = file.list((dir, fileName) -> fileName.endsWith(".ini"));
//			System.out.println(Arrays.toString(arr));
//			
//			 arr = file.list((dir, fileName) -> fileName.startsWith("Micro"));
//			System.out.println(Arrays.toString(arr));
//		}
		
		System.out.println(file.getPath());
	}

}
