package com.cdac.acts;

public class StringAndStringBuilder {
    public static void main(String[] args) {
        
        String text = "   Hello, Java World!   ";
        String emptyText = "";
        String searchText = "Java";
        String replaceText = "Python";
        String anotherText = "HELLO, JAVA WORLD!";
        String csvText = "apple,orange,banana";
        
        
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder("ABC");
        StringBuilder sb5 = new StringBuilder("delete this");
        StringBuilder sb6 = new StringBuilder("reverse me");
        StringBuilder sb8 = new StringBuilder("replace this");
        StringBuilder sb9 = new StringBuilder("capacity test");
        StringBuilder sb10 = new StringBuilder("set length");

        // ========== String Methods ==========
        System.out.println("===== String Methods =====");
       
        System.out.println("1. Length: " + text.length());
      
        System.out.println("2. Char at index 4: " + text.charAt(4));
         
        System.out.println("3. Substring (7-11): " + text.substring(7, 11));
         
        System.out.println("4. Contains 'Java'? " + text.contains(searchText));
         
        System.out.println("5. Equals (case sensitive): " + text.equals(anotherText));
         
        System.out.println("6. Equals ignore case: " + text.equalsIgnoreCase(anotherText));
         
        System.out.println("7. Uppercase: " + text.toUpperCase());
         
        System.out.println("8. Lowercase: " + text.toLowerCase());
         
        System.out.println("9. Trimmed: '" + text.trim() + "'");
         
        System.out.println("10. Replace Java with Python: " + text.replace(searchText, replaceText));
         
        String[] fruits = csvText.split(",");
        System.out.println("11. Split by comma: " + String.join(" | ", fruits));
         
        System.out.println("12. Is empty? " + emptyText.isEmpty());
         
        System.out.println("13. Starts with 'Hello'? " + text.startsWith("Hello"));
         
        System.out.println("14. Ends with 'World!'? " + text.endsWith("World!"));
         
        System.out.println("15. Index of 'Java': " + text.indexOf("Java"));
        
        System.out.println("\n===== StringBuilder Methods =====");
         
        sb.append(" World!");
        System.out.println("1. Append: " + sb);
         
        sb.insert(5, " beautiful");
        System.out.println("2. Insert: " + sb);
         
        sb5.delete(7, 11);
        System.out.println("3. Delete: " + sb5);
         
        sb5.deleteCharAt(0);
        System.out.println("4. Delete char at 0: " + sb5);
         
        System.out.println("5. Reverse: " + sb6.reverse());
         
        sb8.replace(8, 12, "that");
        System.out.println("6. Replace: " + sb8);
         
        sb3.setCharAt(1, 'D');
        System.out.println("7. Set char at: " + sb3);
         
        System.out.println("8. Capacity: " + sb9.capacity());
         
        sb10.setLength(3);
        System.out.println("9. Set length: " + sb10);
         
        System.out.println("10. Substring: " + sb.substring(0, 5));
         
        System.out.println("11. To String: " + sb.toString());
         
        System.out.println("12. Compare: " + sb.compareTo(sb2));
         
        System.out.println("13. Index of 'World': " + sb.indexOf("World"));
         
        System.out.println("14. Last index of 'l': " + sb.lastIndexOf("l"));
         
        System.out.print("15. Chars: ");
        sb.chars().forEach(c -> System.out.print((char)c + " "));
    }
}