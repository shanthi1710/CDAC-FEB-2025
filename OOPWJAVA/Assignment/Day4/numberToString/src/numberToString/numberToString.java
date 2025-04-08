package numberToString;
import java.util.Scanner;

public class numberToString {

	static final String[] units = {
			 "", "One", "Two", "Three", "Four", "Five",
	         "Six", "Seven", "Eight", "Nine", "Ten",
	         "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
	         "Sixteen", "Seventeen", "Eighteen", "Nineteen"
	};
	static final String[] tens= {
			"", "", "Twenty", "Thirty", "Forty", "Fifty",
            "Sixty", "Seventy", "Eighty", "Ninety"	
	};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 0-9999999");
		int num = sc.nextInt();
		if(num>999999 && num<0) {
			System.out.println("Enter input is out of range");
		}else if(num==0){
			System.out.println("Zero");
		}else {
			System.out.println(numberWord(num).trim());
		}
		sc.close();
	}
	public static String numberWord(int num){
		if(num==0)return "";
		String words = "";
		if(num>=1000) {
			words += numberWord(num/1000)+" "+"Thousand"+" ";
			num %=1000;
		}
		if(num>=100) {
			words += units[num/100]+" "+"hundred"+" ";
			num%=100;
		}
		if(num>0){
			if(num<20) {
				words += units[num]+" ";
			}else {
				words+=tens[num/10]+" ";
				if (num % 10 > 0) {
					words += units[num%10] + " ";
				}
			}
		}
		return words;
	}
}
