package com.cdac.acts;
import java.util.Scanner;
public class String1 {
	private static Scanner sc = new Scanner(System.in);
	
	public static boolean wordPresent(StringBuilder text,String word) {
		if(text==null || word==null || word.isEmpty()) {
			return false;
		}
		int wl = word.length();
		int tl = text.length();
		
		if(wl>tl) {
			return false;
		}
		for(int i=0;i<=tl-wl;i++) {
			boolean match = true;
			for(int j = 0;j<wl;j++) {
				if(text.charAt(i+j)!=word.charAt(j)) {
					match = false;
					break;
				}
			}
			if(match) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter your text:->");
		StringBuilder text = new StringBuilder(sc.nextLine());
		System.out.println("Enter your word :->");
		String word = sc.nextLine();
		System.out.println("Is "+word+" present "+wordPresent(text,word));
	}

}
