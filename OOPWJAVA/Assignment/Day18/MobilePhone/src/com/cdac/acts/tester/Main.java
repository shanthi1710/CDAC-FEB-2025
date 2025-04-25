// com.cdac.acts.tester.Main.java
package com.cdac.acts.tester;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.cdac.acts.MobilePhone;

public class Main {
    public static void main(String[] args) {
      
        List<MobilePhone> phones = Arrays.asList(
            new MobilePhone("SN001", "Samsung", "Android", "Black", 45000, 8, 175),
            new MobilePhone("SN002", "Apple", "iOS", "White", 85000, 6, 162),
            new MobilePhone("SN003", "OnePlus", "Android", "Blue", 55000, 12, 196),
            new MobilePhone("SN004", "Apple", "iOS", "Black", 75000, 4, 148),
            new MobilePhone("SN005", "Xiaomi", "Android", "Red", 22000, 6, 185),
            new MobilePhone("SN006", "Google", "Android", "White", 65000, 8, 168)
        );

         
        Map<Boolean, List<MobilePhone>> partitionedPhones = phones.stream()
            .collect(Collectors.partitioningBy(p -> p.getOs().equalsIgnoreCase("Android")));
        
        System.out.println("Android Phones:");
        partitionedPhones.get(true).forEach(System.out::println);
        
        System.out.println("\niOS Phones:");
        partitionedPhones.get(false).forEach(System.out::println);

         
        System.out.println("\nPhones sorted by color and then weight:");
        phones.stream()
            .sorted(java.util.Comparator.comparing(MobilePhone::getColor)
                .thenComparing(MobilePhone::getWeight))
            .forEach(System.out::println);

         
        Set<MobilePhone> phoneSet = phones.stream()
            .collect(Collectors.toSet());
        
        System.out.println("\nSet of phones:");
        phoneSet.forEach(System.out::println);

         
        System.out.println("\nFiltered results:");
        
         
        System.out.println("\nApple phones:");
        phones.stream()
            .filter(p -> p.getBrand().equalsIgnoreCase("Apple"))
            .forEach(System.out::println);
        
         
        System.out.println("\nAndroid phones with 8GB RAM or more:");
        phones.stream()
            .filter(p -> p.getOs().equalsIgnoreCase("Android") && p.getRam() >= 8)
            .forEach(System.out::println);
        
         
        System.out.println("\nWhite colored phones:");
        phones.stream()
            .filter(p -> p.getColor().equalsIgnoreCase("White"))
            .forEach(System.out::println);
        
         
        System.out.println("\nPhones between 30000 and 60000:");
        phones.stream()
            .filter(p -> p.getPrice() >= 30000 && p.getPrice() <= 60000)
            .forEach(System.out::println);
        
    
        System.out.println("\nPhones lighter than 170g:");
        phones.stream()
            .filter(p -> p.getWeight() < 170)
            .forEach(System.out::println);
    }
}