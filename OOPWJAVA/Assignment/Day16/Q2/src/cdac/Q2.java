package cdac;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter directory path(eg., D:/myfile): ");
		 String dirPath = sc.nextLine().trim();
		 
		 System.out.println("Enter filename(e.g.,data.txt): ");
		 String fileName = sc.nextLine().trim();
		 
		 String fullPath = dirPath + File.separator + fileName;
		 
		 File file = new File(fullPath);
		 
		 try {
			 File parentDir = file.getParentFile();
			 if(parentDir !=null && !parentDir.exists()) {
				 boolean dirsCreated = parentDir.mkdir();
				 if(dirsCreated) {
					 System.out.println("Created parent directories");
				 }
			 }
			 
			 //create the file if it doesn't exist
			 if(file.createNewFile()) {
				 System.out.println("File created successfully at: "+fullPath);
			 }else {
				 System.out.println("File already exists at: "+fullPath);
				 
			 }
		 }catch(IOException e) {
			 
			 System.err.println("Error creating file: "+e.getMessage());
		 }finally {
			 sc.close();
		 }
		 
		 
		 
		 
		 
	}

}
