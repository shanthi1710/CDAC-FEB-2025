public class AddNumbersCommand
{
	public static int add(int a, int b){
		return a + b;
	}
	
	public static void main(String []args) {
		//Get I/P From Command Line
		if( args.length < 2) {
			System.out.println("Insufficient args");
			return;
		}
		//40 <- "40"
		int no1 = Integer.parseInt(args[0]);
		int no2 = Integer.parseInt(args[1]);
			
		int sum = AddNumbersCommand.add(no1, no2);
		System.out.println("\n Sum =" + sum);
	}
}