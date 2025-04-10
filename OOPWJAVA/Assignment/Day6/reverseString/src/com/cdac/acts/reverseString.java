package com.cdac.acts;
import java.util.Scanner;
import java.util.Stack;
public class reverseString {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a string to reverse:->");
		String input = sc.nextLine();
		
		//method 1
		String reversed1 = reverseWithStringBuilder(input);
		System.out.println("Reversed String:-> "+reversed1);
		
		//method 2
		String reversed2 = reverseWithCharArray(input);
		System.out.println("Reversed String:-> "+reversed2);
		
		//method 3
		String reversed3 = reverseWithRecursion(input);
		System.out.println("Reversed String:-> "+reversed3);
		
		//method 4
		String reversed4 = reverseWithStack(input);
		System.out.println("Reversed String:-> "+reversed4);
	}
	public static String reverseWithStringBuilder(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	
	public static String reverseWithCharArray(String str) {
		char []charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length-1;
		while(left<right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			
			left++;
			right--;
		}
		return new String(charArray);
	}
	public static String reverseWithRecursion(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return reverseWithRecursion(str.substring(1))+str.charAt(0);
	}
	
	public static String reverseWithStack(String str) {
		Stack<Character>stack= new Stack<>();
		for(char x:str.toCharArray()) {
			stack.push(x);
		}
		StringBuilder reversed = new StringBuilder();
		while(!stack.isEmpty()){
			reversed.append(stack.pop());
		}
		return reversed.toString();
	}
}
