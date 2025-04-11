package com.cdac.acts.builder;

public class StringBuilderTest {
public static void main(String[] args) {
	String str = "CDAC ACTS";
	//StringBuilder stringBuilder = "Acts";
	StringBuilder stringBuilder = new StringBuilder();
	//stringBuilder = "ACTS";
	stringBuilder.append("Babu");
	stringBuilder.insert(0,"Mr.");
	stringBuilder.insert(3," ");
	stringBuilder.deleteCharAt(5);
	System.out.println(stringBuilder);
	
	StringBuilder stringBuilder1 = new StringBuilder(str);
	stringBuilder1.replace(4, 5, "Pune");
	System.out.println(stringBuilder1);
	
	if(stringBuilder.equals(stringBuilder1)) {
		System.out.println("Contents are equal");
	} else {
		System.out.println("Contents are NOT equal");
	}
	
	String str2 = stringBuilder.toString();
	System.out.println(str2);
	
	String str5 = "faculty";
	StringBuilder sBuilder = new StringBuilder("faculty");
	
	if(str5.equals(sBuilder)) {
		System.out.println("Faculty contents are equals");
	}
	
	
	
	
	
}
}
