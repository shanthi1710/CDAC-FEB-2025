package cdac;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Q1{
	public static void main(String[] args) {
		//create file code 
		File[] files = {
				new File("D:/MyText1.txt"),
				new File("D:/MyText2.txt"),
				new File("D:/MyText3.txt"),
				new File("D:/MyText4.txt"),
				new File("D:/MyText5.txt")	
		};
		boolean file = false;
		try {
			for(File x:files) {
				if(!x.exists()) {
					x.createNewFile();
					file = true;
				}
				System.out.println("File Path: "+x.getPath());
			}
			if(file) {
				System.out.println("\n files created successfully");
			}else {
				System.out.println("\nFiles already exist");
			}
		}catch (IOException e) {
            System.err.println("Error creating files: " + e.getMessage());
        }
		
		//printing file directory
		
		for(File x:files) {
			System.out.println("\nFile path "+x.getPath());
			if(x.isDirectory()) {
				String[] names = x.list();
				System.out.println(Arrays.toString(names));
				String [] arr = x.list((dir, fileName) -> fileName.endsWith(".ini"));
				System.out.println(Arrays.toString(arr));
				
				 arr = x.list((dir, fileName) -> fileName.startsWith("Micro"));
				System.out.println(Arrays.toString(arr));
			}
		}
	}
	
	
}