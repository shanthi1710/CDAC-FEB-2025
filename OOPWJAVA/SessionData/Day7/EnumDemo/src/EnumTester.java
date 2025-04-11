import java.util.Scanner;

public class EnumTester {
	public static void main(String[] args) {
		//Printing enum
		DayEnum today = DayEnum.FRIDAY;
		System.out.println(today);
		
		//DayEnum today1 = new DayEnum();
		
		//Get String from user and create enum
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter day");
		String str = sc.nextLine();
		DayEnum day = DayEnum.valueOf(str);
		System.out.println(day);
		sc.close();
	}

}
