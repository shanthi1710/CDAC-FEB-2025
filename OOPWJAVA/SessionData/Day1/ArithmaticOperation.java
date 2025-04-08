public class ArithmaticOperation {
	public static void main(String []args)
	{
		if (args.length < 2) {
			System.out.println("Please enter at least 2 numbers");
			return;
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int sum = num1 + num2;
		System.out.println("sum=" +sum);
		
		/*System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[0] + args[1]);
		*/
	}
}