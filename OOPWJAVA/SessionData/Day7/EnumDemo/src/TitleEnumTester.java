import java.util.Scanner;

public class TitleEnumTester {
	public static void main(String[] args) {
		TitleEnum titleEnum = TitleEnum.SE;
		System.out.println(titleEnum.getValue());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter title");
		String str = sc.nextLine();
		TitleEnum titleEnum2 = TitleEnum.valueOf(str);
		System.out.println(titleEnum2.getValue());
		sc.close();
		
		
	}
}
