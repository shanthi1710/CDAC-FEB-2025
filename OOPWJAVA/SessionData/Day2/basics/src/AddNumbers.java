public class AddNumbers {
	public static void main( String args[]) {
		System.out.println("First Number :"+ args[0]);
		System.out.println("Second Number :"+ args[1]);
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		int sum = number1 + number2;
		System.out.println("Sum = " + sum);
	}
}