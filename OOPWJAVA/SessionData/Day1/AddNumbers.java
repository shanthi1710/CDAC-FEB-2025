import java.util.Scanner;
public class AddNumbers
{
	public int add(int a, int b){
		return a + b;
	}
	
	public static void main(String []args) {
		//Get iP form user
		//Ref of Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Please enter 2 no");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		
		AddNumbers addNumbers = new AddNumbers();
		int sum = addNumbers.add(no1, no2);
		System.out.println("\n Sum =" + sum);
		sc.close();
		
	}
}