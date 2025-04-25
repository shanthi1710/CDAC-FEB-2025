package com.tester;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.Apple;

public class Main {

	public static void main(String[] args) {
		List<Apple>apples = Arrays.asList(
				new Apple(150,"Red","Sweet"),
				new Apple(120,"Green","Sour"),
				new Apple(200, "Red", "Sweet"),
		        new Apple(100, "Yellow", "Mild"),
		        new Apple(180, "Green", "Tart") 
		);
		
		System.out.println("Original apples: ");
		apples.forEach(System.out::println);
		
		System.out.println("\n Apples heavier than 150:");
		apples.stream().filter(a->a.getWeight()>150).forEach(System.out::println);
		
		System.out.println("\n Red apples:");
		apples.stream().filter(a->a.getColor().equals("Red"))
		 .forEach(System.out::println);
		
		System.out.println("\nGreen apples heavier than 100:");
		apples.stream()
		.filter(a->a.getColor().equals("Green")&&a.getWeight()>100)
		.forEach(System.out::println);
		
		System.out.println("\n. Red, heavy (150+), sweet apples:");
		apples.stream().filter(a->a.getColor().equals("Red")&&a.getWeight()>150 && a.getTaste().equals("Sweet"))
		.forEach(System.out::println);
		
		System.out.println("\nApples sorted by color:");
		apples.stream()
		.sorted(Comparator.comparing(Apple::getColor))
		.forEach(System.out::println);
		
		System.out.println("\nApples without red ones:");
		apples.stream()
		.filter(a->!a.getColor().equals("Red"))
		.forEach(System.out::println);
		
		System.out.println("\nApples without green ones:");
        apples.stream()
              .filter(a -> !a.getColor().equals("Green"))
              .forEach(System.out::println);
        
        System.out.println("\n Convert to Set:");
        Set<Apple>appleSet=apples.stream().collect(Collectors.toSet());
        appleSet.forEach(System.out::println);
	}

}
