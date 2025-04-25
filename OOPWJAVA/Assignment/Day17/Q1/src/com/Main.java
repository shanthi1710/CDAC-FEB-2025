package com;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Function<String, LocalDate> customStringToDate = dateString -> 
            LocalDate.parse(dateString, customFormatter);

        
        Function<LocalDate, String> customDateToString = date -> 
            date.format(customFormatter);

       
        String dateString = "22/04/2025";
        LocalDate date = customStringToDate.apply(dateString);
        System.out.println("String to LocalDate: " + date);

        String convertedBack = customDateToString.apply(date);
        System.out.println("LocalDate to String: " + convertedBack);
    }
}