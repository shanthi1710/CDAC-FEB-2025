package cdac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {

	public static void main(String[] args) {
		try(BufferedReader br = new 
				BufferedReader(new InputStreamReader(System.in));){
			System.out.println("Please enter roll No.");
			String str = br.readLine();
			int rollNo = Integer.parseInt(str);
			System.out.println(rollNo);
		} catch (IOException e) {
			e.printStackTrace();
		}
			 
			
	}

}
