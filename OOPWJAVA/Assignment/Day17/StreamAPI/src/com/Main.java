package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String>strings = Arrays.asList(
				"apple", "banana", "apple", "orange",
	            "grape", "kiwi", "pear", "banana",
	            "apricot", "avocado", "grapefruit"	 
		);
		System.out.println("Original list:");
        strings.forEach(System.out::println);
        
        System.out.println("Distinct strings:");
        strings.stream()
        .distinct()
        .forEach(System.out::println);
        
        System.out.println("Uppercase strings:");
        strings.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);
        
        System.out.println("Strings starting with 'a':");
        strings.stream()
        .filter(s -> s.startsWith("a"))
        .forEach(System.out::println);
        
        System.out.println("Concatenated string:");
        String concatenated = strings.stream().collect(Collectors.joining());
        
        System.out.println(concatenated);
        
        System.out.println("Strings ending with 'e':");
        strings.stream().filter(s->s.endsWith("e"))
        .forEach(System.out::println);
        
	}

}
