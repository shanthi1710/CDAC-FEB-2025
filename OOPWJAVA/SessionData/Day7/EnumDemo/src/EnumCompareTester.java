import java.util.Scanner;

public class EnumCompareTester {
	public static void main(String[] args) {
		
		//Compare Enum
		DayEnum day1 = DayEnum.MONDAY;
		DayEnum day2 = DayEnum.MONDAY;
		if( day1 == day2) {
			System.out.println("days are same");
		} else {
			System.out.println("days are not same");
		}
		
		if(day1.equals(day2)) {
			System.out.println("days are equal");
		}
		
		//String and enum comparison
		if("MONDAY".equals(day1.toString())) {
			System.out.println("days are equal");
		}
		
		
	}

}
