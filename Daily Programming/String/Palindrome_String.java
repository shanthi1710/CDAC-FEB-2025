import java.util.Scanner;

public class Palindrome_String{
    private static boolean isPalindrome(String s){
        int left =0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:->");
        String s = sc.nextLine();
        boolean res = isPalindrome(s);
        if(res){
            System.out.println("Yes String Is Palindrom");
        }else{
            System.out.println("String is not Palindrom");
        }
    }
}